import java.lang.reflect.Array;

public class leetcode14 {
    public static String longestCommonPrefix(String str) {
        Array.sort(str);
        String str1=str[0];
        String str2=str[str.length()-1];
        int index =0;
        while(index<str1.length()){
            if(str1.charAt(index)==str2.charAt(index)){
                index++;
            }
            else{
                break;
            }

            return index==0;
        }


        
    }
    public static void main(String[] args) {
        
    }
}
