package com.dismac.historiallaboraldismac.service;

import com.dismac.historiallaboraldismac.dtos.*;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmpresaService {
    List<EmpresaDTO> listarEmpresas();
    EmpresaDTO obtenerEmpresaPorID(long id);
    EmpresaDTO registrarEmpresa(EmpresaCreateDTO empresaCreateDTO);
    EmpresaDTO actualizarEmpresa(EmpresaUpdateDTO empresaUpdateDTO);
    String eliminarEmpresa(long id);
}
