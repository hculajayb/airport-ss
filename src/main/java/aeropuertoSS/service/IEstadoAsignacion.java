package aeropuertoSS.service;

import aeropuertoSS.model.entity.EstadoAsignacion;

import java.util.List;

public interface IEstadoAsignacion {
    EstadoAsignacion save(EstadoAsignacion estadoAsignacion);
    EstadoAsignacion update(EstadoAsignacion estadoAsignacion);
    EstadoAsignacion findById(Integer id);
    List<EstadoAsignacion> findAll();
    void delete(EstadoAsignacion estadoAsignacion);
}
