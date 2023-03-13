//Cloning Objects Arrays
import java.util.Arrays;

public class CloningObjectsArrays {
    public static void main(String[] args) {
        String[] ObjectsArrays ={"Mohammed","Khaled","Nasser"};
        String[] CloneArray = ObjectsArrays.clone();;

        System.out.println("ObjectsArrays : " + Arrays.toString(ObjectsArrays));
        System.out.println("CloneArray : " + Arrays.toString(CloneArray));
    }
}