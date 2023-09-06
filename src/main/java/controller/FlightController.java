package controller;

import model.Flights;
import model.Runway;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.FlightService;

import java.util.List;

@RestController
@RequestMapping("/Flights")
public class FlightController {
    private FlightService flightService;
    @GetMapping("/allFlights")
    public ResponseEntity<List<Flights>> getAllFlights() {
        List<Flights>flights = (List<Flights>) flightService.getAllFlights();
        return new ResponseEntity<>(flights, HttpStatus.OK);
    }
    @GetMapping("/FlightId/{id}")
    public Flights getFlightById(@PathVariable Long id){
        return flightService.getFlightById(id);
    }
    @GetMapping("/runway/{id}")
    public List<Flights> getFlightsByRunway(@PathVariable Long id){
        Runway runway = new Runway();
        runway.setId(id);
        return flightService.getFlightsByRunway(runway);
    }
    @PostMapping("/create")
    public Flights createNewFlight(@RequestBody Flights flights){
        return flightService.createNewFlight(flights);
    }
    @PutMapping("/updateFlight/{id}")
    public Flights updateFlight(@PathVariable Long id,@RequestBody Flights updatedFlights){
        return flightService.updateFlight(id, updatedFlights);
    }
    @DeleteMapping("/delete{id}")
    public  void  deleteFlight(@PathVariable Long id){
        flightService.deleteFlight(id);
    }
}