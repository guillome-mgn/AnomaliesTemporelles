package com.x.agents;

abstract public class AgentsTemporels {
	private String nom;
	private int niveauExperience;
	private int anneeRecrutement;

	AgentsTemporels(String nom, int niveauExperience, int anneeRecrutement) {
		this.nom = nom;
		this.niveauExperience = niveauExperience;
		this.anneeRecrutement = anneeRecrutement;
	}

	public String getNom() {
		return this.nom;
	}
	public int getNiveauExperience() {
		return this.niveauExperience;
	}
	public int getAnneeRecrutement() {
		return this.anneeRecrutement;
	}

	abstract public void executerMission();
}
