package com.mjm.enterprise.guideservice.service;

import com.mjm.enterprise.tourservice.model.Guide;
import com.mjm.enterprise.tourservice.repo.GuideRepo;
import com.mjm.enterprise.tourservice.model.Guide;
import com.mjm.enterprise.tourservice.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuideServiceImpl implements GuideService {

    private GuideRepo guideRepo;

    @Autowired
    public GuideServiceImpl(GuideRepo guideRepo) {
        this.guideRepo = guideRepo;
    }

    @Override
    public List<Guide> getAllGuides() {
        return guideRepo.findAll();
    }

    @Override
    public Optional<Guide> getGuideById(Integer id) {
        return guideRepo.findById(id);
    }

    @Override
    public Optional<Guide> updateGuide(Integer id, Guide guide) {
        Optional<Guide> curGuide = guideRepo.findById(id);
        if (curGuide.isPresent()) {
            guide.setGuide_id(curGuide.get().getGuide_id());
            return Optional.of(guideRepo.save(guide));
        }
        return Optional.empty();
    }

    @Override
    public Optional<Guide> createGuide(Guide guide) {
        return Optional.of(guideRepo.save(guide));
    }

    @Override
    public Optional<Guide> deleteGuide(Integer id) {
        Optional<Guide> curGuide = guideRepo.findById(id);
        if (curGuide.isPresent()) {
            guideRepo.deleteById(id);
            return curGuide;
        }
        return Optional.empty();
    }
}
