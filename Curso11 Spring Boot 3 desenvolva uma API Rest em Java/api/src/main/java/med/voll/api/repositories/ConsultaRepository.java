package med.voll.api.repositories;

import io.micrometer.observation.ObservationFilter;
import med.voll.api.models.consulta.Consulta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository <Consulta, Long> {
//    Page<Consulta> findAllByRealizadaFalse(Pageable paginacao);
}
