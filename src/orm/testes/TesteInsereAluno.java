package orm.testes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import orm.actions.InserirAluno;
import orm.modelo.Aluno;

public class TesteInsereAluno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Nome: ");
		aluno.setNome(sc.nextLine());
		
		while (true) {
			System.out.print("Cpf (11 digitos sem pontos ou traços): ");
			String cpf = sc.nextLine();
			if (cpf.length() == 11) {
				aluno.setCpf(cpf);
				break;
			}
		}
		
		System.out.print("Email: ");
		aluno.setEmail(sc.nextLine());
		
		System.out.print("Endereco: ");
		aluno.setEndereco(sc.nextLine());
		
		System.out.print("Naturalidade: ");
		aluno.setNaturalidade(sc.nextLine());

		System.out.print("Digite a nova data de nascimento (dd/MM/yyyy): ");
		aluno.setDataNascimento(sc.nextLine());
		
		InserirAluno.inserir(aluno);
	
	}

}
