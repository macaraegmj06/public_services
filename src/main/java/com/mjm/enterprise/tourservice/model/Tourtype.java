package com.mjm.enterprise.tourservice.model;

public enum Tourtype {

    CITY("City"), RISKY("Risky"), EXCITING("Exciting");

    private String label;

    private Tourtype(String label) {
        this.label = label;
    }

}
