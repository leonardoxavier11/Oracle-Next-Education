package med.voll.api.dtos.consultas;

import med.voll.api.models.consulta.Consulta;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//public record DadosListagemConsulta(Long id, Medico medico, Paciente paciente, LocalDateTime dataHora) {

//Quero retornar apenas o nome do Medico/Paciente, não o Objeto com todos os atributos.
public record DadosListagemConsulta(Long id, String nomeMedico, String nomePaciente, LocalDate data, LocalTime hora) {
    public DadosListagemConsulta(Consulta consulta) {
        this(consulta.getId(), consulta.getMedico().getNome(), consulta.getPaciente().getNome(), consulta.getDataInicio(),consulta.getHoraInicio());
    }

}
