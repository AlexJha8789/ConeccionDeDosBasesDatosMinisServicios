package com.dismac.historiallaboraldismac.service;


import com.dismac.historiallaboraldismac.dtos.*;
import com.dismac.historiallaboraldismac.mappers.EmpresaMapper;
import com.dismac.historiallaboraldismac.model.Empresa;
import com.dismac.historiallaboraldismac.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaServiceImpl implements EmpresaService{
    @Autowired
    private EmpresaRepository empresaRepository;


    @Override
    public List<EmpresaDTO> listarEmpresas() {
        return EmpresaMapper.instancia.listaEmpresaAListaEmpresaDTO( empresaRepository.findAll());
    }

    @Override
    public EmpresaDTO obtenerEmpresaPorID(long id) {

        Optional<Empresa> empresaOptional = empresaRepository.findById(id);
        EmpresaDTO empresaDTO = null;
        if (empresaOptional.isPresent()) {
            Empresa historia = empresaOptional.get();
            empresaDTO = EmpresaMapper.instancia.empresaAEmpresaDTO(historia);
        }
        return empresaDTO;
    }


    @Override
    public EmpresaDTO registrarEmpresa(EmpresaCreateDTO empresaCreateDTO) {
        Empresa empresa= EmpresaMapper.instancia.empresaCreateDTOAEmpresa(empresaCreateDTO);
        Empresa respuestaEntity=empresaRepository.save(empresa);
        EmpresaDTO respuestaDTO= EmpresaMapper.instancia.empresaAEmpresaDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public EmpresaDTO actualizarEmpresa(EmpresaUpdateDTO empresaUpdateDTO) {
        Empresa empresa= EmpresaMapper.instancia.empresaUpdateDTOAEmpresa(empresaUpdateDTO);
        Empresa respuestaEntity=empresaRepository.save(empresa);
        EmpresaDTO respuestaDTO= EmpresaMapper.instancia.empresaAEmpresaDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public String eliminarEmpresa(long id) {
        boolean empresaExistente = empresaRepository.existsById(id);
        String resultado = "";
        if (empresaExistente) {
            empresaRepository.deleteById(id);
            resultado = "Registro Eliminado";
        } else {
            resultado = "No se pudo realizar la eliminación";
        }
        return resultado;
    }
}
