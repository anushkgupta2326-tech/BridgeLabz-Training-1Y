package workshop.Questions;

import java.util.*;

public class RemoveDuplicatesAL{

    public static void main(String[] args) {
        
        ArrayList<Integer> originalList = new ArrayList<>(
            Arrays.asList(10, 20, 10, 30, 20, 40, 10)
        );

        System.out.println("Original List (with duplicates): " + originalList);

        
        Set<Integer> uniqueSet = new LinkedHashSet<>(originalList);

        ArrayList<Integer> uniqueList = new ArrayList<>(uniqueSet);

        System.out.println("-----------------------------------------");
        System.out.println("Unique List (using LinkedHashSet - Order preserved): " + uniqueList);
    }
}

