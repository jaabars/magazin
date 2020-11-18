package kg.megacom.magazin.models.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Date expirationDate;

    private int minCount;
    private int maxCount;

    private String qrCode;

    @ManyToOne
    @JoinColumn(name = "product_category_id")
    private ProductCategory productCategory;


    //поставщик
    @ManyToOne
    @JoinColumn(name = "user_provider_id")
    private User userProvider;
}
