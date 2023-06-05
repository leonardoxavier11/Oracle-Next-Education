package med.voll.api.repositories;

import med.voll.api.models.consulta.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultaRepository extends JpaRepository <Consulta, Long> {
    List<Consulta> findByMedicoId(Long medicoId);
}
