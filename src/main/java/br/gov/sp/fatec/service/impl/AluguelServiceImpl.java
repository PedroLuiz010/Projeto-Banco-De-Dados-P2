package br.gov.sp.fatec.service.impl;

import br.gov.sp.fatec.domain.entity.Aluguel;
import br.gov.sp.fatec.domain.mapper.AluguelMapper;
import br.gov.sp.fatec.domain.request.AluguelRequest;
import br.gov.sp.fatec.domain.request.AluguelUpdateRequest;
import br.gov.sp.fatec.domain.response.AluguelResponse;
import br.gov.sp.fatec.repository.AluguelRepository;
import br.gov.sp.fatec.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AluguelServiceImpl implements AluguelService {

    private final AluguelRepository aluguelRepository;
    private final AluguelMapper aluguelMapper;

    @Autowired
    public AluguelServiceImpl(AluguelRepository aluguelRepository, AluguelMapper aluguelMapper) {
        this.aluguelRepository = aluguelRepository;
        this.aluguelMapper = aluguelMapper;
    }

    @Override
    public AluguelResponse save(AluguelRequest request) {
        Aluguel aluguel = aluguelMapper.map(request);
        Aluguel savedAluguel = aluguelRepository.save(aluguel);
        return aluguelMapper.map(savedAluguel);
    }

    @Override
    public List<AluguelResponse> findAll() {
        return aluguelRepository.findAll()
                .stream()
                .map(aluguelMapper::map)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<AluguelResponse> findById(Long id) {
        return aluguelRepository.findById(id)
                .map(aluguelMapper::map);
    }

    @Override
    public void deleteById(Long id) {
        aluguelRepository.deleteById(id);
    }

    @Override
    public void updateById(Long id, AluguelUpdateRequest aluguelUpdateRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateById'");
    }
}

