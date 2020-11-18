package kg.megacom.magazin.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "prices")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double price;

    private Date startDate;
    private Date endDate;

    private boolean active;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
