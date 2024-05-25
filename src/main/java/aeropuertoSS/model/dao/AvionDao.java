    package aeropuertoSS.model.dao;

    import aeropuertoSS.model.entity.Aerolinea;
    import aeropuertoSS.model.entity.Avion;
    import org.springframework.data.jpa.repository.JpaRepository;

    import java.util.List;

    public interface AvionDao extends JpaRepository<Avion, Integer> {
        List<Avion> findByAerolineaId(Aerolinea aerolinea);
    }

