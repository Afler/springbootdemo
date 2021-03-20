package group.springbootdemo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "details")
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int quantity;

    private double price;

    private String name;
}
