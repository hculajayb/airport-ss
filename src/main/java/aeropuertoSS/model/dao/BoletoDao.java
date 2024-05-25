package aeropuertoSS.model.dao;

import aeropuertoSS.model.entity.Boleto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoletoDao extends JpaRepository<Boleto, Integer> {
}
