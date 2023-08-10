package com.dismac.historiallaboraldismac.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class HistorialLaboralDTO {

    private Long id;

    private Date fechaIngreso;

    private Date fechaCese;

    private String puesto;

    private Long idEmpleado;

    private EmpresaDTO empresa;
}
