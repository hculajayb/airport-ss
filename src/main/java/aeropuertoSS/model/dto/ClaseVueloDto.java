package aeropuertoSS.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString
@Builder
public class ClaseVueloDto {

    private Integer id;
    private String nombre;
    private String descripcion;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;
    private String creadoPor;
    private String modificadoPor;
}
