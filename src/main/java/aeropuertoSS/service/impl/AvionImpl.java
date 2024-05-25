package aeropuertoSS.service.impl;
import aeropuertoSS.model.dao.AeropuertoDao;
import aeropuertoSS.model.dao.AvionDao;
import aeropuertoSS.model.entity.Aerolinea;
import aeropuertoSS.model.entity.Avion;
import aeropuertoSS.service.IAvion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AvionImpl implements IAvion {

    @Autowired
    private AvionDao avionDao;


    @Autowired
    private AeropuertoDao aeropuertoDao;
    @Transactional
    @Override
    public Avion save(Avion avion) {
        return avionDao.save(avion);
    }

    @Transactional
    @Override
    public Avion update(Avion avion) {
        return avionDao.save(avion);
    }

    @Transactional(readOnly = true)
    @Override
    public Avion findById(Integer id) {
        return avionDao.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Avion> findAll() {
        return (List<Avion>) avionDao.findAll();
    }

    //@Transactional
    //@Override
    //public  boolean consultarEstadoAvionesPorAerolinea(Integer aerolineaId) {
        //*List<Avion> avionesActivos = avionDao.findByAerolineaId(aerolineaId).stream().filter(u->u.isEstado()==true).toList();// Consultar aviones por aerolínea y estado activo
      //  return false;// Si la lista de aviones activos no está vacía, retorna true, indicando que la aerolínea tiene aviones activos
    //}

    @Transactional
    @Override
    public void delete(Avion avion) {
        avionDao.delete(avion);
    }

    @Transactional
    @Override
    public List<Avion> findByAerolineaId(Aerolinea aerolinea) {
        return (List<Avion>) avionDao.findByAerolineaId(aerolinea);
    }

}

