package med.voll.api.dtos;

import med.voll.api.models.consulta.Consulta;
import med.voll.api.models.medico.Medico;
import med.voll.api.models.paciente.Paciente;

import java.time.LocalDateTime;

public record DadosListagemConsulta(Long id, Medico medico, Paciente paciente, LocalDateTime dataHora) {

    public DadosListagemConsulta(Consulta consulta) {
        this(consulta.getId(), consulta.getMedico(), consulta.getPaciente(), consulta.getDataHora());
    }
}
