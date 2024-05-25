package aeropuertoSS.model.dto;

import aeropuertoSS.model.entity.ClaseVuelo;
import aeropuertoSS.model.entity.Cliente;
import aeropuertoSS.model.entity.Vuelo;
import lombok.*;

@Data
@ToString
@Builder
 public class BoletoDto {

 private Integer id;
 private Cliente clienteId;
 private Vuelo numeroVueloId;
 private ClaseVuelo claseVueloId;
 private String asientos;
 private int cantidadMaletas;
}
