package myjava;

public class NestedIfelse {


    public static void main(String[] args) {

   int age=36;

   if(age>=18){

       System.out.println("You are Adult");

       if(age>=24 && age <=34) {


           System.out.println("You are eligible to vote");

       }
         if(age >=35 &&  age>44) {

             System.out.println("You are late to resister for vote");

         }

         if(age>=45){

             System.out.println("you are too old to get resister for vote");
         }

         else{
             System.out.println("you are not eligible to resister for vote");
       }




   }







    }









}
