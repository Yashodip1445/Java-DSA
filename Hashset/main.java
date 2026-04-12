// HashSet

// A HashSet is a collection that:

// Stores only unique values
// Does not maintain insertion order
// Is based on a hash table (HashMap internally)

import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();

        num.add(10);
        num.add(20);
        num.add(30);
        num.add(10); // duplicate
 
num.remove(20);
      
        System.out.println(num.add(50));
        System.out.println(num);

  
       
    }

}