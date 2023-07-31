package org.assessment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UnorderedList {

    //Return the array that contains the given number
    public static String getArrayContainingNumber(int number) {

        String arrayWithNumber = null;

        String numbers1 = "1,2,3,4";
        String numbers2 = "5,6,7,8";

        HashMap<String ,String[]> numbers = new HashMap<>();

        numbers.put(numbers1, numbers1.split(","));
        numbers.put(numbers2, numbers2.split(","));

        for (Map.Entry<String, String[]> entry : numbers.entrySet()) {
            if (entry.getKey().contains(""+number+"")) {
                arrayWithNumber = Arrays.toString(entry.getValue());
                break;
            } else
                arrayWithNumber = "Number "+ number +" doesn't exist in the arrays.";
        }
        return arrayWithNumber;
    }
}
