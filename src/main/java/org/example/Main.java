package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }*/
       // citireNota();
       // printareValoriFolosindWhile();
        //printareValoriFolosindDoWhile();

        printareValoriFolosindFor();
    }
    public static void citireNota(){
        System.out.println("Introduceti nota: ");
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();

        while (nota<0 || nota>10) {
            System.out.println("Te rog introdu o nota valida");
            nota = scanner.nextInt();
        }
        System.out.println("Nota este intre 1 si 10");
    }

    public static void printareValoriFolosindWhile(){
        int valoare=1;
        while (valoare<=5){
            System.out.println("Valoare este " + valoare);
            valoare++;
        }
        System.out.println("Valoare dupa parcurgerea while-do este " + valoare);

    }

    public static void printareValoriFolosindDoWhile(){
        int valoare=1;
        do {
            System.out.println("Valoare este " + valoare);
            valoare++;
        } while (valoare<=5);
        System.out.println("Valoare dupa parcurgerea do-while este " + valoare);
    }

    public static void printareValoriFolosindFor(){
        int valoare=1;
        for (;valoare<=5;valoare++)
            System.out.println("Valoare este " + valoare);
    }
}