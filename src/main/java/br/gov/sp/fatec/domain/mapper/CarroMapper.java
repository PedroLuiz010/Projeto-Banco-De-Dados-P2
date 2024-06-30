package br.gov.sp.fatec.domain.mapper;

import br.gov.sp.fatec.domain.entity.Carro;
import br.gov.sp.fatec.domain.request.CarroRequest;
import br.gov.sp.fatec.domain.response.CarroResponse;
import org.mapstruct.Mapper;
import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper (componentModel = SPRING)
public interface CarroMapper {
    Carro map(CarroRequest source);

    CarroResponse map(Carro source);
}