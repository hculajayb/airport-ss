package aeropuertoSS.service.impl;

import aeropuertoSS.model.dao.PuestoDao;
import aeropuertoSS.model.entity.Puesto;
import aeropuertoSS.service.IPuesto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PuestoImpl implements IPuesto {

    @Autowired
    private PuestoDao puestoDao;

    @Transactional
    @Override
    public Puesto save(Puesto puesto) {
        return puestoDao.save(puesto);
    }

    @Transactional
    @Override
    public Puesto update(Puesto puesto) {
        return puestoDao.save(puesto);
    }

    @Transactional(readOnly = true)
    @Override
    public Puesto findById(Integer id) {
        return puestoDao.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Puesto> findAll() {
        return (List<Puesto>) puestoDao.findAll();
    }

    @Transactional
    @Override
    public void delete(Puesto puesto) {
        puestoDao.delete(puesto);
    }
}
