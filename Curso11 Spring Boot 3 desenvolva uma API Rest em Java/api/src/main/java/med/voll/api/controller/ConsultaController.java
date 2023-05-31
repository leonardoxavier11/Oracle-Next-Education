package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.dtos.DadosListagemConsulta;
import med.voll.api.dtos.consultas.DadosCadastroConsulta;
import med.voll.api.models.consulta.Consulta;
import med.voll.api.models.medico.Medico;
import med.voll.api.models.paciente.Paciente;
import med.voll.api.repositories.ConsultaRepository;
import med.voll.api.repositories.MedicoRepository;
import med.voll.api.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("consulta")
public class ConsultaController {

    //Se faz necessário injetar os demais Reposities, pois há uma relação ManyToOne, partindo de Consulta
    @Autowired
    private ConsultaRepository repository;
    @Autowired
    private MedicoRepository medicoRepository;
    @Autowired
    private PacienteRepository pacienteRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroConsulta dados) {
        var medico = medicoRepository.findById(dados.medicoId())
                .orElseThrow(() -> new IllegalArgumentException("Médico não encontrado com o ID fornecido"));

        var paciente = pacienteRepository.findById(dados.pacienteId())
                .orElseThrow(() -> new IllegalArgumentException("Paciente não encontrado com o ID fornecido"));

        Consulta consulta = new Consulta(dados);
        consulta.setMedico(medico);
        consulta.setPaciente(paciente);

        repository.save(consulta);

        //Testando para saber se os Objetos estão lá em Consulta
        var retorno = consulta.toString();
        System.out.println(retorno);
    }

    @GetMapping
    public Page<DadosListagemConsulta> listar(@PageableDefault(sort = {"dataHora"}) Pageable paginacao) {
        return repository.findAllByRealizadaFalse(paginacao).map(DadosListagemConsulta::new);
    }
}
