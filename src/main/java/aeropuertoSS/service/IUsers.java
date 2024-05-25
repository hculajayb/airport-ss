package aeropuertoSS.service;

import aeropuertoSS.model.entity.Users;

import java.util.List;

public interface IUsers {
    Users save(Users user);
    Users update(Users user);
    Users findById(Integer id);
    List<Users> findAll();
    void delete(Users user);
}
