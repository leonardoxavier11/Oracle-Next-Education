package med.voll.api.dtos.consultas;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.models.medico.Medico;
import med.voll.api.models.paciente.Paciente;

import java.time.LocalDateTime;

public record DadosCadastroConsulta(@NotNull Long medicoId, @NotNull Long pacienteId, @NotNull LocalDateTime dataHora) {

}
