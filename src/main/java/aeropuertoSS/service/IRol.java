package aeropuertoSS.service;

import aeropuertoSS.model.entity.Rol;

import java.util.List;

public interface IRol {
    Rol save(Rol rol);
    Rol update(Rol rol);
    Rol findById(Integer id);
    List<Rol> findAll();
    void delete(Rol rol);
}
