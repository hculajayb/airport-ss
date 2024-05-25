package aeropuertoSS.service;

import aeropuertoSS.model.entity.Aeropuerto;

import java.util.List;

public interface IAeropuerto {
    Aeropuerto save(Aeropuerto aeropuerto);
    Aeropuerto update(Aeropuerto aeropuerto);
    Aeropuerto findById(Integer id);
    List<Aeropuerto> findAll();
    void delete(Aeropuerto aeropuerto);

}
