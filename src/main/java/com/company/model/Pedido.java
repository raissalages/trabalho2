package com.company.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Pedido")
public class Pedido extends Orcamento{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dataEntrega;
    private Boolean pago;
    private Date dataPagamento;
    private TipoPagamento tipoPagamento;
    private Situacao situacao;

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public Boolean getPago() {
        return pago;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}