package orm.testes;

import java.util.Scanner;

import orm.actions.BuscarAluno;
import orm.actions.RemoverAluno;
import orm.modelo.Aluno;

public class TesteRemoveAluno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o id do aluno que deseja remover: ");
		long id = sc.nextLong();
		
		Aluno aluno = BuscarAluno.busca(id);
		
		if (aluno == null) {
			System.out.println("Aluno não encontrado no banco");
		} else {
			RemoverAluno.remover(aluno);
			System.out.println("Aluno removido!");
			
		}
	}

}
