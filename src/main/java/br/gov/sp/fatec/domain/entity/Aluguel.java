package br.gov.sp.fatec.domain.entity;

import br.gov.sp.fatec.domain.enums.AluguelStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Aluguel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private AluguelStatus aluguelStatus;

    private  double valor;


    @OneToOne(mappedBy = "cliente")
    private Cliente cliente;

    @ManyToMany(mappedBy = "carro")
    private List<Carro> carros;

    public void setCreatedAt(Date dataInicio) {
        throw new UnsupportedOperationException("Unimplemented method 'setCreatedAt'");
    }

    public void setUpdatedAt(Date dataFim) {
        throw new UnsupportedOperationException("Unimplemented method 'setUpdatedAt'");
    }

}

