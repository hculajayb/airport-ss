
package aeropuertoSS.model.dao;

import aeropuertoSS.model.entity.Aeropuerto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AeropuertoDao extends JpaRepository<Aeropuerto, Integer> {
}
