package pl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(2,3,4,5,6));
        int k=9;
        System.out.println(JesseAndCookies.run(k,integers));
    }
}