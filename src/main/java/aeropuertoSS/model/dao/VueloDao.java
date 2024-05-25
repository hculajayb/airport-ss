package aeropuertoSS.model.dao;

import aeropuertoSS.model.entity.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VueloDao extends JpaRepository<Vuelo, Integer> {
    /*boolean validarAerolineaConAvionesActivos(Integer aerolineaId);*/
}
