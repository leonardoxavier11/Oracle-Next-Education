package med.voll.api.dtos.medicos;

import med.voll.api.models.medico.Especialidade;
import med.voll.api.models.medico.Medico;

//Este é o DTO que representa os dados que serão devolvidos no controller.
public record DadosListagemMedico(Long id,String nome, String email, String crm, Especialidade especialidade) {
    public DadosListagemMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}

