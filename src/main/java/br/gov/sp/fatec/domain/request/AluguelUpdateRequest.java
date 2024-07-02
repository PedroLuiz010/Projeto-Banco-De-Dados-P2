package br.gov.sp.fatec.domain.request;

import br.gov.sp.fatec.domain.entity.Carro;
import br.gov.sp.fatec.domain.entity.Cliente;
import br.gov.sp.fatec.domain.enums.AluguelStatus;
import lombok.Builder;

import java.util.Date;

@Builder
public record AluguelUpdateRequest(
        AluguelStatus status,
        Date dataInicio,
        Date dataFim,
        Double valor,
        Carro carro,
        Cliente cliente
) {}
