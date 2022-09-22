package com.mjm.enterprise.guideservice.controller;

import com.mjm.enterprise.tourservice.model.Guide;
import com.mjm.enterprise.tourservice.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/guide")
public class GuideController {

    private final GuideService guideService;

    @Autowired
    public GuideController(GuideService guideService) {
        this.guideService = guideService;
    }

    @GetMapping(value = "")
    public List<Guide> getAllGuides() {
        return guideService.getAllGuides();
    }

    @GetMapping(value = "/{id}")
    public Optional<Guide> getGuideById(final @PathVariable Integer id) {
        return guideService.getGuideById(id);
    }

    @PutMapping(value = "/{id}")
    public Optional<Guide> updateGuideById(final @PathVariable Integer id, final @RequestBody Guide guide) {
        return guideService.updateGuide(id, guide);
    }

    @PostMapping(value = "")
    public Optional<Guide> createGuide(final @RequestBody Guide guide) {
        return guideService.createGuide(guide);
    }

    @DeleteMapping(value = "/{id}")
    public Optional<Guide> deleteguideById(final @PathVariable Integer id) {
        return guideService.deleteGuide(id);
    }

}
