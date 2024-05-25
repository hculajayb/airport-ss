package aeropuertoSS.service.impl;

import aeropuertoSS.model.dao.BoletoDao;
import aeropuertoSS.model.entity.Boleto;
import aeropuertoSS.service.IBoleto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class BoletoImpl implements IBoleto {

    @Autowired
    private BoletoDao boletoDao;

    @Transactional
    @Override
    public Boleto save(Boleto boleto) {
        return boletoDao.save(boleto);
    }

    @Transactional
    @Override
    public Boleto update(Boleto boleto) {
        return boletoDao.save(boleto);
    }

    @Transactional(readOnly = true)
    @Override
    public Boleto findById(Integer id) {
        return boletoDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public List<Boleto> findAll() {
        return (List<Boleto>) boletoDao.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public void delete(Boleto boleto) {
        boletoDao.delete(boleto);
    }
}
