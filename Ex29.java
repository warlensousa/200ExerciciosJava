
import java.util.Arrays;

public class Ex29 {
    public static void main(String[] args) {
        int[] numberInt = new int[5];
        
        for(int i = 0; i < numberInt.length; i++) {
            numberInt[i] = i;
        }

        System.out.println(Arrays.toString(numberInt));


    }
}