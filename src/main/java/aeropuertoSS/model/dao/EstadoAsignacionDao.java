package aeropuertoSS.model.dao;

import aeropuertoSS.model.entity.EstadoAsignacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoAsignacionDao extends JpaRepository<EstadoAsignacion, Integer> {
}
