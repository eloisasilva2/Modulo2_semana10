package com.example.m2s10.padroes;

import lombok.*;
import org.springframework.stereotype.Service;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DefaultErrorResponse {

    private int status;
    private String message;
    private Throwable cause;
}