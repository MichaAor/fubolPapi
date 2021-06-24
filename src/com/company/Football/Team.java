package com.company.Football;

import com.company.Football.Player;

import java.util.HashSet;
import java.util.Objects;

public class Team {
    private String name;
    private Double budget;
    private HashSet<Player> players;
    private String formation;

    public Team(String name, Double budget, HashSet<Player> players, String formation) {
        this.name = name;
        this.budget = budget;
        this.players = players;
        this.formation = formation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public HashSet<Player> getPlayers() {
        return players;
    }

    public void setPlayers(HashSet<Player> players) {
        this.players = players;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name) && Objects.equals(budget, team.budget) && Objects.equals(players, team.players) && Objects.equals(formation, team.formation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, budget, players, formation);
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                ", players=" + players +
                ", formation='" + formation + '\'' +
                '}';
    }
}
