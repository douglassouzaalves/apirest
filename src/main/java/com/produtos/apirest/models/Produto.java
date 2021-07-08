package com.produtos.apirest.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Table(name = "TB_PRODUTO") //personalizando
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private BigDecimal quantidade;
    private BigDecimal valor;

}
