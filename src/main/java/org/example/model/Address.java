package org.example.model;

import org.hibernate.annotations.JoinColumnOrFormula;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String country;
    private String state;
    private String zipCode;
    private String city;
    private Integer number;
    private String complement;
    private String addressLine;

    // Relacionamento 1 para 1.
    // JoinColumn: Define a coluna que armazenará a chave estrangeira (FK) na tabela Address.
    // name: Nome da coluna no banco de dados.
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
