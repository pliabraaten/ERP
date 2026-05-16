package repository;

import models.Hog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HogRepository extends JpaRepository<Hog, Long> {
}
