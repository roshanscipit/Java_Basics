package com.demo;

import com.demo.entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting relationship-demo...");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("relationship-demo");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            // OneToOne
            Person p = new Person();
            p.setName("Alice");
            Address a = new Address();
            a.setStreet("123 Main St");
            a.setCity("Townsville");
            p.setAddress(a);
            em.persist(p);

            // OneToMany / ManyToOne
            Department dept = new Department();
            dept.setName("Engineering");
            em.persist(dept);

            Employee e1 = new Employee();
            e1.setName("John");
            e1.setDepartment(dept);
            em.persist(e1);

            Employee e2 = new Employee();
            e2.setName("Jane");
            e2.setDepartment(dept);
            em.persist(e2);

            // ManyToMany
            Student s1 = new Student();
            s1.setName("Student A");
            Student s2 = new Student();
            s2.setName("Student B");

            Course c1 = new Course();
            c1.setTitle("Math");
            Course c2 = new Course();
            c2.setTitle("Physics");

            s1.getCourses().add(c1);
            s1.getCourses().add(c2);
            s2.getCourses().add(c1);

            em.persist(c1);
            em.persist(c2);
            em.persist(s1);
            em.persist(s2);

            em.getTransaction().commit();

            System.out.println("Data persisted. Querying back to verify...");

            // quick verification
            Person found = em.find(Person.class, p.getId());
            System.out.println("Found person: " + found.getName() + ", city=" + found.getAddress().getCity());

            Department foundDept = em.find(Department.class, dept.getId());
            System.out.println("Department " + foundDept.getName() + " has employees: " + foundDept.getEmployees().size());

        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            emf.close();
        }

        System.out.println("Done.");
    }
}
