package aeropuertoSS.service.impl;

import aeropuertoSS.model.dao.AsientosDao;
import aeropuertoSS.model.entity.Asientos;
import aeropuertoSS.service.IAsientos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AsientosImpl implements IAsientos {

    @Autowired
    private AsientosDao asientosDao;

    @Transactional
    @Override
    public Asientos save(Asientos asientos) {
        return asientosDao.save(asientos);
    }

    @Transactional
    @Override
    public Asientos update(Asientos asientos) {
        return asientosDao.save(asientos);
    }

    @Transactional(readOnly = true)
    @Override
    public Asientos findById(int id) {
        return asientosDao.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Asientos> findAll() {
        return (List<Asientos>) asientosDao.findAll();
    }

    @Transactional
    @Override
    public void delete(Asientos asientos) {

    }
}
