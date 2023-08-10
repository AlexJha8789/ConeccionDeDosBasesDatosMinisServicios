package com.dismac.historiallaboraldismac.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="tb_empresa")
@Getter
@Setter
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_empresa")
    private long id;

    @Column(name="razonSocial", length = 300, nullable = false)
    private String razonSocial;

    @Column(name="ruc", nullable = false)
    private long ruc;
}
