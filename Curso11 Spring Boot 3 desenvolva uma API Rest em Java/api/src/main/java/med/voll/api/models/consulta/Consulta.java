package med.voll.api.models.consulta;


import jakarta.persistence.*;
import lombok.*;
import med.voll.api.dtos.consultas.DadosCadastroConsulta;
import med.voll.api.models.medico.Medico;
import med.voll.api.models.paciente.Paciente;

import java.time.LocalDateTime;

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
    private LocalDateTime dataHora; //Data e Hora da realização da Consulta
    private Boolean realizada = false;

    public Consulta(DadosCadastroConsulta dados) {
//        this.medico = dados.medico();
//        this.paciente = dados.paciente();
        this.dataHora = dados.dataHora();
    }


    public void realizarConsulta(Medico medico, Paciente paciente) {
        //Fazer verificações
        this.realizada = true;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "id=" + id +
                ", medico=" + medico.getNome() +
                ", paciente=" + paciente.getNome() +
                ", dataHora=" + dataHora +
                ", realizada=" + realizada +
                '}';
    }
}
