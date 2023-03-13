public class CircularlyLinkedList<E> {

    private Node<E> tail = null;
    private int size;

    public CircularlyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;
        return tail.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void AddFirst(E element) {
        if (size == 0) {
            tail = new Node<>(element, null);
            tail.setNext(tail);
        } else {
            Node<E> newe = new Node<>(element, tail.getNext());
            tail.setNext(newe);
        }
        size++;
    }

    public void AddLast(E e) {
        AddFirst(e);
        tail = tail.next;

    }

    public E removeFirst() {
        if (isEmpty()) return null;
        Node<E> d = tail.next;
        if (d == tail) tail = null;
        else
            tail.next = d.next;
        size--;
        return d.element;
    }


    public void rotate() {
        if (tail != null)  // if(!isEmpty())
            tail = tail.getNext();
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        CircularlyLinkedList l = (CircularlyLinkedList) o;
        if (size != l.size) return false;
        Node y = tail.next;
        Node Head = tail.next;
        Node lHead = l.tail.next;
        while (Head.next != y) {
            if (!Head.getElement().equals(lHead.getElement())) return false;
            Head = Head.getNext();
            lHead = lHead.getNext();
        }
        return true;
    }


    public boolean SameSequence(CircularlyLinkedList List) {
        Node<E> L;
        Node<E> M;
        int count = 0;
        if (List.size > size) {
            L = List.tail.next;
            M = tail.next;
        } else {
            L = tail.next;
            M = List.tail.next;
        }
        while (L.element != M.element) {
            M = M.next;
        }
        if (L.element == M.element) {
            count++;
        }
        if (count > 1) return true;
        return false;
    }

    //    public CircularlyLinkedList<E> clone() throws CloneNotSupportedException
//    {
//        CircularlyLinkedList<E> other = (CircularlyLinkedList<E>)
//        if (size > 0) {
//            other.tail = new Node<>(head.getElement(), null);
//            Node<E> walk = head.getNext();
//            Node<E> otherTail = other.head;
//            while (walk != null) {
//                Node<E> newest = new Node<>(walk.getElement(), null);
//                otherTail.setNext(newest);
//                otherTail = newest;
//                walk = walk.getNext();
//            }
//        }
//        return other;
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}