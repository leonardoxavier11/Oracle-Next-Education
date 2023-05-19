package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

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
}

