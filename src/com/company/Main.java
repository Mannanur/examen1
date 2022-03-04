package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        metod("salam");

    }
    static void metod(String a){
        String [] array = {"salam", "alma", "kurut", "noutbuk"};
        for(String array1: array){
            if (array1.equals(a)){
                System.out.println("bar");
                break;
            }
            else {
                System.out.println("jok");
                break;
            }
        }
    }
}

