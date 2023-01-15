package com.example.m2s10.controller;

import com.example.m2s10.controller.dto.AssuntoRequest;
import com.example.m2s10.controller.dto.AssuntoResponse;
import com.example.m2s10.padroes.DefaultResponse;
import com.example.m2s10.service.AssuntoService;
import com.example.m2s10.padroes.DefaultErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assunto")
public class AssuntoController {

    @GetMapping
    public ResponseEntity<List> buscarTodosOsAssuntos(){
        List<AssuntoResponse> responseList = AssuntoService.buscarTodosOsAssuntos();

        return ResponseEntity.ok(responseList);
    }



    @PostMapping("/assunto")
    public ResponseEntity<List> salvarNota(@RequestBody AssuntoRequest assuntoRequest) {
        AssuntoResponse response = (AssuntoResponse) AssuntoService.salvarAssunto(assuntoRequest);

        return new ResponseEntity<>(
               new DefaultResponse < AssuntoResponse > (
                        HttpStatus.CREATED.value(),
                        response
        ),
        HttpStatus.CREATED
        );
    }
}