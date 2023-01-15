package com.example.m2s10.service;

import com.example.m2s10.controller.dto.AssuntoRequest;
import com.example.m2s10.controller.dto.AssuntoResponse;
import com.example.m2s10.dataprovider.entity.AssuntoEntity;
import com.example.m2s10.dataprovider.repository.AssuntoRepository;
import com.example.m2s10.dataprovider.repository.PerguntasRepository;
import com.example.m2s10.dataprovider.repository.RespostaRepository;

import java.util.ArrayList;
import java.util.List;


public class AssuntoService {

    private static AssuntoRepository assuntoRepository;
    private PerguntasRepository perguntasRepository;
    private RespostaRepository respostaRepository;

    public void AssuntoController(
            AssuntoRepository assuntoRepository,
            PerguntasRepository perguntasRepository,
            RespostaRepository respostaRepository) {

        this.assuntoRepository = assuntoRepository;
        this.perguntasRepository = perguntasRepository;
        this.respostaRepository = respostaRepository;
    }

    public void List<AssuntoResponse> buscarTodosOsAssuntos() {
        List<AssuntoEntity> entityList = AssuntoRepository.findAll();

        List<AssuntoResponse> responseList = new ArrayList<>();

        for (AssuntoEntity entity : entityList) {
            responseList.add(
                    new AssuntoResponse(
                            entity.getId(),
                            entity.getNome()));
        }

        return responseList;
    }


    public static List<AssuntoResponse> salvarAssunto(AssuntoRequest assuntoRequest) {
        List<AssuntoEntity> entityList = assuntoRepository.findAll();

        List<AssuntoResponse> responseList = new ArrayList<>();

        for (AssuntoEntity entity : entityList) {
            responseList.add(
                    new AssuntoResponse(
                            entity.getId(),
                            entity.getNome()));
        }

        return responseList;
    }

}
