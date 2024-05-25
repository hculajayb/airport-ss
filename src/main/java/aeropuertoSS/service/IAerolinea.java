package aeropuertoSS.service;

import aeropuertoSS.model.entity.Aerolinea;


import java.util.List;

public interface IAerolinea {

    Aerolinea save(Aerolinea aerolinea);
    Aerolinea update(Aerolinea aerolinea);
    Aerolinea findById(Integer id);
    void delete(Aerolinea aerolinea);
    List<Aerolinea> findAll();
}
