package kg.megacom.magazin.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "debt_book")
public class DebtBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double sum;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
