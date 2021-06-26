package com.company.System;

import com.company.Football.Match;
import com.company.Football.Player;
import com.company.Football.Team;
import com.company.User.User;

import java.util.*;

public class SystemFootball {

    private ArrayList<Player> players;
    private ArrayList<Team>teams;
    private ArrayList<Match>matches;
    private ArrayList<User>users;

    //Contructor
    public SystemFootball() {
        this.players = new ArrayList<>();
        this.teams = new ArrayList<>();
        this.matches = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    //Getter and Setter

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    //Methods user
    public boolean userExists(String username) {
        for(User userAux : this.users){
            if(userAux.getUserName().compareTo(username)==0){
                return true;
            }
        }
        return false;
    }

    //Methods players
    public ArrayList<Player> showPlayersByClub(String club){
        ArrayList<Player>playersByClub = null;
        for (Player playerAux : this.players){
            if(playerAux.getTeamName().compareTo(club)==0){
                playersByClub.add(playerAux);
            }
        }
        return playersByClub;
    }

    public List<Player> showPlayerByClass(int classPlayer){
        List<Player>playersOrdenByClass = null;
        for(Player playerAux : this.players){
            if(playerAux.getPlayerClass() == classPlayer){
                playersOrdenByClass.add(playerAux);
            }
        }
        return playersOrdenByClass;
    }

    public ArrayList<Player> returnPlayerByValue(){
        ArrayList<Player>playersOrdenValue = this.players;
        Collections.sort(playersOrdenValue);
        return playersOrdenValue;
    }

    public ArrayList<Player> returnPlayerByClubAndValue(String club){
        ArrayList<Player>playersOrdenByClubAndValue = null;
        for(Player playerAux : this.players){
            if(playerAux.getTeamName().compareTo(club)==0){
                playersOrdenByClubAndValue.add(playerAux);
            }
        }
        Collections.sort(playersOrdenByClubAndValue);
        return playersOrdenByClubAndValue;
    }

    //Checks
    public boolean checkUsernameInList(String username){
        for (User userAux : this.users){
            if(userAux.getUserName().compareTo(username)==0){
                return true;
            }
        }
        return false;
    }
    public boolean checkTeamNameInList(String teamName){
        for (Team teamAux : this.teams){
            if(teamAux.getName().compareTo(teamName)==0){
                return true;
            }
        }
        return false;
    }



    public String checkUsernameOrTeamName(int i){
        Scanner scanner = new Scanner(System.in);
        String string = null;
        boolean revision = true;
        do{
            if(i == 0) {
                System.out.println("Username: ");
                string = scanner.nextLine();
                    if (!checkUsernameInList(string)) {
                        revision = false;
                        System.err.println("Error, username not registered in the system");
                    }
            }
            if(i == 1) {
                System.out.println("Team Name: ");
                string = scanner.nextLine();
                if (!checkUsernameInList(string)) {
                    revision = false;
                    System.err.println("Error, username not registered in the system");
                }
            }
            if (!revision){
                String retry;
                do {
                    System.out.println("Do you want to retry the login? (Y/N)");
                    retry = scanner.nextLine();
                    if(retry.compareToIgnoreCase("N") == 0){
                        return null;
                    }
                    if(!(retry.compareToIgnoreCase("Y")==0));
                        System.err.println("Incorrect option, options available: (Y/N)");

                }while (!(retry.compareToIgnoreCase("Y")==0) || !(retry.compareToIgnoreCase("N") == 0));
            }
        }while (revision);

        return string;
    }

    public String checkPassword(){
        Scanner scanner = new Scanner(System.in);
        String password;
        boolean revision = true;

        do{
            System.out.println("Password: ");
            password = scanner.nextLine();
            System.out.println("Writte password again: ");
            String passwordCheck = scanner.nextLine();
            if(password.compareTo(passwordCheck)!=0) {
                System.err.println("The password aren´t same. Please try again");
                revision = false;
            }
            if(!revision) {
                String retry;
                do {
                    System.out.println("Do you want to retry the login? (Y/N)");
                    retry = scanner.nextLine();
                    if (retry.compareToIgnoreCase("N") == 0) {
                        return null;
                    }
                    if (!(retry.compareToIgnoreCase("Y") == 0)) ;
                    System.err.println("Incorrect option, options available: (Y/N)");

                } while (!(retry.compareToIgnoreCase("Y") == 0) || !(retry.compareToIgnoreCase("N") == 0));
            }
        }while (revision);
        return password;
    }



}
