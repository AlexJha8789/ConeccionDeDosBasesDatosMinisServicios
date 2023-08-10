package com.dismac.historiallaboraldismac.mappers;

import com.dismac.historiallaboraldismac.dtos.*;
import com.dismac.historiallaboraldismac.model.Empresa;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EmpresaMapper {

    EmpresaMapper instancia= Mappers.getMapper(EmpresaMapper.class);

    List<EmpresaDTO> listaEmpresaAListaEmpresaDTO(List<Empresa> lista);

    EmpresaDTO empresaAEmpresaDTO(Empresa empresa);

    Empresa empresaCreateDTOAEmpresa(EmpresaCreateDTO empresaCreateDTO);

    Empresa empresaUpdateDTOAEmpresa(EmpresaUpdateDTO empresaUpdateDTO);
}
