import java.util.ArrayList;
import java.util.Arrays;

public class RotateMatrix {

    public static void rotate(ArrayList<ArrayList<Integer>> a) {
        swapRows(a);
        tranpose(a);
    }

    public static void tranpose(ArrayList<ArrayList<Integer>> a) {
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                int temp = a.get(i).get(j);
                a.get(i).set(j, a.get(j).get(i));
                a.get(j).set(i, temp);
            }
        }
    }

    public static void swapRows(ArrayList<ArrayList<Integer>> a) {
        for (int  i = 0, k = a.size() - 1; i < k; ++i, --k) {
            ArrayList<Integer> x = a.get(i);
            a.set(i, a.get(k));
            a.set(k, x);
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        firstRow.add(2);

        ArrayList<Integer> secondRow = new ArrayList<>();
        secondRow.add(3);
        secondRow.add(4);

        input.add(firstRow);
        input.add(secondRow);

        rotate(input);
    }
}
