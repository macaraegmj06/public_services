package com.mjm.enterprise.tourservice.service;

import com.mjm.enterprise.tourservice.model.Guide;

import java.util.List;
import java.util.Optional;

public interface GuideService {

    List<Guide> getAllGuides();

    Optional<Guide> getGuideById(Integer id);

    Optional<Guide> updateGuide(Integer id, Guide guide);

    Optional<Guide> createGuide(Guide guide);

    Optional<Guide> deleteGuide(Integer id);

}
