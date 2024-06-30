package br.gov.sp.fatec.domain.mapper;

import br.gov.sp.fatec.domain.entity.Cliente;
import br.gov.sp.fatec.domain.request.ClienteRequest;
import br.gov.sp.fatec.domain.response.ClienteResponse;
import org.mapstruct.Mapper;
import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper (componentModel = SPRING)
public interface ClienteMapper {
    Cliente map(ClienteRequest source);

    ClienteResponse map(Cliente source);
}
