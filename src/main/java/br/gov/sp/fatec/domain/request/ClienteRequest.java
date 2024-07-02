package br.gov.sp.fatec.domain.request;

import lombok.Builder;

@Builder
public record ClienteRequest(
        Long id,
        String cpf,
        String telefone,
        String nome     
) {}

