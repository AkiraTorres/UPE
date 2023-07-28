package Exercicio1_Thread;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        Character c[] = {'a', 'b', '1', '2', '3', 'c', 'd', 'f', '4', '5', '6'}; 
        ArrayList<Character> input = new ArrayList<>(Arrays.asList(c));

        new ThreadNumber(input).start();
        new ThreadLetter(input).start();
    }
}
