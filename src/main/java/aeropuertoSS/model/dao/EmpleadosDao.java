package aeropuertoSS.model.dao;

import aeropuertoSS.model.entity.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadosDao extends JpaRepository<Empleados, Integer> {
}
