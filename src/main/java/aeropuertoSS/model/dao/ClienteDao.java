package aeropuertoSS.model.dao;

import aeropuertoSS.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDao extends JpaRepository<Cliente, Integer> {
    boolean existsByPasaporte(String pasaporte);
}
