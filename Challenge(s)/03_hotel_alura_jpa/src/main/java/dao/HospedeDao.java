package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

import modelo.Hospede;

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

	// Método para saber se o valor inserido em "busca" é um Long ou String
	public boolean isNumero(String valor) {
		try {
			Long.parseLong(valor);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public boolean verificarExistenciaIdReserva(Long reserva_id) {
		TypedQuery<Long> query = em.createQuery("SELECT COUNT(h.reserva.id) FROM Hospede h WHERE h.reserva.id = :id",
				Long.class);
		query.setParameter("id", reserva_id);
		Long count = query.getSingleResult();
		return count > 0;
	}

	public boolean verificarExistenciaNome(String nome) {
		TypedQuery<Long> query = em.createQuery("SELECT COUNT(h.nome) FROM Hospede h WHERE h.nome = :nome", Long.class);
		query.setParameter("nome", nome);
		Long count = query.getSingleResult();
		return count > 0;
	}

	// Posso ter mais de um hospede na reserva, então devo retornando uma List
	public Hospede buscarPorIdDaReserva(Long reserva_id) {
		TypedQuery<Hospede> query = em.createQuery("SELECT h FROM Hospede h WHERE h.reserva.id = :id", Hospede.class);
		query.setParameter("id", reserva_id);

		return query.getSingleResult();
	}

	public Hospede buscarPorNome(String nome) {
		TypedQuery<Hospede> query = em
				.createQuery("SELECT h FROM Hospede h JOIN FETCH h.reserva r WHERE h.nome = :nome", Hospede.class);
		query.setParameter("nome", nome);

		try {
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null; // Retorna null se nenhum hospede for encontrado com o nome especificado
		}
	}

	public void editarHospede(Hospede hospede) {

		try {
			em.getTransaction().begin();
			em.merge(hospede);
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

	public void deletarHospede(Hospede hospede) {

		try {
			em.getTransaction().begin();
			em.remove(hospede);
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
