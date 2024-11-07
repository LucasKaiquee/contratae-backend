package com.securitas.contratae.Models;


import lombok.Data;

import java.util.UUID;

@Data
public class Candidate {
    private String nome;
    private String email;

    private UUID id;

    private String username;
    private String password;

    private Object curriculum;

    private String cpf;

}

