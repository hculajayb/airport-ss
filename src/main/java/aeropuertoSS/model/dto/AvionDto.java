package aeropuertoSS.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class AvionDto{
    private Integer id;
    private boolean estado;
    private String modelo;
    private String marca;
    private Integer anio;
    private Integer maxAsientos;
}
