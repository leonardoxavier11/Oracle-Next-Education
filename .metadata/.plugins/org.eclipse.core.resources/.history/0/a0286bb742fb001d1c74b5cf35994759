package dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import modelo.User;

public class UserDao {

	EntityManager em;

	public UserDao(EntityManager em) {
		this.em = em;
	}

	public void persistir(User user) {
		try {
			em.getTransaction().begin();

			em.persist(user);

			em.getTransaction().commit();

			System.out.println("Usuário criado e cadastrado no BD!");
		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
		}
	}

	public boolean verificarSeJaExiste(String nome) {
		TypedQuery<Long> query = em.createQuery("SELECT COUNT(u) FROM User u WHERE u.usuario = :username", Long.class);
		query.setParameter("username", nome);

		try {
			Long count = query.getSingleResult();
			return count > 0;
		} catch (NoResultException e) {
			return false;
		}
	}

	public boolean checkPasswordCorrect(String username, String password) {
		TypedQuery<Long> query = em.createQuery(
				"SELECT COUNT(u) FROM User u WHERE u.usuario = :username AND u.senha = :password", Long.class);
		query.setParameter("username", username);
		query.setParameter("password", password);

		try {
			Long count = query.getSingleResult();
			return count > 0;
		} catch (NoResultException e) {
			return false;
		}
	}

	public Long retornarId(String usuario) {
		TypedQuery<Long> query = em.createQuery("SELECT u.id FROM User u WHERE u.usuario = :username", Long.class);
		query.setParameter("username", usuario);

		try {
			Long id = query.getSingleResult();
			System.out.println("O id é " + id);
			return id;
		} catch (NoResultException e) {
			return 404L; // ou algum valor de erro, caso a consulta não retorne nenhum resultado
		}
	}
}
