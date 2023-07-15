package com.alunoonline.api.model.dtos;

import com.alunoonline.api.validator.EmailValidation;
import lombok.Data;

@Data
public class AlunoDTO {
    private Long id;
    private String nome;
    @EmailValidation
    private String email;
    private String curso;
}
