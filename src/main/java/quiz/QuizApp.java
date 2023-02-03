package quiz;

import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jaka jest moja ulubiona gra na Roblox ");
        System.out.println("A) Parkour Obby");
        System.out.println("B) Arsenal");
        System.out.println("C) Pet Simulator X");



        System.out.println("Jaki jest mój ulubiony film ");
        System.out.println("A) Robin Hood");
        System.out.println("B) Kacze opowieści");
        System.out.println("C) Star Wars");

        System.out.print("Wpisz swoją odpowiedż i naciśnij Enter:");
        String answer =  scanner.nextLine();


        answer = heckanswer(scanner, answer);


        if (answer.equalsIgnoreCase("c")) {
            System.out.println("Dobrze");
        }else {
            System.out.println("Źle!!!");
        }



        System.out.print("Wpisz swoją odpowiedż i naciśnij Enter:");
         answer =  scanner.nextLine();


        answer = heckanswer(scanner, answer);


        if (answer.equalsIgnoreCase("b")) {
           System.out.println("Dobrze");
       }else {
           System.out.println("Źle!!!");
       }

        }

    private static String heckanswer(Scanner scanner, String answer) {
        while (!answer.equalsIgnoreCase("a")
        && !answer.equalsIgnoreCase("b")
        && !answer.equalsIgnoreCase("c")) {


            System.out.println("Możliwe odpowiedzi to A,B,C.Spróbuj jeszcze raz");
            answer = scanner.nextLine();


        }
        return answer;
    }


}

























