package med.voll.api.domain.consulta;

import jakarta.validation.constraints.NotNull;

public record DadosCancelamentoDaConsulta(
        @NotNull
        Long id_Consulta,
        @NotNull
        MotivoCancelamento motivo) {

}

