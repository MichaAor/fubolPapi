package com.company.Football;

import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;



public class Player implements Comparable<Player> {
    private String id;
    private String name;
    private String teamName;
    private int dorsal;
    private double value;
    private String nationality;
    private String position;
    private int playerClass;
    private String typeOfSkill;
    private String classProgress;
    private String projection;
    private String status;

    public Player(String id, double value){
        this.id = id;
        this.value = value;
    }
    public Player(String id, String name, String teamName, int dorsal, double value, String nationality, String position, int playerClass, String typeOfSkill,
                  String classProgress, String prejection, String status) {
        this.id = id;
        this.name = name;
        this.teamName = teamName;
        this.dorsal = dorsal;
        this.value = value;
        this.nationality = nationality;
        this.position = position;
        this.playerClass = playerClass;
        this.typeOfSkill = typeOfSkill;
        this.classProgress = classProgress;
        this.projection = prejection;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getProjection() {
        return projection;
    }

    public void setProjection(String projection) {
        this.projection = projection;
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
        return dorsal == player.dorsal && Double.compare(player.value, value) == 0 && playerClass == player.playerClass && Objects.equals(name, player.name) && Objects.equals(teamName, player.teamName) && Objects.equals(nationality, player.nationality) && Objects.equals(position, player.position) && Objects.equals(typeOfSkill, player.typeOfSkill) && Objects.equals(classProgress, player.classProgress) && Objects.equals(projection, player.projection) && Objects.equals(status, player.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, teamName, dorsal, value, nationality, position, playerClass, typeOfSkill, classProgress, projection, status);
    }

    @Override
    public String toString() {
        return "Player{" +
                "Id = " + id +
                "name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", dorsal=" + dorsal +
                ", value=" + value +
                ", nationality='" + nationality + '\'' +
                ", position='" + position + '\'' +
                ", playerClass=" + playerClass +
                ", typeOfSkill='" + typeOfSkill + '\'' +
                ", classProgress='" + classProgress + '\'' +
                ", projection='" + projection + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public int compareTo(Player p){
        if(p.getValue()>this.value){
            return -1;
        }else if(p.getValue()==this.value){
            return 0;
        }else{
            return 1;
        }
    }


}
