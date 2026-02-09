package com.github.matheusgabsimoes.DesafioItau;

import lombok.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Transacao {

    // Pode ser "double", porém, "BigDecimal" é mais preciso no contexto monetário
    private BigDecimal valor;
    private OffsetDateTime dataHora;


}