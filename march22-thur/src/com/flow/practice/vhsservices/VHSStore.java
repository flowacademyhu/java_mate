package com.flow.practice.vhsservices;

import java.util.HashMap;
import java.util.Map;

public class VHSStore {
    private Map<String, Rentable> videos = new HashMap<>();
    private Map<String, Rentable> tutorialVideos = new HashMap<>();

    public VHSStore() {

    }

    public void addTo(Video addThis) {
        if (addThis.getClass() == TutorialVideo.class) {
            tutorialVideos.put(addThis.getTitle(), addThis);
        } else {
            videos.put(addThis.getTitle(),addThis);
        }
    }

    public Rentable lookingFor(String title, Boolean isTutorial) throws NotFoundException {
        if (isTutorial) {
            if (tutorialVideos.containsKey(title)) {
                return tutorialVideos.get(title);
            }
            throw new NotFoundException("Sadly we don't have this tutorial video.");
        } else {
            if (videos.containsKey(title)) {
                return videos.get(title);
            }
            throw new NotFoundException("Sadly we don't have this video.");
        }
    }
}
