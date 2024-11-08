package com.securitas.contratae.Models;

import java.util.UUID;

import lombok.Data;

@Data
public class Recruiter {
    private String name;
    private String email;
    private String autorization;
    private UUID id;
}
