package Exercicio1_Thread;

import java.util.ArrayList;

public class ThreadNumber extends Thread {
    ArrayList<Character> input;

    public ThreadNumber(ArrayList<Character> input) {
        this.input = input;
    }

    public void run() {
        ArrayList<Character> sequence = new ArrayList<Character>();
        for (int i = 0; i < input.size(); i++) {
            if (Character.isDigit(input.get(i))) {
                sequence.add(input.get(i));
            } else if (sequence.size() > 1) {
                System.out.print("Sequência encontrada: {");
                for (int j = 0; j < sequence.size(); j++) {
                    System.out.print(sequence.get(j));
                    if (j + 1 < sequence.size()) System.out.print(", ");
                }
                System.out.println("}");
                sequence.clear();
            } else {
                sequence.clear();
            }

            if (sequence.size() > 1) {
                System.out.print("Sequência encontrada: {");
                for (int j = 0; j < sequence.size(); j++) {
                    System.out.print(sequence.get(j));
                    if (j + 1 < sequence.size()) System.out.print(", ");
                }
                System.out.println("}");
                sequence.clear();
            } else {
                sequence.clear();
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
