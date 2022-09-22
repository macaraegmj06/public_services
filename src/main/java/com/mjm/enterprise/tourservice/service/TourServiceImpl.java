package com.mjm.enterprise.tourservice.service;

import com.mjm.enterprise.tourservice.model.Tour;
import com.mjm.enterprise.tourservice.repo.TourRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TourServiceImpl implements TourService {

    private TourRepo tourRepo;

    @Autowired
    public TourServiceImpl(TourRepo tourRepo) {
        this.tourRepo = tourRepo;
    }

    @Override
    public List<Tour> getAllTours() {
        return tourRepo.findAll();
    }

    @Override
    public Optional<Tour> getTourById(Integer id) {
        return tourRepo.findById(id);
    }

    @Override
    public Optional<Tour> updateTour(Integer id, Tour tour) {
        Optional<Tour> curTour = tourRepo.findById(id);
        if (curTour.isPresent()) {
            tour.setTourId(curTour.get().getTourId());
            return Optional.of(tourRepo.save(tour));
        }
        return Optional.empty();
    }

    @Override
    public Optional<Tour> createTour(Tour tour) {
        return Optional.of(tourRepo.save(tour));
    }

    @Override
    public Optional<Tour> deleteTour(Integer id) {
        Optional<Tour> curTour = tourRepo.findById(id);
        if (curTour.isPresent()) {
            tourRepo.deleteById(id);
            return curTour;
        }
        return Optional.empty();
    }
}
