package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

import modelo.Hospede;
import modelo.Reserva;

public class ReservaDao {

	EntityManager em;

	public ReservaDao(EntityManager em) {
		this.em = em;
	}

	public void persistir(Reserva reserva) {
		EntityTransaction transaction = null;

		try {
			transaction = em.getTransaction();
			transaction.begin();

			em.persist(reserva);

			transaction.commit();

			System.out.println("Informações da reserva cadastradas!");
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void persistirFormaPagamento(Reserva reserva) {

	}

	public Reserva buscarPorId(Long id) {
		return em.find(Reserva.class, id);
	}

	public void deletarReserva(Reserva reserva) {

		try {
			em.getTransaction().begin();
			em.remove(reserva);
			em.getTransaction().commit();

			JOptionPane.showMessageDialog(null, "As alterações foram salvas com sucesso.", "Alterações Salvas",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception ex) {
			em.getTransaction().rollback();
			JOptionPane.showMessageDialog(null, "Erro ao salvar as alterações: " + ex.getMessage(), "Erro",
					JOptionPane.ERROR_MESSAGE);
		} finally {
			em.close();
		}
	}
}
