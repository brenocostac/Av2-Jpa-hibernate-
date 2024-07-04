package orm.testes;

import java.util.Scanner;

import orm.actions.AtualizarAluno;
import orm.actions.BuscarAluno;
import orm.modelo.Aluno;

public class TesteAtualizaAluno {
	
	private static Scanner sc = new Scanner(System.in);
	private static Aluno aluno = new Aluno();

	
	public static void main(String[] args) {
			
		System.out.print("Insira o id do aluno que deseja atualizar: ");
		long id = sc.nextLong();

		aluno = BuscarAluno.busca(id);
		
		if (aluno == null) {
			System.out.println("Aluno não encontrado no banco");
		} else {
			sc.nextLine();
			String opcao = exibirMenu();

			switch (opcao) {
			case "1":
				atualizaNome();
					
				AtualizaAluno();
				break;
					
			case "2":
				atualizaEmail();
					
				AtualizaAluno();
				break;
		
			case "3":
				atualizaCpf();
					
				AtualizaAluno();
				break;
					
					
			case "4":
				atualizaEndereco();
					
				AtualizaAluno();
				break;
					
			case "5":
				atualizaNaturalidade();
					
				AtualizaAluno();
				break;
					
			case "6":
				atualizaDataDeNascimento();
					
				AtualizaAluno();
				break;
					
			case "7":
				atualizaNome();
				atualizaEmail();
				atualizaCpf();
				atualizaEndereco();
				atualizaNaturalidade();
				atualizaDataDeNascimento();
					
				AtualizaAluno();
				break;
					
			default:
				System.out.println("\nOpção inválida");
				break;
				}
			}
}
	
		
	private static String exibirMenu() {
			System.out.println("""
					ESCOLHA UMA OPÇÃO:
					1 - Atualizar nome
					2 - Atualizar e-mail
					3 - Atualizar cpf
					4 - Atualizar endereço
					5 - Atualizar naturalidade
					6 - Atualizar data de nascimento
					7 - Atualizar tudo

					""");
			return sc.nextLine();
	}
	
	private static void clearBuffer(Scanner scanner){
        if (scanner.hasNextLine()) {
            scanner.nextLine();
    }}
	

	
	private static void atualizaNome() {
		System.out.print("Nome: ");
		aluno.setNome(sc.nextLine());
	}
	
	private static void atualizaEmail() {
		System.out.print("Email: ");
		aluno.setEmail(sc.nextLine());
	}
	
	private static void atualizaCpf() {
		while (true) {
			System.out.print("Cpf (11 digitos sem pontuação): ");
			String cpf = sc.nextLine();
			if (cpf.length() == 11) {
				aluno.setCpf(cpf);
				break;
			}
		}
	}
	
	private static void atualizaEndereco() {
		System.out.print("Endereco: ");
		aluno.setEndereco(sc.nextLine());
	}
	
	private static void atualizaNaturalidade() {
		System.out.print("Naturalidade: ");
		aluno.setNaturalidade(sc.nextLine());
	}
	
	private static void atualizaDataDeNascimento() {
		System.out.print("Digite a nova data de nascimento (dd/MM/yyyy): ");
		aluno.setDataNascimento(sc.nextLine());
	}
	
	private static void AtualizaAluno() {
		AtualizarAluno.atualiza(aluno);
		System.out.println("Aluno atualizado no banco");
	}
	
	

}
