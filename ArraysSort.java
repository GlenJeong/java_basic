package java_basic;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort {

    public static void main(String[] args) {
        String[] strArr = { "Dogs", "cats", "lion", "Birds", "tiger", "monkey", "zibra", "elephant" };
        String[] monthArr = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        String[] dateArr = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(monthArr));
        System.out.println(Arrays.toString(dateArr));

        System.out.println();
        System.out.println();

        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(monthArr);
        System.out.println(Arrays.toString(monthArr));
        Arrays.sort(dateArr);
        System.out.println(Arrays.toString(dateArr));

        System.out.println();
        System.out.println();

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(monthArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(monthArr));
        Arrays.sort(dateArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(dateArr));

        System.out.println();
        System.out.println();

        Arrays.sort(dateArr, new Descending());
        System.out.println(Arrays.toString(dateArr));
    }
}

class Descending implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;

            return c1.compareTo(o2) * -1;

        }
        return -1;

    }

}
