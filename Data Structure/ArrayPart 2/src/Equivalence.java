import java.util.Arrays;

public class Equivalence {
    public static void main(String[] args)
    {
        int[] arr1 = new int [] {10, 20, 30, 40};
        int[] arr2 = new int [] {10, 20, 30, 40};

        // لو قمنا بتغير رقم في احداهم سيهظر الناتج False
        System.out.println("is arr1 equals to arr2 : " + Arrays.equals(arr1, arr2));
    }
}
