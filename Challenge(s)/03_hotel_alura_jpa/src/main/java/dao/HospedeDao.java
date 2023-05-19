package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import modelo.Hospede;
import modelo.Reserva;

public class HospedeDao {

	EntityManager em;

	public HospedeDao(EntityManager em) {
		this.em = em;
	}

	public void persistir(Hospede hospede) {
		EntityTransaction transaction = null;

		try {
			transaction = em.getTransaction();
			transaction.begin();

			em.persist(hospede);

			transaction.commit();

			System.out.println("Informações do hospede cadastradas!");
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

}
