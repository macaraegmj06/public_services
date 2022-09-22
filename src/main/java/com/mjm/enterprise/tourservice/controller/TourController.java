package com.mjm.enterprise.tourservice.controller;

import com.mjm.enterprise.tourservice.model.Tour;
import com.mjm.enterprise.tourservice.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/tour")
public class TourController {

    private final TourService tourService;

    @Autowired
    public TourController(TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping(value = "")
    public List<Tour> getAllTours() {
        return tourService.getAllTours();
    }

    @GetMapping(value = "/{id}")
    public Optional<Tour> getTourById(final @PathVariable Integer id) {
        return tourService.getTourById(id);
    }

    @PutMapping(value = "/{id}")
    public Optional<Tour> updateTourById(final @PathVariable Integer id, final @RequestBody Tour tour) {
        return tourService.updateTour(id, tour);
    }

    @PostMapping(value = "")
    public Optional<Tour> createTour(final @RequestBody Tour tour) {
        return tourService.createTour(tour);
    }

    @DeleteMapping(value = "/{id}")
    public Optional<Tour> deleteTourById(final @PathVariable Integer id) {
        return tourService.deleteTour(id);
    }

}
