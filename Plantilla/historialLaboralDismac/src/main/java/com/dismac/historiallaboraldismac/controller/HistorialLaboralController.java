package com.dismac.historiallaboraldismac.controller;


import com.dismac.historiallaboraldismac.dtos.HistorialLaboralCreateDTO;
import com.dismac.historiallaboraldismac.dtos.HistorialLaboralDTO;
import com.dismac.historiallaboraldismac.dtos.HistorialLaboralUpdateDTO;
import com.dismac.historiallaboraldismac.service.HistorialLaboralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class HistorialLaboralController {
    @Autowired
    private HistorialLaboralService historialLaboralService;


    @GetMapping("/historiales/empleados/{empleadoId}")
    public ResponseEntity<List<HistorialLaboralDTO>> listarHistorialLaboralPorIdEmpleado(@PathVariable("empleadoId")  long empleadoId){
        return  new ResponseEntity<>( historialLaboralService.listarHistorialLaboralPorIdEmpleado(empleadoId) , HttpStatus.OK);
    }

    @GetMapping("/historiales/{historialId}")
    public ResponseEntity<HistorialLaboralDTO> obtenerHistorialLaboralPorId(@PathVariable("historialId") long historialId){
        return  new ResponseEntity<> ( historialLaboralService.obtenerHistorialLaboralPorID(historialId),HttpStatus.OK);
    }

    @PostMapping("historiales")
    public ResponseEntity<HistorialLaboralDTO> registrarHistorialLaboral(@RequestBody HistorialLaboralCreateDTO historialLaboralCreateDTO){
        return  new ResponseEntity <>( historialLaboralService.registrarHistorialLaboral(historialLaboralCreateDTO) ,HttpStatus.OK);
    }

    @PutMapping("historiales")
    public ResponseEntity<HistorialLaboralDTO> actualizarHistorialLaboral(@RequestBody HistorialLaboralUpdateDTO historialLaboralUpdateDTO){
        return new ResponseEntity<>(historialLaboralService.actualizarHistorialLaboral(historialLaboralUpdateDTO),HttpStatus.OK);
    }

    @DeleteMapping("/historiales/{historialId}")
    public ResponseEntity<String> eliminarHistorialLaboral(@PathVariable("historialId") long historialId) {
        return new ResponseEntity<>( historialLaboralService.eliminarHistorialLaboral(historialId),HttpStatus.OK);
    }

}
