package utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

    public static void main(String[] args) {
        String text;
        String a = null;
        try {


            FileReader fileReader = new FileReader("src/utility/Information.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((text=bufferedReader.readLine())!=null){
                a = text;
            }

            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(a);


    }
}

