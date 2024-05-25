package aeropuertoSS.service.impl;

import aeropuertoSS.exception.FormatoContraseñaInvalidoException;
import aeropuertoSS.exception.PasaporteExistenteException;
import aeropuertoSS.model.dao.ClienteDao;
import aeropuertoSS.model.entity.Cliente;
import aeropuertoSS.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteImpl implements ICliente {

    @Autowired
    private ClienteDao clienteDao;

    @Transactional
    @Override
    public Cliente save(Cliente cliente){
        if (clienteDao.existsByPasaporte(cliente.getPasaporte())) {
            throw new PasaporteExistenteException("El número de pasaporte ya está en uso");
        }
        if (!cliente.getPassword().matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()-+=]).*$")) {
            throw new FormatoContraseñaInvalidoException("El formato de la contraseña no es válido");
        }
        return clienteDao.save(cliente);
    }

    @Transactional
    @Override
    public Cliente update(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Transactional(readOnly = true)
    @Override
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Transactional
    @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }

    @Override
    public boolean existsByPasaporte(String pasaporte) {
        return clienteDao.existsByPasaporte(pasaporte);
    }
}
