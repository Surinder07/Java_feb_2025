package mar29.filedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {

        // How to creata file , nio
        // io
        File file = new File("Myfile.js");

        try {
            if (file.createNewFile()) {
                System.out.println(file.getName());
                System.out.println(file.exists());

            }
        }
        catch (IOException e){
            System.out.println(e);
        }



    }
}
