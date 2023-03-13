

import java.util.Arrays;

public class Concatenate {
    public static void main(String[] args)
    {
        int[] First = { 100, 200, 300, 400 };
        int[] Second = { 500, 600, 700, 800 };

        int a1 = First.length;
        int b1 = Second.length;

        int Temp = a1 + b1;
        int[] NewArray = new int[Temp];

        System.arraycopy(First, 0, NewArray, 0, a1);
        System.arraycopy(Second, 0, NewArray, a1, b1);

        System.out.println(Arrays.toString(NewArray));
    }
}
