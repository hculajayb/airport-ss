package aeropuertoSS.service.impl;

import aeropuertoSS.model.dao.TripulacionDao;
import aeropuertoSS.model.entity.Tripulacion;
import aeropuertoSS.service.ITripulacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TripulacionImpl implements ITripulacion {
    @Autowired
    private TripulacionDao tripulacionDao;
    @Transactional
    @Override
    public Tripulacion save(Tripulacion tripulacion) {
        return tripulacionDao.save(tripulacion);
    }

    @Transactional
    @Override
    public Tripulacion update(Tripulacion tripulacion) {
        return tripulacionDao.save(tripulacion);
    }

    @Transactional(readOnly = true)
    @Override
    public Tripulacion findById(Integer id) {
        return tripulacionDao.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Tripulacion> findAll() {
        return (List<Tripulacion>) tripulacionDao.findAll();
    }

    @Transactional
    @Override
    public void delete(Tripulacion tripulacion) {
        tripulacionDao.delete(tripulacion);
    }
}
