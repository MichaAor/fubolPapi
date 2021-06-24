package com.company.User;

import com.company.Football.Team;

import java.util.Objects;

public class User {
    private String user;
    private String password;
    private Team team;

    public User(String user, String password, Team team) {
        this.user = user;
        this.password = password;
        this.team = team;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user1 = (User) o;
        return Objects.equals(user, user1.user) && Objects.equals(password, user1.password) && Objects.equals(team, user1.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, password, team);
    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", team=" + team +
                '}';
    }
}
