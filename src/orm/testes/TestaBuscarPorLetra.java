package orm.testes;

import java.util.List;
import java.util.Scanner;

import orm.actions.BuscarUmAlunoPorLetra;
import orm.modelo.Aluno;

public class TestaBuscarPorLetra {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a letra inicial do aluno para busca:  ");
		String letra = sc.nextLine();
		
		List<Aluno> alunos = BuscarUmAlunoPorLetra.buscaLetra(letra);

		
		if (alunos.isEmpty()) {
			System.out.println("Nenhum aluno com essa inicial!");
		} else {
			System.out.println("Alunos encontrados com nome iniciado por " + letra.toUpperCase() + " : ");
			alunos.stream().forEach(System.out::println);
		}
	}
	
	

}
