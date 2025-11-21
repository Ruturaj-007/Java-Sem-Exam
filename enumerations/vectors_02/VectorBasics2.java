package sem_exm.enumerations.vectors_02;

import java.util.Vector;

public class VectorBasics2 {
    public static void main(String[] args) {
        Vector<Integer> Players = new Vector<>(2); // Initial capacity = 2
        System.out.println("Initial Capacity : " + Players.capacity());

        // Add elements tot trigger capacity increase
        Players.add(10);
        Players.add(20);
        System.out.println("Capacity after adding 2 elements: " + Players.capacity());

        // Using set() method to replace 10 with 11
        System.out.println("The Object that is replaced is: " + Players.set(0, 11));

        System.out.println("The new Vector is:" + Players);

        // Removing first occurrence element at 1st index
        Players.remove(1);

        System.out.println("After removal: " + Players);

        // Iterating in Vector
        for (int i = 0; i < Players.size(); i++) {
            System.out.println(Players.get(i) + " ");
        }

        for(int ele : Players) {
            System.out.println(ele + " ");
        }
    }
}
