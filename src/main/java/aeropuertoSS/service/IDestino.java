package aeropuertoSS.service;

import aeropuertoSS.model.entity.Destino;

import java.util.List;

public interface IDestino {
    Destino save(Destino destino);
    Destino update(Destino destino);
    Destino findById(Integer id);
    List<Destino> findAll();
    void delete(Destino destino);
}
