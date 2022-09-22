package com.mjm.enterprise.tourservice.service;

import com.mjm.enterprise.tourservice.model.Tour;

import java.util.List;
import java.util.Optional;

public interface TourService {

    List<Tour> getAllTours();

    Optional<Tour> getTourById(Integer id);

    Optional<Tour> updateTour(Integer id, Tour tour);

    Optional<Tour> createTour(Tour tour);

    Optional<Tour> deleteTour(Integer id);

}
