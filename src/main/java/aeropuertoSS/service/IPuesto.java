package aeropuertoSS.service;
import aeropuertoSS.model.entity.Puesto;

import java.util.List;

public interface IPuesto {
    Puesto save(Puesto puesto);
    Puesto update(Puesto puesto);
    Puesto findById(Integer id);
    List<Puesto> findAll();
    void delete(Puesto puesto);
}
