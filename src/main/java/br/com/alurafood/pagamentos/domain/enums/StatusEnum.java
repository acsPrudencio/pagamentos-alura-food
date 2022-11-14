package br.com.alurafood.pagamentos.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.ValidationException;
@Getter
@AllArgsConstructor
public enum StatusEnum {
    CRIADO("Criado"),
    CONFIRMADO("Confirmado"),
    CANCELADO("Cancelado");

    private String descricao;

    public static StatusEnum valueOfDescricao(String descricao) throws ValidationException {
        for(StatusEnum ts : values()){
            if(ts.getDescricao().equalsIgnoreCase(descricao))
                return ts;
        }
        throw new ValidationException("Valor invalido para o campo Status");
    }
}
