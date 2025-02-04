package com.x.agents;

public class Mission {
    private String titre;
    private AnomalieTemporelle anomalieAssociee;
    private AgentsTemporels agentAssigne;

    Mission(String titre, AnomalieTemporelle anomalieAssociee, AgentsTemporels agentAssigne) {
        this.titre = titre;
        this.anomalieAssociee = anomalieAssociee;
        this.agentAssigne = agentAssigne;
        executerMission();
    }

    public String getTitre() {
        return this.titre;
    }
    public AnomalieTemporelle getAnomalieAssociee() {
        return this.anomalieAssociee;
    }
    public AgentsTemporels getAgentAssigne() {
        return this.agentAssigne;
    }

    public void setAgent(AgentsTemporels agent) {
        this.agentAssigne = agent;
        executerMission();
    }

    private void executerMission() {
        agentAssigne.executerMission();
    }
}
