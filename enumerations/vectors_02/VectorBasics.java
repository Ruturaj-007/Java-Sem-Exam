package sem_exm.enumerations;

import java.util.Vector;

public class VectorBasics {
    public static void main(String[] args) {
        // Create a Vector of strings
        Vector<String> fruits = new Vector<>();

        // Add elements to the vector
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.addElement("Grape"); // Method - 2 to add ele

        System.out.println("Fruits in the Vector: " + fruits);

        // Access elements of Vector by index
        String firstFruit = fruits.get(0);
        System.out.println("First Fruit : " + firstFruit);

        // Get the size Vector
        int fruitsSize = fruits.size();
        System.out.println("Size of Fruits Vector : " + fruitsSize);

        // Remove an element
        fruits.remove("Banana");
        System.out.println("Fruits after removing Banana: " + fruits);

        // Clear all elements
        fruits.clear();
        System.out.println("Fruits after clearing: " + fruits);


    }
}
