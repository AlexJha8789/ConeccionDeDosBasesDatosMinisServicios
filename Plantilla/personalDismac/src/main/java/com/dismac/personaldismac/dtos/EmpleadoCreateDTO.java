package com.dismac.personaldismac.dtos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class EmpleadoCreateDTO {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String direccion;
    private BigDecimal salario;
    private Date fechaIngreso;
    private  List<HistorialLaboralDTO> historialLaboral;
}
