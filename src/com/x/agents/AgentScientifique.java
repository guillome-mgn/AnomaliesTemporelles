package com.x.agents;

public class AgentScientifique extends AgentsTemporels {
    AgentScientifique(String nom, int niveauExperience, int anneeRecrutement) {
        super(nom, niveauExperience, anneeRecrutement);
    }

    @Override
    public void executerMission() {
        System.out.println("Execution de la mission...");
    }
    
    public void analyserAnomalie() {
        System.out.println("Analyse de l'anomalie en cours...");
    }

    public void reduireImpactTemporel() {
        System.out.println("Reduction de l'impact temporel de l'anomalie en cours...");
    }
}
