package aeropuertoSS.controller;

import aeropuertoSS.model.dto.VueloDto;
import aeropuertoSS.model.entity.Aerolinea;
import aeropuertoSS.model.entity.Avion;
import aeropuertoSS.model.entity.Vuelo;
import aeropuertoSS.service.IAerolinea;
import aeropuertoSS.service.IAeropuerto;
import aeropuertoSS.service.IAvion;
import aeropuertoSS.service.IVuelo;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import aeropuertoSS.service.*;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/vuelos")
@CrossOrigin(origins = "*")
public class VueloController {

    @Autowired
    private IAvion avionService;

    @Autowired
    private IAerolinea aerolineaService;

    @Autowired
    private IVuelo vueloService;

    @Autowired
    private IAeropuerto aeropuertoService;

    @Autowired
    private ModelMapper modelMapper;


    @GetMapping("/{aerolineaId}/avionesActivos")
    public ResponseEntity<List<Avion>> listarAvionesActivos(@PathVariable Integer aerolineaId) {
        Aerolinea aerolinea = aerolineaService.findById(aerolineaId);
        List<Avion> avionesActivos = avionService.findByAerolineaId(aerolinea)
                .stream()
                .filter(Avion::isEstado)
                .toList();

        if (avionesActivos.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Collections.emptyList());
        } else {
            return ResponseEntity.ok(avionesActivos);
        }
    }

    @PostMapping("post/fly")
    public ResponseEntity<?> crearVuelo(@Valid @RequestBody VueloDto vueloDto){
        Vuelo vuelo = new Vuelo();

        LocalDateTime fechaActual = LocalDateTime.now();

        if (vueloDto.getFechaHoraSalida().isEqual(vueloDto.getFechaHoraLlegada()) ||
                vueloDto.getFechaHoraSalida().isBefore(fechaActual) ||
                vueloDto.getFechaHoraLlegada().isBefore(fechaActual)) {
            return ResponseEntity.badRequest().body("Las fechas de salida y llegada deben ser posteriores a la fecha actual");
        }

        vuelo.setAerolineaId(aerolineaService.findById(vueloDto.getAerolineaId()));
        vuelo.setAvionId(avionService.findById(vueloDto.getAvionId()));
        vuelo.setAeropuertoSalidaId(aeropuertoService.findById(vueloDto.getAeropuertoSalidaId()));
        vuelo.setAeropuertoLlegadaId(aeropuertoService.findById(vueloDto.getAeropuertoLlegadaId()));
        vuelo.setAsientosDisponibles(vueloDto.getAsientosDisponibles());
        vuelo.setFechaHoraSalida(vueloDto.getFechaHoraSalida());
        vuelo.setFechaHoraLlegada(vueloDto.getFechaHoraLlegada());
        vuelo.setPrecioClaseEconomica(vueloDto.getPrecioClaseEconomica());
        vuelo.setPrecioClaseEjecutiva(vueloDto.getPrecioClaseEjecutiva());

        Vuelo nuevoVuelo = vueloService.save(vuelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoVuelo);
    }

    @GetMapping("get/fly/{id}")
    public ResponseEntity<?> consultarPorId(@PathVariable Integer id) {
        VueloDto vueloDto = vueloService.findById(id);
        if (vueloDto != null) {
            return ResponseEntity.ok(vueloDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("get/flyAll")
    public ResponseEntity<List<VueloDto>> consultarTodos() {
        List<VueloDto> vuelos = vueloService.findAll();
        if (!vuelos.isEmpty()) {
            return ResponseEntity.ok(vuelos);
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}
