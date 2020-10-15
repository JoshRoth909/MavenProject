package cohesion;

import java.sql.SQLOutput;

public class MakeString {

    // what does cohesion mean?
    // it means when things work together well
    // with regards to OOP, it means a class' data works well as a whole


    public static String getsString(){
        return "This is a String";
    }

    public void printString(){
        System.out.println(getsString());
    }

}
