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



    public void rotate() {
      tail.element=head.element;
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
