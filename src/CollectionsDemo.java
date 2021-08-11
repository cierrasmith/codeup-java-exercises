import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsDemo {

    public static void main(String[] args) {

        ArrayList<String> lastNames = new ArrayList<>();

        lastNames.add("Wallace");
        lastNames.add("Thompson");
        lastNames.add("Smith");

        System.out.println(lastNames);

        // Java Array/add
//        String [] lastNames2 = new String[10];
//        lastNames2 = Arrays.copyOf(lastNames2, lastNames2.length + 1);
//        lastNames2[lastNames2.length - 1] = "Wallace";

        // .size method example:
        System.out.println("The size of the lastNames array list is: " + lastNames.size() + "\n");

        // .get method example:
        System.out.println("The element value returned will be Wallace: " + lastNames.get(0) + "\n");

        // .contains method example:
        System.out.println("We are checking to see if Wallace is an element in the array list: " + lastNames.contains("Wallace") + "\n");

        // .remove method example:
        System.out.println(lastNames);
        lastNames.remove(0);
        lastNames.remove("Smith");
        System.out.println(lastNames);

        // John's reverse solution:
//        Arrays.sort(arr, Collections.reverseOrder());
//
//        System.out.printf("Modified arr[] : %s",
//                Arrays.toString(arr));


        // .isEmpty method example:
        System.out.println(lastNames.isEmpty()); // false

        // .lastIndexOf method example:
        System.out.println(lastNames.lastIndexOf("Thompson"));
        System.out.println(lastNames);

        //Syntax for creating a hash map:
        HashMap<String, String> usernames = new HashMap<>();

        // .put() method example:
        usernames.put("Ryan", "ryanorsinger");
        usernames.put("Zach", "zgulde");
        usernames.put("Fernando", "fmendozaro");
        usernames.put("Justin", "jreich5");

        // Printing hash maps:
        System.out.println("4 usernames: " + usernames + "\n");

        // Get value of hash map key:
        System.out.println(usernames.get("Ryan"));

        // Getting a value that doesn't exist:
        System.out.println("Returning the value of a key that doesn't exist will result in: " + usernames.get("Mary") + "\n"); // will return null

        // .getOrDefault method example:
        System.out.println("This method will return a default value instead of null: " + usernames.getOrDefault("Mary", "No Username"));
        // .getOrDefault method does not SET key or value
        System.out.println("Mary has not been added to usernames: " + usernames + "\n");

        // .putIfAbsent() method example 1:
        usernames.putIfAbsent("Mary", "replacement value");
        System.out.println("If the key is not in the hash map, this method will set it: " + usernames + "\n");

        // .putIfAbsent() method example 2:
        usernames.putIfAbsent("Justin", "replacement value");
        System.out.println("This method will not overwrite current/existing values: " + usernames + "\n");

//        System.out.println(usernames.put("Justin", "Value2"));
//        System.out.println(usernames.put("Justin", "Value3")); // will overwrite value2
//
//        System.out.println(usernames);

        // .containsValue() or .containsKey() method example:
        System.out.println("Checking for keys where the value contains the default of 'replacement value' " + usernames.containsValue("replacement value") + "\n");

        // .replace() method example:
        usernames.replace("Mary", "marylee");
        System.out.println("Replacing the default value from the previous method: " + usernames + "\n");

        // .remove() method example:
        usernames.remove("Mary");
        System.out.println("Removing the key, Mary, and the value: " + usernames + "\n");

        // .clear() method example:
        usernames.clear();
        System.out.println("The hash map should be empty: " + usernames + "\n");

        // .isEmpty() method ex
    }
}
