import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateInArray {
    public static int repeatedNumber(final List<Integer> a) {
        HashSet<Integer> hash = new HashSet<>();
        int repeatedNumber = -1;
        for(Integer x:a){
            if(!hash.add(x)){
                repeatedNumber = x;
                break;
            }
        }
        return repeatedNumber;
    }

    public static void main(String[] args) {
        System.out.println(repeatedNumber(Arrays.asList(1, 3, 2, 4)));

        System.out.println(repeatedNumber(Arrays.asList(1, 3, 2, 2, 4)));
    }
}
