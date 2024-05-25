package aeropuertoSS.service;

import aeropuertoSS.model.dto.VueloDto;
import aeropuertoSS.model.entity.Vuelo;

import java.util.List;

public interface IVuelo {

    Vuelo save(Vuelo vuelo);

    Vuelo update(Vuelo vuelo);

    VueloDto findById(Integer id);

    List<VueloDto> findAll();

    void delete(Vuelo vuelo);
}
