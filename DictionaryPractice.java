package dictionarypractice;

import java.time.MonthDay;
import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

    public static void main(String[] args) {
        // English to Spanish Dictionary
        Map<String, String> englSpanDictionary = new HashMap<>();
        // Putting thing inside out dictionary
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miercoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sabado");
        englSpanDictionary.put("Sunday", "Domingo");
        // Retrive things from our dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        // Print out all keys
        System.out.println(englSpanDictionary.keySet());
        // Print out all values
        System.out.println(englSpanDictionary.values());
        // Print out size
        System.out.println("The Size of our Diction " + englSpanDictionary.size());

        System.out.println();
        System.out.println();

        //Shopping list
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        // Put some stuff in dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", false);
        // Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Oreos"));
        // Key-Values Pairs Print Out
        System.out.println(shoppingList.toString());
        // Is Empty?
        System.out.println(shoppingList.isEmpty());
        // Remove things
        shoppingList.remove("Eggs");
        //Replace values for a certain key
        shoppingList.replace("Bread", Boolean.FALSE);
        // Key-Values Pairs Print Out
        System.out.println(shoppingList.toString());


        // Clear out dictionary
        shoppingList.clear();
        // Key-Values Pairs Print Out
        System.out.println(shoppingList.toString());
    }
}
