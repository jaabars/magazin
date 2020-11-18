package kg.megacom.magazin.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "user_logs")
public class UserLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String action;

    private Date addDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
