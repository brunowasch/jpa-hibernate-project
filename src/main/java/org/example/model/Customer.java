package org.example.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String cpf;
    private String phone;
    private String email;


    // Relacionamento 1 para 1.
    // MappedBy: Indica que o relacionamento é mapeado pelo atributo "customer" na entidade Address.
    // Cascade: Propaga operações realizadas em Customer para a entidade Address.
    // CascadeType.ALL: Propaga todas as operações (persist, merge, remove, refresh e detach).
    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private Address address;

    // Relacionamento um para muitos: um cliente pode ter vários pedidos
    @OneToMany(mappedBy = "customer")
    private List<Order> orderList;
}
