package testes;

import javax.persistence.EntityManager;

import dao.UserDao;
import modelo.User;
import util.JPAUtil;

public class teste {

	public static void main(String[] args) {
		
		//Login Usuario 
		User usuario = new User("Leonardo", "1234");

		EntityManager em = JPAUtil.getEntityManager();

		UserDao userDao = new UserDao(em);

		userDao.persistir(usuario);
		
		//Escolha reserva
		
	}

}
