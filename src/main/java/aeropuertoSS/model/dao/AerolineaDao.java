package aeropuertoSS.model.dao;

import aeropuertoSS.model.entity.Aerolinea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AerolineaDao extends JpaRepository<Aerolinea, Integer> {
    //boolean validarAerolineaConAvionesActivos(Integer aerolineaId);
}
