import java.util.ArrayList;
import java.util.Random;

public class Removes {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList();
        name.add("Mohammed");
        name.add("Khaled");
        name.add("Nasser");

        Random rn = new Random();
        int a;
        while (!name.isEmpty()) {
            a = rn.nextInt(name.size());
            System.out.println(name);
            name.remove(a);
        }
    }
}