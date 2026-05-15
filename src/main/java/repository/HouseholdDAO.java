package repository;

import models.Household;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseholdDAO extends JpaRepository<Household, Long> {
}
