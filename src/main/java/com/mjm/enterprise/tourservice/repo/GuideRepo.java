package com.mjm.enterprise.tourservice.repo;

import com.mjm.enterprise.tourservice.model.Guide;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuideRepo extends JpaRepository<Guide, Integer> {
}
