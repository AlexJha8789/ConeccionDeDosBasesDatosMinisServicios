package com.dismac.historiallaboraldismac.mappers;

import com.dismac.historiallaboraldismac.dtos.HistorialLaboralCreateDTO;
import com.dismac.historiallaboraldismac.dtos.HistorialLaboralDTO;
import com.dismac.historiallaboraldismac.dtos.HistorialLaboralUpdateDTO;
import com.dismac.historiallaboraldismac.model.HistorialLaboral;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface HistorialLaboralMapper {
    HistorialLaboralMapper instancia= Mappers.getMapper(HistorialLaboralMapper.class);


    List<HistorialLaboralDTO> listaHistorialLaboralAListaHistorialLaboralDTO(List<HistorialLaboral> lista);

    HistorialLaboralDTO historialLaboralAHistorialLaboralDTO(HistorialLaboral historia);

    HistorialLaboral historialCreateDTOAHistorialLaboral(HistorialLaboralCreateDTO historialCreateDTO);

    HistorialLaboral historialUpdateDTOAHistorialLaboral(HistorialLaboralUpdateDTO historialUpdateDTO);
}
