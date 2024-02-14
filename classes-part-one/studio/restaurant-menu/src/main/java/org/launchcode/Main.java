package org.launchcode;

public class Main {

    public static <MItems> void main(String[] args) {
	// write your code here
        MItems dessert = new MItems("ApplePie", 4.99 , "Dessert", true);
        MItems mCourse = new MItems("Pasta", 10.99 ,"mainCourse", true);
        MItems starter = new MItems("AvocadoTaco", 9.99 , "appetizer", true);

        dessert.setDescription("Made out of apples");
        starter.setDescription("Made out of avocados");
        mCourse.setDescription("Made out of cheese and sauce");




    }

}





