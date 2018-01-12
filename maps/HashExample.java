package maps;

import java.util.HashMap;

/**
 * Created by igorsandler on 1/12/18.
 */
public class HashExample {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("John", "444333555");
        phoneBook.put("Chase", "665442233");
        String var = phoneBook.get("John");
        for (String key : phoneBook.keySet() ) {
            System.out.println("Key = " + key + ":" + " Value = " + phoneBook.get(key));
        }

    }
}
