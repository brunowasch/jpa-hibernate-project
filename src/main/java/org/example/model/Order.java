package org.example.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double value;
    private String date;

    // Relacionamento Muitos para Um
    // JoinColumn: Define a coluna que armazenará a chave estrangeira (FK) na tabela Order.
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<ProductOrder> productOrderList;
}
