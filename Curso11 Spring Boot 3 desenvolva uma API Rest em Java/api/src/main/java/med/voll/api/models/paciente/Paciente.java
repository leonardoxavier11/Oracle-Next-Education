package med.voll.api.models.paciente;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.dtos.pacientes.DadosAtualizacaoPaciente;
import med.voll.api.dtos.pacientes.DadosCadastroPaciente;
import med.voll.api.models.endereco.Endereco;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    @Embedded
    private Endereco endereco;
    private Boolean ativo = true;
    private Boolean realizouConsultaHoje = false;

    public Paciente(DadosCadastroPaciente dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.cpf = dados.cpf();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarInformacoes(DadosAtualizacaoPaciente dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.telefone() != null) {
            this.telefone = dados.telefone();
        }
        if (dados.endereco() != null) {
            this.endereco = dados.endereco();
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}