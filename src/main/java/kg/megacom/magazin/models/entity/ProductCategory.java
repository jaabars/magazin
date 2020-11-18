package kg.megacom.magazin.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product_categories")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_category_id")
    private ProductCategory productCategory;
}
