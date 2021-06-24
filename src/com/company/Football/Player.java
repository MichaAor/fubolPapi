package com.company.Football;

import java.util.Objects;

public class Player {
    private String name;
    private String teamName;
    private int dorsal;
    private double value;
    private String nationality;
    private String position;
    private int playerClass;
    private String typeOfSkill;
    private String classProgress;
    private String prejection;
    private String status;

    public Player(String name, String teamName, int dorsal, double value, String nationality, String position, int playerClass, String typeOfSkill,
                  String classProgress, String prejection, String status) {
        this.name = name;
        this.teamName = teamName;
        this.dorsal = dorsal;
        this.value = value;
        this.nationality = nationality;
        this.position = position;
        this.playerClass = playerClass;
        this.typeOfSkill = typeOfSkill;
        this.classProgress = classProgress;
        this.prejection = prejection;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(int playerClass) {
        this.playerClass = playerClass;
    }

    public String getTypeOfSkill() {
        return typeOfSkill;
    }

    public void setTypeOfSkill(String typeOfSkill) {
        this.typeOfSkill = typeOfSkill;
    }

    public String getClassProgress() {
        return classProgress;
    }

    public void setClassProgress(String classProgress) {
        this.classProgress = classProgress;
    }

    public String getPrejection() {
        return prejection;
    }

    public void setPrejection(String prejection) {
        this.prejection = prejection;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return dorsal == player.dorsal && Double.compare(player.value, value) == 0 && playerClass == player.playerClass && Objects.equals(name, player.name) && Objects.equals(teamName, player.teamName) && Objects.equals(nationality, player.nationality) && Objects.equals(position, player.position) && Objects.equals(typeOfSkill, player.typeOfSkill) && Objects.equals(classProgress, player.classProgress) && Objects.equals(prejection, player.prejection) && Objects.equals(status, player.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, teamName, dorsal, value, nationality, position, playerClass, typeOfSkill, classProgress, prejection, status);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", dorsal=" + dorsal +
                ", value=" + value +
                ", nationality='" + nationality + '\'' +
                ", position='" + position + '\'' +
                ", playerClass=" + playerClass +
                ", typeOfSkill='" + typeOfSkill + '\'' +
                ", classProgress='" + classProgress + '\'' +
                ", prejection='" + prejection + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
