package oop.polymorphismoverloading;

public class Calculator {


    public void doSummation(int num1,int num2){

        int number1=45;
        int number2=65;
        int summation=number1+number2;

        System.out.println("summation of values are           "+summation);

    }
    public void dosummation(int num1,int num2,int num3){

        int number1 = 45;
        int number2 = 65;
        int number3= 48;

        int summation = number1 + number2+ number3;

        System.out.println("summation of values are           " + summation);

    }

    public void dosummation(int num1,int num2,int num3,int num4) {

        int number1 = 45;
        int number2 = 65;
        int number3 = 48;
        int number4 = 70;

        int summation = number1 + number2 + number3 + number4;

        System.out.println("summation of values are           " + summation);


    }




}
