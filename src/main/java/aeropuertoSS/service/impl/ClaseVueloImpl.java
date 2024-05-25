package aeropuertoSS.service.impl;

import aeropuertoSS.model.dao.ClaseVueloDao;
import aeropuertoSS.model.entity.ClaseVuelo;
import aeropuertoSS.service.IClaseVuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClaseVueloImpl implements IClaseVuelo {
    @Autowired
    private ClaseVueloDao claseVueloDao;

    @Transactional
    @Override
    public ClaseVuelo save(ClaseVuelo claseVuelo) {
        return claseVueloDao.save(claseVuelo);
    }

    @Transactional
    @Override
    public ClaseVuelo update(ClaseVuelo claseVuelo) {
        return claseVueloDao.save(claseVuelo);
    }

    @Transactional(readOnly = true)
    @Override
    public ClaseVuelo findById(Integer id) {
        return claseVueloDao.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    @Override
    public List<ClaseVuelo> findAll() {
        return (List<ClaseVuelo>) claseVueloDao.findAll();
    }

    @Transactional
    @Override
    public void delete(ClaseVuelo claseVuelo) {
        claseVueloDao.delete(claseVuelo);
    }
}
