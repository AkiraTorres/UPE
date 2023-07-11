package Exercicio1_Thread;

public class DetectNumber extends Thread {
    Integer intSequence[];
    public void run(String[] input) {
        try {
            intSequence = new Integer[input.length];
            int counter = 0, sequenceErrors;
            for (int i = 0; i < input.length; i++) {
                sequenceErrors = 0;
                try {
                    try {
                        if (i > 0) Integer.parseInt(input[i - 1]);
                    } catch (NumberFormatException e) {
                        if (i == input.length - 1) {
                            sequenceErrors += 2;
                        } else {
                            sequenceErrors++;
                        }
                    }

                    try {
                        if (i < input.length - 1) Integer.parseInt(input[i + 1]);
                    } catch (NumberFormatException e) {
                        if (i == 0) {
                            sequenceErrors += 2;
                        } else {
                            sequenceErrors++;
                        }
                    }

                    if (sequenceErrors < 2) {
                        intSequence[counter] = Integer.parseInt(input[i]);
                        counter++;
                    }
                } catch (NumberFormatException e) {
                    if (counter > 0) {
                        printList(intSequence, counter);
                        intSequence = new Integer[input.length];
                        counter = 0;
                    }
                }
            }

            if (counter > 0) {
                printList(intSequence, counter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 

    public void printList(Integer[] input, int counter) {
        System.out.println("SEQUENCIA DE NUMEROS ENCONTRADA: ");
        for (int i = 0; i < counter; i++) {
            System.out.print(intSequence[i].toString() + " ");
        }
        System.out.println();
    }
}
