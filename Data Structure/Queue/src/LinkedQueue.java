public class LinkedQueue<E> implements Queue<E> {
    SinglyLinkedList<E> list = new SinglyLinkedList<>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E first() {
        return list.First();
    }

    @Override
    public void enqueue(E e) {
        list.addLast(e);
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }

    public void concatenate(LinkedQueue<E> q) {
        while (!q.isEmpty())
            enqueue(q.dequeue());
    }
}