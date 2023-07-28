package Exercicio1_Thread;

import java.util.ArrayList;

public class ThreadLetter extends Thread {
    ArrayList<Character> input;

    public ThreadLetter(ArrayList<Character> input) {
        this.input = input;
    }

    public void run() {
        Character c, c1, c2;
        for (int i = 0; i < input.size() - 2; i++) {
            c = input.get(i);
            c1 = input.get(i + 1);
            c2 = input.get(i + 2);
            if (Character.isAlphabetic(c) && Character.isAlphabetic(c1) && Character.isAlphabetic(c2)) {
                System.out.print("Sequência encontrada: ");
                System.out.println("{" + c + ", " + c1 + ", " + c2 + "}");
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
