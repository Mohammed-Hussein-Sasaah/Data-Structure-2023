public class Test {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> A=new SinglyLinkedList<>();

        System.out.println(A.isEmpty());
        System.out.println(A.size());

        A.addfirst(10);
        A.addLast(20);
        A.addLast(30);
        A.addfirst(100);


        System.out.println(A.Last());
        while (!A.isEmpty())
            System.out.print(A.removeFirst()+"\t");

        System.out.println(A.rotate());
    }
}