package com.mjm.enterprise.tourservice.repo;

import com.mjm.enterprise.tourservice.model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourRepo extends JpaRepository<Tour, Integer> {
}
