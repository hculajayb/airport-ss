package aeropuertoSS.service;

import aeropuertoSS.model.entity.Empleados;

import java.util.List;

public interface IEmpleados {
    Empleados save(Empleados empleados);
    Empleados update(Empleados empleados);
    Empleados findById(Integer id);
    List<Empleados> findAll();
    void delete(Empleados empleados);
}
