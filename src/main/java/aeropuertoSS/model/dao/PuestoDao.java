package aeropuertoSS.model.dao;

import aeropuertoSS.model.entity.Puesto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PuestoDao extends JpaRepository<Puesto, Integer> {
}
