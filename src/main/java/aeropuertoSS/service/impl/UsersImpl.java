package aeropuertoSS.service.impl;

import aeropuertoSS.model.dao.UsersDao;
import aeropuertoSS.model.entity.Users;
import aeropuertoSS.service.IUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersImpl implements IUsers {

    @Autowired
    private UsersDao usersDao;

    @Override
    public Users save(Users user) {
        return usersDao.save(user);
    }

    @Override
    public Users update(Users user) {
        return usersDao.save(user);
    }

    @Override
    public Users findById(Integer id) {
        return usersDao.findById(id).orElse(null);
    }

    @Override
    public List<Users> findAll() {
        return (List<Users>) usersDao.findAll();
    }

    @Override
    public void delete(Users user) {
    }
}
