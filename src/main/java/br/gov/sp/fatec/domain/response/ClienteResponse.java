package br.gov.sp.fatec.domain.response;

public record ClienteResponse(
        Long id,
        String cpf,
        String telefone,
        String nome    
) {}

