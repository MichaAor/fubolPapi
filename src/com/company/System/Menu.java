package com.company.System;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    SystemFootball systemFootball = new SystemFootball();


    public void menuFirst() throws IOException {

        boolean salir = false;
        do {
            try {
                System.out.println("Welcome to the  fulbito game...\n" +
                        "\n\t1_Loggin\n\t2_Register\n\t3_Exit ");
                Scanner scInt = new Scanner(System.in);
                int opcion = scInt.nextInt();

                switch (opcion) {
                    case 1:
                        menuRegister();


                }
            } catch (java.util.InputMismatchException e) {
                System.err.println("Invalid option, please try again");
            }
        } while (!salir);
        System.out.println("Thanks for playing!");
    }


    public void menuRegister() {
        int control = 0;
        Scanner scanner = new Scanner(System.in);

        String username = this.systemFootball.checkUsernameOrTeamName(0);
        if(username.compareTo(null)==0) return;

        String password = this.systemFootball.checkPassword();
        if(password.compareTo(null)==0) return;

        String teamName = this.systemFootball.checkUsernameOrTeamName(1);
        if(teamName.compareTo(null)==0) return;





    }

}
