package com.x.agents;

import com.x.agents.AnomalieTemporelle.NiveauDanger;

public class Main {

	public static void main(String[] args) {
		// Créer des agents temporels
		AgentScientifique agentScientifique = new AgentScientifique("Albert", 1, 2000);
		AgentTechnologique agentTechnologique = new AgentTechnologique("Ada", 2, 2001);
		AgentInfiltre agentInfiltreur = new AgentInfiltre("Alan", 3, 2002);
		
		// Créer des anomalies temporelles
		AnomalieTemporelle anomalie1 = new AnomalieTemporelle(
			"Anomalie 1", 
			2000, 
			AnomalieTemporelle.NiveauDanger.BAS, 
			AnomalieTemporelle.Status.NON_RESOLUE
		);
		AnomalieTemporelle anomalie2 = new AnomalieTemporelle(
			"Anomalie 2", 
			2001, 
			AnomalieTemporelle.NiveauDanger.MOYEN, 
			AnomalieTemporelle.Status.NON_RESOLUE
		);

		// Créer des missions
		Mission mission1 = new Mission("Mission 1", anomalie1, agentScientifique);
		Mission mission2 = new Mission("Mission 2", anomalie2, agentTechnologique);
	}

}
