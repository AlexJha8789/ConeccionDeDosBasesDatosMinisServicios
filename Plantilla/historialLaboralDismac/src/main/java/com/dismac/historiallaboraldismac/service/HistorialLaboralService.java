package com.dismac.historiallaboraldismac.service;

import com.dismac.historiallaboraldismac.dtos.HistorialLaboralCreateDTO;
import com.dismac.historiallaboraldismac.dtos.HistorialLaboralDTO;
import com.dismac.historiallaboraldismac.dtos.HistorialLaboralUpdateDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface HistorialLaboralService {
    List<HistorialLaboralDTO> listarHistorialLaboralPorIdEmpleado(long empleadoId);
    HistorialLaboralDTO obtenerHistorialLaboralPorID(long id);
    HistorialLaboralDTO registrarHistorialLaboral(HistorialLaboralCreateDTO historialCreateDTO);
    HistorialLaboralDTO actualizarHistorialLaboral(HistorialLaboralUpdateDTO historialUpdateDTO);
    String eliminarHistorialLaboral(long id);


}
