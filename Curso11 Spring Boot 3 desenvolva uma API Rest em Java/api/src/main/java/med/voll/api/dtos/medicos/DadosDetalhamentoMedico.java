package med.voll.api.dtos.medicos;

import med.voll.api.models.endereco.Endereco;
import med.voll.api.models.medico.Medico;
import med.voll.api.models.medico.Especialidade;

public record DadosDetalhamentoMedico(Long id, String nome, String email, String crm, String telefone,
                                      Especialidade especialidade, Endereco endereco) {

    public DadosDetalhamentoMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }
}
