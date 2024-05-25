package aeropuertoSS.model.dto;
import aeropuertoSS.model.entity.Avion;
import lombok.*;

@Data
@ToString
@Builder
public class AsientosDto {
    private Integer id;

    private Avion avionId;
    private int fila;
    private int columna;
    private boolean ocupado;
}
