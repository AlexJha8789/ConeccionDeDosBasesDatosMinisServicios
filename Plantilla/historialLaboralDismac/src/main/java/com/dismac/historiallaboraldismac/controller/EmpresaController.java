package com.dismac.historiallaboraldismac.controller;

import com.dismac.historiallaboraldismac.dtos.EmpresaCreateDTO;
import com.dismac.historiallaboraldismac.dtos.EmpresaDTO;
import com.dismac.historiallaboraldismac.dtos.EmpresaUpdateDTO;
import com.dismac.historiallaboraldismac.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpresaController {
    @Autowired
    private EmpresaService empresaService;

    @GetMapping("empresas")
    public ResponseEntity<List<EmpresaDTO>> listarEmpresas(){
        return   new ResponseEntity<>(empresaService.listarEmpresas() ,HttpStatus.OK);
    }
    @GetMapping("/empresas/{empresaId}")
    public ResponseEntity<EmpresaDTO> obtenerEmpresaPorId(@PathVariable("empresaId") long empresaId){
        return  new ResponseEntity<> ( empresaService.obtenerEmpresaPorID(empresaId),HttpStatus.OK);
    }

    @PostMapping("empresas")
    public ResponseEntity<EmpresaDTO> registrarEmpresa(@RequestBody EmpresaCreateDTO empresaCreateDTO){
        return  new ResponseEntity <>( empresaService.registrarEmpresa(empresaCreateDTO) ,HttpStatus.OK);
    }

    @PutMapping("empresas")
    public ResponseEntity<EmpresaDTO> actualizarEmpresa(@RequestBody EmpresaUpdateDTO empresaUpdateDTO){
        return new ResponseEntity<>(empresaService.actualizarEmpresa(empresaUpdateDTO),HttpStatus.OK);
    }

    @DeleteMapping("/empresas/{empresaId}")
    public ResponseEntity<String> eliminarEmpresa(@PathVariable("empresaId") long empresaId) {
        return new ResponseEntity<>( empresaService.eliminarEmpresa(empresaId),HttpStatus.OK);
    }
}
