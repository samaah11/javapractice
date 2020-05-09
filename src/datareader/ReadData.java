package datareader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

public class ReadData {


    public static void main(String[] args) {


        FileReader fileReader=null;

        BufferedReader bufferedReader=null;

        //Path type
        //Absolute path:Full path
        //Relative path:Relatively shorter path


        String filepath="C:\\Users\\nasri_9gklr9r\\IdeaProjects\\Javapractice\\Data Test\\Sample.txt";

        try{

            fileReader=new FileReader(filepath);
            bufferedReader=new
                    BufferedReader(fileReader);

            String data;

            while (   (data=bufferedReader.readLine())    !=null  ){

                System.out.println(data);


        }



        }catch (Exception e) {

            e.printStackTrace();
            System.out.println("File not found");

        } finally {

            //Finally is a block which will execute must

            try{
                fileReader.close();
                bufferedReader.close();


            }catch (Exception  e){
                e.printStackTrace();
                System.out.println("File Already close");

            }


    }

















    }





}
