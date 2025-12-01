package com.jpa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");

        EntityManager em = emf.createEntityManager();

        System.out.println("Entity Manager created successfully.");

        // Create and persist an employee
        try {
            em.getTransaction().begin();
            
            Employee emp = new Employee();
            emp.setName("John Doe");
            emp.setDepartment("IT");
            
            em.persist(emp);
            em.getTransaction().commit();
            
            System.out.println("Employee saved successfully!");
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Error: " + e.getMessage());
        } finally {
            em.close();
            emf.close();
        }
    }
}