package med.voll.api.models.medico;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.dtos.medicos.DadosAtualizacaoMedico;
import med.voll.api.dtos.medicos.DadosCadastroMedico;
import med.voll.api.models.consulta.Consulta;
import med.voll.api.models.endereco.Endereco;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "medicos")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Embedded
    private Endereco endereco;
    private Boolean ativo = true;
    private Boolean estaEmConsulta = false;

    //Todo médico precisa de uma lista de consultas médicas
    @Transient
    private List<Consulta> listaConsultas = new ArrayList<>();

    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
        this.ativo = true;
    }

    public void atualizarInformacoes(DadosAtualizacaoMedico dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.telefone() != null) {
            this.telefone = dados.telefone();
        }
        if (dados.endereco() != null) {
            this.endereco.atualizarInformacoes(dados.endereco());
        }

    }

    public void excluir() {
        this.ativo = false;
    }

    //VERIFICAR PQ NÃO ESTÁ FUNCIONANDO <--------
    public boolean temConsultaMarcada(LocalDate dataInicioAgendamento, LocalTime horaInicioAgendamento) {
        for (Consulta consulta : listaConsultas) {
            var dataInicioConsultaNaList = consulta.getDataInicio();
            var horaInicioConsultaNaList = consulta.getHoraInicio();
            var horaFimConsultaNaList = horaInicioConsultaNaList.plusHours(1);

            System.out.println("DataInicio: " + dataInicioConsultaNaList);
            System.out.println("HoraInicio: " + horaInicioConsultaNaList);
            System.out.println("HoraFim" + horaFimConsultaNaList);

            if (dataInicioAgendamento.equals(dataInicioConsultaNaList) && (horaInicioAgendamento.isAfter(horaInicioConsultaNaList) || horaInicioAgendamento.equals(horaInicioConsultaNaList)) && horaInicioAgendamento.isBefore(horaFimConsultaNaList)) {
//            Dia da marcação é igual ao da List? // HoraInicio da marcação é posterior/igual ao da List? //HoraInicio da marcação é anterior ao da List?
//            Exemplo: Marcação às 8h10 no dia 05/04. Sendo que já existe uma consulta no BD agendada para 7h no dia 05/04
//                     É o mesmo dia da List? (true) // 8h10 é posterior à 7h (true) // 8h10 é anterior à 8h (false).
                return true;
            }
        }
        return false;
    }

    public void setListaConsultas(List<Consulta> listaConsultas) {
        this.listaConsultas = listaConsultas;
    }
}




