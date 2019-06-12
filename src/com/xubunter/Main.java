package com.xubunter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println( "Клалькулятор целых чисел\n" +
                            "Допустим ввод чисел от 1 до 10 и от I до X" +
                            "\nМатематичесике операции: + - * /" );
        Scanner in = new Scanner(System.in);
        try{
            System.out.println( Calculator.calc(in.nextLine()) );
        }catch (InputException e){
            System.err.println(e.getMessage());
        }
    }

}
