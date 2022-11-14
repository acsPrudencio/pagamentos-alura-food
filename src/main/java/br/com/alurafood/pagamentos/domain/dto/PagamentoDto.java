package br.com.alurafood.pagamentos.domain.dto;

import br.com.alurafood.pagamentos.domain.enums.StatusEnum;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class PagamentoDto {
    private Long id;
    private BigDecimal valor;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;
    private StatusEnum status;
    private Long formaDePagamentoId;
    private Long pedidoId;
}
