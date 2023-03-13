
import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int Arr[] = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(Arr));
        reverse(Arr);
        System.out.println(Arrays.toString(Arr));
    }

    public static void reverse(int SecondArray[]) {
        int n = SecondArray.length - 1;
        for (int i = 0; i < SecondArray.length / 2; i++) {
            int TempElement = SecondArray[i];
            SecondArray[i] = SecondArray[n];
            SecondArray[n] = TempElement;
            n--;
        }
    }
}