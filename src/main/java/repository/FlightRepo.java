package repository;

import model.Flights;
import model.Runway;
import model.Terminal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepo extends JpaRepository<Flights,Long> {
    List<Flights> findByRunway(Runway runway);
    List<Flights> findByTerminal(Terminal terminal);
}
