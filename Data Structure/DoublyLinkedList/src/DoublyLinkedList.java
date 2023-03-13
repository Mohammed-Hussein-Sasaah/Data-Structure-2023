public class DoublyLinkedList<E> {
    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;


    public DoublyLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, null, header);
        header.next = trailer;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public E first() {
        if (isEmpty()) return null;
        return header.next.element;
    }

    public E last() {
        if (isEmpty()) return null;
        return trailer.prev.element;
    }

    private void addBetween(E e, Node<E> next, Node<E> prev) {
        Node<E> newest = new Node<>(e, next, prev);
        prev.next = newest;
        next.prev = newest;
        size++;
    }

    public void addFirst(E e) {
        addBetween(e, header.next, header);
    }

    public void addLast(E e) {
        addBetween(e, trailer, trailer.prev);
    }

    private E remove(Node<E> Remove) {
        Node<E> p = Remove.prev;
        Node<E> n = Remove.next;
        p.next = n;
        n.prev = p;
        size--;
        return Remove.element;
    }

    public E removeFirst() {
        return remove(header.next);
    }

    public E removeLast() {
        return remove(trailer.prev);
    }

    public E middle() {
        Node<E> NextHeader = header.next;
        Node<E> Middle = NextHeader;
        int x = 0;
        while (NextHeader != trailer)
        {
            x++;
            NextHeader = NextHeader.next;
        }
        int div = x / 2;
        if ((div) % 2 == 0) Middle = Middle.prev;

        for (int i = 1; i <= div; i++) {
            Middle = Middle.next;
        }
        return Middle.element;
    }


    public boolean equals(Object o) {
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        DoublyLinkedList l = (DoublyLinkedList) o;
        if (size != l.size) return false;
        Node Head = header; // traverse the primary list
        Node lHead = l.header; // traverse the secondary list
        while (Head != null) {
            if (!Head.getElement().equals(lHead.getElement())) return false;
            Head = Head.getNext();
            lHead = lHead.getNext();
        }
        return true;
    }

    public void Concatenating(DoublyLinkedList<E> l) {
        Node<E> Trailer = trailer.prev;
        Node<E> header = l.header.next;
        Trailer.next = header;
        header.prev = Trailer;
        trailer.prev = null;
        l.header.next = null;
        size += l.size;

    }

        public int CheckSize() {
        int CheckSize = 0;
        Node<E> n = header;
            CheckSize++;
        while (header.next != null) {
            header = header.next;
            CheckSize++;
        }
        return CheckSize;
    }

    private class Node<E> {
        private E element;
        Node<E> prev;
        Node<E> next;

        public Node(E element, Node<E> next, Node<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
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

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }
}