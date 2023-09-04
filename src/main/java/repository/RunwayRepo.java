package repository;

import model.Runway;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RunwayRepo extends JpaRepository<Runway,Long> {
}
