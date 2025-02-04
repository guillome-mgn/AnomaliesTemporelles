package com.x.agents;

public class AnomalieTemporelle {
    public enum NiveauDanger {
        BAS, MOYEN, ELEVE
    }
    public enum Status {
        NON_RESOLUE, EN_COURS_DE_RESOLUTION, RESOLUE
    }

    private String description;
    private int anneeApparition;
    private NiveauDanger niveauDanger;
    private Status status;

    AnomalieTemporelle(String description, int anneeApparition, NiveauDanger niveauDanger, Status status) {
        this.description = description;
        this.anneeApparition = anneeApparition;
        this.niveauDanger = niveauDanger;
        this.status = status;
    }

    public String getDescription() {
        return this.description;
    }
    public int getAnneeApparition() {
        return this.anneeApparition;
    }
    public NiveauDanger getNiveauDanger() {
        return this.niveauDanger;
    }
    public Status getStatus() {
        return this.status;
    }

    public void changementStatus(Status status) {
        this.status = status;
    }

}
