package Homework2;
import java.util.StringTokenizer;

public class Driver {
    public static void main(String[] args){
        String names;
        names = "Gina Hannah Lucy Snickerdoodle";
        StringTokenizer namesList = new StringTokenizer(names);

        if(namesList.hasMoreTokens() == false) System.out.println("Done");

        while(namesList.hasMoreTokens()){
            System.out.println(namesList.nextToken());
        }


    }
}
