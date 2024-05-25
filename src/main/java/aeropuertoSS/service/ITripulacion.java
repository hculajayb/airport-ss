package aeropuertoSS.service;

import aeropuertoSS.model.entity.Tripulacion;

import java.util.List;

public interface ITripulacion {
    Tripulacion save(Tripulacion tripulacion);
    Tripulacion update(Tripulacion tripulacion);
    Tripulacion findById(Integer id);
    List<Tripulacion> findAll();
    void delete(Tripulacion tripulacion);
}
