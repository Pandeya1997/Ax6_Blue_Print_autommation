package BX6_25_may.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab225 {
    public static void main(String[] args) throws FileNotFoundException {
        readFile("C://a.text");

    }
    static void readFile(String fileName) throws FileNotFoundException {
            int a = 10 / 10;
            int c =0;
             int a1 = 10 / c;
        try {
       FileReader f= new FileReader(new File("c://a.text")) ;
        }catch (Exception e){
            System.out.println("File not found");
        }
        FileReader f= new FileReader(new File("c://a/txt"));


    }
}
