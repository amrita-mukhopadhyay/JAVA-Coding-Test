/*Write a Java program to create an ArrayList of integers, 
add elements to it, and then iterate through the list to print each element*/

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> integerList = new ArrayList<>();

        // Add elements to the list
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);

        // Iterate through the list and print each element
        System.out.println("Elements in the ArrayList:");
        for (int num : integerList) {
            System.out.println(num);
        }
    }
}
