package Exercicio1_Thread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("INICIO MAIN");
        Scanner sc = new Scanner(System.in);
        int n;
        String input[];

        System.out.print("Digite o tamanho do array: ");
        n = sc.nextInt();
        input = new String[n];
        
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextLine();
        }
        
        System.out.print("Seu array é: ");
        for (int i = 0; i < n; i++) {
            System.out.print(input[i]);
        }
        System.out.println();


        // String input[] = {"a", "1", "2", "3", "b", "c", "4"};
        // String input2[] = {"1", "2", "3"};
        // String input3[] = {"a", "b", "c"};

        new DetectNumber().run(input);
        new DetectString().run(input);
        // System.out.println("FINAL MAIN");
    }
}
