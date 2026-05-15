package repository;

import models.Hog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HogDAO extends JpaRepository<Hog, Long> {
}
