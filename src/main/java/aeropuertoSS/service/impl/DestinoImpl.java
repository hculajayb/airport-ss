package aeropuertoSS.service.impl;

import aeropuertoSS.model.dao.DestinoDao;
import aeropuertoSS.model.entity.Destino;
import aeropuertoSS.service.IDestino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class DestinoImpl implements IDestino {
    @Autowired
    private DestinoDao destinoDao;

    @Transactional
    @Override
    public Destino save(Destino destino) {
        return destinoDao.save(destino);
    }

    @Override
    public Destino update(Destino destino) {
        return destinoDao.save(destino);
    }

    @Transactional(readOnly = true)
    @Override
    public Destino findById(Integer id) {
        return destinoDao.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Destino> findAll() {
        return (List<Destino>) destinoDao.findAll();
    }

    @Transactional
    @Override
    public void delete(Destino destino) {
        destinoDao.delete(destino);
    }
}
