package aeropuertoSS.service;

import aeropuertoSS.model.entity.Cliente;

import java.util.List;

public interface ICliente {
    Cliente save(Cliente cliente);
    Cliente update(Cliente cliente);
    Cliente findById(Integer id);
    List<Cliente> findAll();
    void delete(Cliente cliente);
    boolean existsByPasaporte(String pasaporte);
}
