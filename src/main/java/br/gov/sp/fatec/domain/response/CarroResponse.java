package br.gov.sp.fatec.domain.response;

import java.time.LocalDate;

import br.gov.sp.fatec.domain.entity.Carro;
import br.gov.sp.fatec.domain.entity.Cliente;
import br.gov.sp.fatec.domain.enums.AluguelStatus;

public record CarroResponse(
        Long id,
        AluguelStatus status,
        LocalDate dataFim,
        Double valor,
        Carro carro,
        LocalDate dataInicio,
        Cliente cliente
       
) {}

