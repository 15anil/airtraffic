package repository;

import model.Terminal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TerminalRepo extends JpaRepository<Terminal,Long> {

}
