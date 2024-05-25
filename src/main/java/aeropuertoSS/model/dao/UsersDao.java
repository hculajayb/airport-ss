package aeropuertoSS.model.dao;

import aeropuertoSS.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDao extends JpaRepository<Users, Integer> {
}
