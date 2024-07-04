package orm.testes;

import java.util.List;

import orm.actions.BuscarAlunos;
import orm.modelo.Aluno;

public class TestaBuscarAlunos {
	
	public static void main(String[] args) {
		List<Aluno> alunos = BuscarAlunos.busca();

		
		if (alunos.isEmpty()) {
			System.out.println("Nenhum aluno cadastrado!");
		} else {
			System.out.println("Alunos encontrados: ");
			alunos.stream().forEach(System.out::println);
		}
		
	}

}
