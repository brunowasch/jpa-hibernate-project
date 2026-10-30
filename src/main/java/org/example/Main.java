package org.example;

import javax.persistence.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args) {
       // EntityManagerFactory cria instâncias do EntityManager, "fabrica" o gerenciador de entidades
       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("projeto-jpa");
       // EntityManager é o gerenciador de entidades e realiza operações no banco de dados
       EntityManager entityManager = entityManagerFactory.createEntityManager();

       System.out.println("JPA connection initialized successfully!");
       // Inicia a transação no banco de dados
       entityManager.getTransaction().begin();

       entityManager.close();
       entityManagerFactory.close();
   }
}
