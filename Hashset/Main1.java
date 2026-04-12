import java.util.HashSet;

public class Main1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Java"); // duplicate

        System.out.println("Set: " + set);

        System.out.println("set contains " + set.contains("java"));
        set.remove("python");

        System.out.println(" get Size " + set.size());

        for (String lang : set) {
            System.out.println(lang);
        }

        set.clear();
        System.out.println("Set clear" + set);

        set.add("js");
        System.out.println("newSet" + set);

    }
}