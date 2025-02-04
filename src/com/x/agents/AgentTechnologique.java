package com.x.agents;

public class AgentTechnologique extends AgentsTemporels implements HackeurTemporel {
    AgentTechnologique(String nom, int niveauExperience, int anneeRecrutement) {
        super(nom, niveauExperience, anneeRecrutement);
    }

    @Override
    public void executerMission() {
        System.out.println("Execution de la mission...");
    }

    @Override 
    public void piraterSysteme(String cible) {
        System.out.println("Piratage de " + cible + " en cours...");
    }
    
    public void utilisationGadget() {
        System.out.println("Utilisation de gadget en cours...");
    }

    public void piratageDeDispositif() {
        System.out.println("Piratage de dispositif temporel en cours...");
    }
}
