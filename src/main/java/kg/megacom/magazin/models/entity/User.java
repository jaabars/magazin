package kg.megacom.magazin.models.entity;


import kg.megacom.magazin.models.enums.UserRole;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    @Enumerated(value = EnumType.STRING)
    private UserRole userRole;


    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;


}
