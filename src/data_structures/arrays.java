package data_structures;
import java.util.ArrayList;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
//        int[] numbers = new int[5];
        int[] numbers = {2, 4, 6, 8};
        System.out.println(Arrays.toString(numbers));

        ArrayList<Integer> List = new ArrayList<>();
        List.add(10);
        List.add(20);
        List.toArray();
        System.out.println(List);

    }
}
