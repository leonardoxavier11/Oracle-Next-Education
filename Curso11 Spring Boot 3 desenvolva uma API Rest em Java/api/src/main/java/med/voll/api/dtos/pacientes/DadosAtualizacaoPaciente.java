package med.voll.api.dtos.pacientes;

import jakarta.validation.constraints.NotNull;
import med.voll.api.models.endereco.Endereco;

public record DadosAtualizacaoPaciente(@NotNull Long id, String nome, String telefone, Endereco endereco) {
}
