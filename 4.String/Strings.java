import java.util.Scanner;

public class Strings {
    public static void printletters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        // 1
        // char arr[]={ 'a','b', 'c','d'};
        // String str =" abcd";
        // String str1 = new String ("xyz@#1234");

        // System.out.println(arr);
        // System.out.println(str1);

        // // key point ==> String are IMMUTABlE

        // 2
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // 3
        // String fullName= "JayShreeRam";
        // System.out.println(fullName.length());

        // 4
        // concatenation
        // String FirstName = "Yashodip";
        // String lastName = "Wani";
        // String fullName = FirstName + " " + lastName;
        // System.out.println(fullName);
        // // System.out.println(fullName.charAt(1));

        // printletters(fullName);

        // 5
        String s1 = "Paradise";
        String s2 = "Paradise";
        String s3 = new String("Paradise");

        if (s1==s2){
            System.out.println("String are equal");}
            else{
                System.out.println("String are not equal");

            }
        
            if (s1.equals(s3)){
                System.out.println("String are equal");}
                else{
                    System.out.println("String are not equal");
                    
                }
                if (s1==s3){
                    System.out.println("String are equal");}
                    else{
                        System.out.println("String are not equal");
                        
                    }
                
            

    }
}