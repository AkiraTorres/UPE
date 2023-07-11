package Exercicio1_Thread;

public class DetectString extends Thread {
    String stringSequence[];
    public void run(String[] input) {
        try {
            stringSequence = new String[input.length];
            int counter = 0, sequenceErrors, i;
            for (i = 0; i < input.length; i++) {
                sequenceErrors = 0;
                try {
                    try {
                        if (i > 0) Integer.parseInt(input[i - 1]);
                        if (i == input.length - 1) {
                            sequenceErrors += 2;
                        } else {
                            sequenceErrors++;
                        }
                    } catch (NumberFormatException e) {
                        
                    }

                    try {
                        if (i < input.length - 1) Integer.parseInt(input[i + 1]);
                        if (i == 0) {
                            sequenceErrors += 2;
                        } else {
                            sequenceErrors++;
                        }
                    } catch (NumberFormatException e) {
                        
                    }

                    if (sequenceErrors < 2) {
                        Integer.parseInt(input[i]);
                    }

                    if (counter > 0) {
                        printList(stringSequence, counter);
                        stringSequence = new String[input.length];
                        counter = 0;
                    }
                } catch (NumberFormatException e) {
                    stringSequence[counter] = input[i];
                    counter++;
                }
            }

            if (counter > 0) {
                printList(stringSequence, counter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 

    public void printList(String[] input, int counter) {
        System.out.println("SEQUENCIA DE LETRAS ENCONTRADA: ");
        for (int i = 0; i < counter; i++) {
            System.out.print(stringSequence[i].toString() + " ");
        }
        System.out.println();
    }
}
