package snippets;
import java.util.*;
import java.lang.*;
import java.io.*;

class IfElseExample1 {
    public boolean studentCanWatch(int age, boolean withParent) {
        boolean canWatch;


        // If Statement with 1 Boolean Value, 1 (age) Variable value.
        // This If Statment is checking between 2 conditions (Indicated by the OR and AND operators [|| &&])
        if((age >= 18) || (age >= 13 && withParent == true)){
            canWatch = true;
        }else {
            canWatch = false;
        }
        //
        return canWatch;
    }
}