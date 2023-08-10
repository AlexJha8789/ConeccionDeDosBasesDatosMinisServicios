package com.dismac.historiallaboraldismac.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tb_historial_laboral")
@Getter
@Setter
public class HistorialLaboral {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_historial")
    private long id;

    @Column(name="fecha_ingreso", nullable = false)
    @Temporal(value=TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaIngreso;

    @Column(name="fecha_cese", nullable = false)
    @Temporal(value=TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaCese;

    @Column(name="puesto", length = 300, nullable = false)
    private String puesto;

    @Column(name="id_empleado")
    private long idEmpleado;

    @ManyToOne
    @JoinColumn(name="id_empresa")
    private Empresa empresa;
}
