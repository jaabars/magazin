package kg.megacom.magazin.models.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "operation_details")
public class OperationDetail {

    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "price_id")
    private Price price;

    //количество товара
    private int amount;

    //общая стоимость amount*price.price
    private double totalCost;

    @ManyToOne
    @JoinColumn(name = "operation_id")
    private Operation operation;
}
