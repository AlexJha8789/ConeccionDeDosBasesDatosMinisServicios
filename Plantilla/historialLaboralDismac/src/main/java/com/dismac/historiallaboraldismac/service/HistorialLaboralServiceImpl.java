package com.dismac.historiallaboraldismac.service;

import com.dismac.historiallaboraldismac.dtos.HistorialLaboralCreateDTO;
import com.dismac.historiallaboraldismac.dtos.HistorialLaboralDTO;
import com.dismac.historiallaboraldismac.dtos.HistorialLaboralUpdateDTO;
import com.dismac.historiallaboraldismac.mappers.HistorialLaboralMapper;
import com.dismac.historiallaboraldismac.model.HistorialLaboral;
import com.dismac.historiallaboraldismac.repository.HistorialLaboraLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistorialLaboralServiceImpl implements HistorialLaboralService{

    @Autowired
    private HistorialLaboraLRepository historialLaboraLRepository;



    @Override
    public List<HistorialLaboralDTO> listarHistorialLaboralPorIdEmpleado(long empleadoId) {
        return HistorialLaboralMapper.instancia.listaHistorialLaboralAListaHistorialLaboralDTO(historialLaboraLRepository.findAllByIdEmpleado(empleadoId)) ;
    }

    @Override
    public HistorialLaboralDTO obtenerHistorialLaboralPorID(long id) {
        Optional<HistorialLaboral> historiaOptional = historialLaboraLRepository.findById(id);
        HistorialLaboralDTO historialLaboralDTO = null;
        if (historiaOptional.isPresent()) {
            HistorialLaboral historia = historiaOptional.get();
            historialLaboralDTO = HistorialLaboralMapper.instancia.historialLaboralAHistorialLaboralDTO(historia);
        }
        return historialLaboralDTO;
    }

    @Override
    public HistorialLaboralDTO registrarHistorialLaboral(HistorialLaboralCreateDTO historialCreateDTO) {
        HistorialLaboral historia= HistorialLaboralMapper.instancia.historialCreateDTOAHistorialLaboral(historialCreateDTO);
        HistorialLaboral respuestaEntity=historialLaboraLRepository.save(historia);
        HistorialLaboralDTO respuestaDTO= HistorialLaboralMapper.instancia.historialLaboralAHistorialLaboralDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public HistorialLaboralDTO actualizarHistorialLaboral(HistorialLaboralUpdateDTO historialUpdateDTO) {
        HistorialLaboral historia= HistorialLaboralMapper.instancia.historialUpdateDTOAHistorialLaboral(historialUpdateDTO);
        HistorialLaboral respuestaEntity=historialLaboraLRepository.save(historia);
        HistorialLaboralDTO respuestaDTO= HistorialLaboralMapper.instancia.historialLaboralAHistorialLaboralDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public String eliminarHistorialLaboral(long id) {
        boolean historialExistente = historialLaboraLRepository.existsById(id);
        String resultado = "";
        if (historialExistente) {
            historialLaboraLRepository.deleteById(id);
            resultado = "Registro Eliminado";
        } else {
            resultado = "No se pudo realizar la eliminación";
        }
        return resultado;
    }
}
