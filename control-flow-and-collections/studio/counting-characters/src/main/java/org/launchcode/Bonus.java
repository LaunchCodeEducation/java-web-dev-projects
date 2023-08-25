package org.launchcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bonus {
    public static String BonusMission() throws FileNotFoundException {
        File file = new File("/Users/brittneyepperson/Desktop/gretzky.txt");
        Scanner scan = new Scanner(file);

        String fileContent = "";
        while(scan.hasNext()) {
            fileContent = fileContent.concat(scan.nextLine() + "\n");
        }
        fileContent = fileContent.replace("\n" , "");
        System.out.println(fileContent);
        fileContent = fileContent.replaceAll("[^A-Za-z0-9]", "");

        return fileContent;
    }
}
