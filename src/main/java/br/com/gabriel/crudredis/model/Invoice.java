package br.com.gabriel.crudredis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Invoice implements Serializable {

    private static final long serialVersionUID = -4439114469417994311L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invId;

    private String invName;
    private Double invAmount;
}
