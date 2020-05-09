package datastructurealgorithm.array;

import jdk.dynalink.beans.StaticClass;

public class UseArray {

    String address;//Declare variable

    String name = "karim";//Declare and Initialize

    //Array Declare and Initialize

    String[] stName = {"Sami", "Tigiest", "Denys", "Nafis", "matt"};

    //Array Declare

    static String[] staddress = new String[6];

    public static void main(String[] args) {
        //Array index start from zero

        System.out.println(staddress.length);

        staddress[0] = "Queens,NY";
        staddress[1] = "Brooklyn,NY";
        staddress[2] = "Jamaica,NY";
        staddress[3] = "Bronx,NY";
        staddress[4] = "Manhattan,NY";
        staddress[5] = "Woodside,NY";

        //staddress[6]="Elmurst,NY";
        //staddress[7]="Jackson Heights,NY";

        System.out.println(7);

        try {

            System.out.println(staddress[5]);
            System.out.println(staddress[3]);

        } catch (Exception e) {

            e.printStackTrace();
            System.out.println("Array Index out of Bounds Exception");

        }

        System.out.println("*******************using for loop*******************");

        //Retrieve Data from Array

        for (int i = 0; i < staddress.length; i++) {

            System.out.println(staddress[i]);


        }


    }
}