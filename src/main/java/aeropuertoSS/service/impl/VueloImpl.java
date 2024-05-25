package aeropuertoSS.service.impl;

import aeropuertoSS.model.dao.AerolineaDao;
import aeropuertoSS.model.dao.AvionDao;
import aeropuertoSS.model.dao.VueloDao;
import aeropuertoSS.model.dto.VueloDto;
import aeropuertoSS.model.entity.Vuelo;
import aeropuertoSS.service.IVuelo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VueloImpl implements IVuelo {
    @Autowired
    private VueloDao vueloDao;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AerolineaDao aerolineaDao;

    @Autowired
    private AvionDao avionDao;

    @Transactional
    @Override
    public Vuelo save(Vuelo vuelo){
        return vueloDao.save(vuelo);
    }

    @Transactional
    @Override
    public Vuelo update(Vuelo vuelo) {
        return vueloDao.save(vuelo);
    }

    @Transactional(readOnly = true)
    @Override
    public VueloDto findById(Integer id) {
        Vuelo vuelo = vueloDao.findById(id).orElse(null);
        return modelMapper.map(vuelo, VueloDto.class);
    }

    @Transactional(readOnly = true)
    @Override
    public List<VueloDto> findAll() {
        List<Vuelo> vuelos = vueloDao.findAll();
        return vuelos.stream()
                .map(vuelo -> modelMapper.map(vuelo, VueloDto.class))
                .collect(Collectors.toList());
    }
    /*
    @Transactional
    @Override
    public boolean validarAerolineaConAvionesActivos(Integer aerolineaId) {
        return avionDao.consultarEstadoAvionesPorAerolinea(aerolineaId);
    }

     */

    @Transactional
    @Override
    public void delete(Vuelo vuelo) {
       vueloDao.delete(vuelo);
    }
}
