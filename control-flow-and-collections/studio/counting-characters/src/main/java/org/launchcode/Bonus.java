package org.launchcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bonus {
    public static String BonusMission() throws FileNotFoundException {
        File file = new File("/Users/brittneyepperson/launchcode/Java/chapter-1/java-web-dev-projects/control-flow-and-collections/studio/counting-characters/src/main/java/org/launchcode/gretzky");
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
