package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Aluno;

public class RemoverAluno {
	public static void remover(Aluno aluno) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.remove(manager.contains(aluno) ? aluno : manager.merge(aluno)); 
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
		
		
	}
}
