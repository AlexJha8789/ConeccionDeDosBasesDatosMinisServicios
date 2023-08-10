package com.dismac.personaldismac.feingClient;


import com.dismac.personaldismac.config.FeignClientConfig;
import com.dismac.personaldismac.dtos.HistorialLaboralDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name="historial-laboral-api", url="http://localhost:8080/api/historiales", configuration = FeignClientConfig.class)
public interface HistorialLaboralFeignClient {

    @GetMapping("/empleados/{empladoId}")
    List<HistorialLaboralDTO> obtenerHistorialLaboralPorIdEmpleado(@PathVariable("empleadoId") Long empleadoId);

    @PostMapping()
    HistorialLaboralDTO registrarHistorialLaboral(HistorialLaboralDTO historialLaboralDTO);
}
