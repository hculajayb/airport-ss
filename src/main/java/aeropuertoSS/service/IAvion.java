package aeropuertoSS.service;
import aeropuertoSS.model.entity.Aerolinea;
import aeropuertoSS.model.entity.Avion;

import java.util.List;

public interface IAvion {

    Avion save(Avion avion);
    Avion update(Avion avion);
    Avion findById(Integer id);
    List<Avion> findAll();
    //boolean consultarEstadoAvionesPorAerolinea(Integer aerolineaId);
    void delete(Avion avion);
    List<Avion> findByAerolineaId(Aerolinea aerolinea);

}

