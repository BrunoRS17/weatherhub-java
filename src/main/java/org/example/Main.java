package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean runing = true;

        while (runing){
            System.out.println("\n=== WeatherHub CLI ===");
            System.out.println("1. Consultar clima");
            System.out.println("2. COnfigurações");
            System.out.println("0. Sair");

            System.out.print("Escolha: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1" -> System.out.println("\nConsultado clima...");
                case "2" -> System.out.println("\nConfigurações...");
                case "0" -> runing = false;
                default -> System.out.println("\nOpção inválida");
            }
        }

        scanner.close();


    }

}