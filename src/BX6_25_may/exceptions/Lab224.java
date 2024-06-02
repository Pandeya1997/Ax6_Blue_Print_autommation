package BX6_25_may.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class Lab224 {
    public static void main(String[] args) {
        try {
         String path = "C://a.text";
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
