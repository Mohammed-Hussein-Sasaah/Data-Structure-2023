public class SinglyLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }


    public E First() {
        if (isEmpty()) return null;
        return head.Element;
    }

    public E Last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addfirst(E newElement) {
        head = new Node<E>(newElement, head);
        if (isEmpty())
            tail = head;
        size++;
    }

    public void addLast(E newElement) {
        Node<E> newest = new Node<E>(newElement, null);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        E Deleted = head.Element;
        head = head.next;
        size--;
        if (size == 0) tail = null;
        return Deleted;
    }

    public void Finding() {
        while (head.next != null) {
            System.out.println(head.next.Element);
            head = head.next;
        }
    }

    public void rotate() {
        addLast(removeFirst());
        // لا تعمل للاسف
    }

    public int Concatenating(SinglyLinkedList L, SinglyLinkedList M) {

        SinglyLinkedList<String> result;
        SinglyLinkedList<String> temp;
        try {
            result = (SinglyLinkedList<String>) L.clone(); // game1 copied into result
            temp = (SinglyLinkedList<String>) M.clone(); // get copy of second list, which we will destroy in the process of concatenation
        } catch (CloneNotSupportedException e) { // can only happen if it was not implemented
            return 0;
        }
        while (!temp.isEmpty()) {
            result.addLast(temp.removeFirst());
        }

        return result;
    }


    public void reverse() {
        if (head != null) {
            Node<E> Next = head;
            Node<E> R = null;
            while (head != null) {
                Next = head.getNext();
                head.setNext(R);
                R = head;
                head = Next;
            }
            head = R;
        }
    }

    static class Node<E> {
        E Element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.Element = element;
            this.next = next;
        }

        public E getElement() {
            return Element;
        }

        public void setElement(E element) {
            this.Element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}