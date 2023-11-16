package exceptionalHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Overview {

    //exceptions/errors
    public static void main(String[] args) throws IOException {
        String fileName ="example.txt";

        BufferedReader reader = new BufferedReader(new FileReader(fileName));

//        String line;
//
//        while ((line =reader.readLine()) != null){
//            System.out.println(line);
//        }
    }


    //handling exceptions
    //try catch block
    //finally() ->
    //throwable -> exception

    //checked exception
    //unchecked exceptions

    //throws ->
    //throe->

}
