package med.voll.api.models.consulta;


import jakarta.persistence.*;
import lombok.*;
import med.voll.api.dtos.consultas.DadosCadastroConsulta;
import med.voll.api.models.medico.Medico;
import med.voll.api.models.paciente.Paciente;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "consultas")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;
    private LocalDate dataInicio;
    private LocalTime horaInicio;
    //    private Boolean realizada = false;
    private LocalDate dataFim;
    private LocalTime horaFim;

    //Horarios permitido para inicio/fim das consultas
    @Transient
    LocalTime inicio = LocalTime.of(6, 59); // Horário de início permitido (07:00)
    @Transient
    LocalTime fim = LocalTime.of(18, 01); // Horário final permitido (18:00)


    public Consulta(DadosCadastroConsulta dados) {
//        this.medico = dados.medico();
//        this.paciente = dados.paciente();
        this.dataInicio = dados.dataHora().toLocalDate(); // Extrai a data de início do LocalDateTime
        this.horaInicio = dados.dataHora().toLocalTime(); // Extrai a hora de início do LocalDateTime

    }

    public Boolean marcar(Medico medico, Paciente paciente) {

        if (paciente.getAtivo() && medico.getAtivo()) {
            //Paciente e Medico estão ativos no sistema?
            System.out.println("Paciente e Médico estão ativos no sistema");
            if (this.dataInicio.getDayOfWeek() != DayOfWeek.SUNDAY) {
                //Dia da Consulta é diferente de domingo?
                System.out.println("Dia da consulta é diferente de Domingo");
                if (!paciente.getRealizouConsultaHoje()) {
                    //O paciente já realizou alguma consulta hoje?
                    System.out.println("O paciente não fez outra consulta hoje");
                    if (!medico.temConsultaMarcada(this.dataInicio, this.horaInicio)) {
                        //O médico não tem outra consulta nesse dia/hora?
                        System.out.println("O médico não tem outra consulta nesse dia/hora");
                        if (this.horaInicio.isAfter(inicio) && this.horaInicio.isBefore(fim)) {
                            // Horário da Consulta está dentro do intervalo de horário permitido ?
                            this.horaFim = this.horaInicio.plusHours(1);
                            this.dataFim = this.dataInicio;
                            this.paciente.setRealizouConsultaHoje(true);
                            //Atualizada a dataFim e a horaFim, cada consulta tem 1 hora fixa de duração
                            //Atualizada também a informação se o paciente já realizou alguma consulta hoje
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


//    public void realizarConsulta(Medico medico, Paciente paciente) {
//        //Fazer verificações
//        this.realizada = true;
//    }
}

