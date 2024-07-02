package br.gov.sp.fatec.domain.request;
import lombok.Builder;

@Builder
public record ClienteUpdateRequest(
    Long id,
    String cpf,
    String telefone,
    String nome
) {}
