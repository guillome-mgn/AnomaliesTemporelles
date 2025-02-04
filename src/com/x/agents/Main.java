package com.x.agents;

import com.x.agents.AnomalieTemporelle.NiveauDanger;
import com.x.agents.AnomalieTemporelle.Status;

public class Main {

	public static void main(String[] args) {
		// Créer des agents temporels
		AgentScientifique agentScientifique = new AgentScientifique("Albert", 1, 2000);
		AgentTechnologique agentTechnologique = new AgentTechnologique("Ada", 2, 2001);
		AgentInfiltre agentInfiltre = new AgentInfiltre("Alan", 3, 2002);

		// Tester les capacités 
		agentScientifique.analyserAnomalie();
		agentTechnologique.piraterSysteme("Système 1");
		
		// Créer des anomalies temporelles
		AnomalieTemporelle anomalie1 = new AnomalieTemporelle(
			"Anomalie 1", 
			2000, 
			NiveauDanger.BAS, 
			Status.NON_RESOLUE
		);
		AnomalieTemporelle anomalie2 = new AnomalieTemporelle(
			"Anomalie 2", 
			2001, 
			NiveauDanger.MOYEN, 
			Status.NON_RESOLUE
		);

		// Créer des missions
		Mission mission1 = new Mission("Mission 1", anomalie1, agentScientifique);
		Mission mission2 = new Mission("Mission 2", anomalie2, agentTechnologique);

		// Changer l'agent de la mission 2 pour montrer le polymorphisme
		System.out.println(mission2.getAgentAssigne().getNom());
		mission2.setAgent(agentInfiltre);
		System.out.println(mission2.getAgentAssigne().getNom());
	}

}
