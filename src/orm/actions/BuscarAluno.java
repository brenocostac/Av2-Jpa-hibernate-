package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Aluno;


public class BuscarAluno {
	public static Aluno busca(long id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		Aluno aluno = manager.find(Aluno.class, id);
		
		manager.close();
		factory.close();
		
		return aluno;
	}
	
}
