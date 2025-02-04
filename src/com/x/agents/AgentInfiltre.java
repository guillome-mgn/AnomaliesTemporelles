package com.x.agents;

public class AgentInfiltre extends AgentsTemporels {
    AgentInfiltre(String nom, int niveauExperience, int anneeRecrutement) {
        super(nom, niveauExperience, anneeRecrutement);
    }

    @Override
    public void executerMission() {
        System.out.println("Execution de la mission...");
    }
    
    public void seFondreDansLeDecor() {
        System.out.println("Fondre dans le decor en cours...");
    }

    public void seFairePasserPourUnePersonneHistorique() {
        System.out.println("Se faire passer pour une personne historique en cours...");
    }
}
