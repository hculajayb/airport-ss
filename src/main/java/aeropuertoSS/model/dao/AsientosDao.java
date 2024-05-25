package aeropuertoSS.model.dao;

import aeropuertoSS.model.entity.Asientos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsientosDao extends JpaRepository<Asientos, Integer> {
}
