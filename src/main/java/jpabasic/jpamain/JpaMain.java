package jpabasic.jpamain;

import jpabasic.Order;
import jpabasic.OrderItem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager entityManager = emf.createEntityManager();

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        try{

//            Order order = new Order();
//            entityManager.persist(order);
//
//            OrderItem orderItem = new OrderItem();
//            orderItem.setOrders(order);
//
//            entityManager.persist(orderItem);

            tx.commit();

        }catch (Exception e){
            tx.rollback();
        }finally {
            entityManager.close();
        }
        emf.close();


    }
}
