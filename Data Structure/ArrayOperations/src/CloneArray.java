import java.util.Arrays;

public class CloneArray {
    public static void main(String[] args) {
        int Arry[] = {10, 25, 352};
        int CloneArry[] = new int[Arry.length];

        CloneArry = Arry;
        System.out.println("Basic Array = " + Arrays.toString(Arry));
        System.out.println("Basic Array = " + Arrays.toString(CloneArry));


    }
}
