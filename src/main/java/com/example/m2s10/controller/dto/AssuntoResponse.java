package com.example.m2s10.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AssuntoResponse {
    private String nome;

    public AssuntoResponse(Long id, String nome) {
    }
}
