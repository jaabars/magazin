package kg.megacom.magazin.models.entity;

import kg.megacom.magazin.models.enums.OperationType;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name ="operations")
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //сотрудник магазина
    @ManyToOne
    @JoinColumn(name = "shop_worker_id")
    private User shopWorker;


    //клиет или поставщик
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    //общая сумма стоимости всех товаров
    private double totalCost;

    //сумма которую отдал клиент
    private double actualSum;

    //разница между общей стоимостью товаров и суммы клиента
    //difference = actualSum - totalCost
    //если разница отрицательное значение, то это значение записывается в долговую книжку class kg.megacom.magazin.models.entity.DebtBook поле sum
    private double difference;

    private Date addDate;

    @Enumerated(value = EnumType.STRING)
    private OperationType operationType;




}
