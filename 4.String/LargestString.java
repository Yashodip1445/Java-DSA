public class LargestString {
    public static void main(String[] args) {
        String fruits[] = { "apple ", "mango ", "zebra", " banana" };
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            // if (largest.compareToIgnoreCase(fruits[i])>0){
            //   or
            // compareTo ==> " A " or "a"  are not same 
            // compareToIgnoreCase ==> " A " or "a"  are  same 

            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
