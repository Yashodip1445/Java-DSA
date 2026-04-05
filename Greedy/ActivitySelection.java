import java.util.*;

class Activity {
    int start, end;

    Activity(int s, int e) {
        start = s;
        end = e;
    }
}

public class ActivitySelection {
    public static void main(String[] args) {
        Activity[] arr = {
            new Activity(1, 3),
            new Activity(2, 5),
            new Activity(4, 7),
            new Activity(6, 9),
            new Activity(8, 10)
        };

        // Sort by end time
        Arrays.sort(arr, (a, b) -> a.end - b.end);

        int count = 1;
        int lastEnd = arr[0].end;

        System.out.println("Selected Activities:");
        System.out.println(arr[0].start + " " + arr[0].end);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].start >= lastEnd) {
                System.out.println(arr[i].start + " " + arr[i].end);
                lastEnd = arr[i].end;
                count++;
            }
        }

        System.out.println("Max Activities = " + count);
    }
}