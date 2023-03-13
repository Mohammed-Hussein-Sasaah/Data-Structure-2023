import java.util.Arrays;

public class CloningIntegerArrays {
    public static void main(String[] args) {
        int[] NumberArray = {100,200,355};
        int[] CloneArray = NumberArray.clone();

        System.out.println("NumberArray : " + Arrays.toString(NumberArray));
        System.out.println("CloneArray : " + Arrays.toString(CloneArray));
    }
}