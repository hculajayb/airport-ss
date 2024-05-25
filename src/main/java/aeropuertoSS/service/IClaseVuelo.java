package aeropuertoSS.service;

import aeropuertoSS.model.entity.ClaseVuelo;

import java.util.List;

public interface IClaseVuelo {
    ClaseVuelo save(ClaseVuelo claseVuelo);
    ClaseVuelo update(ClaseVuelo claseVuelo);
    ClaseVuelo findById(Integer id);
    List<ClaseVuelo> findAll();
    void delete(ClaseVuelo claseVuelo);
}
