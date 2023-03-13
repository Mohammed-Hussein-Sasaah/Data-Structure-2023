public class ArrayQueue<E> implements Queue<E> {
    private int Size = 0;
    private int f = 0;
    E[] data;
    static final int CAPACITY = 10;

    public ArrayQueue(int x) {
        data = (E[]) new Object[x];
    }

    public ArrayQueue() {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return Size == 0;
    }

    @Override
    public int size() {
        return Size;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        return data[f];
    }

    @Override
    public void enqueue(E e) {
        int x;
        if (Size == data.length)
            throw new IllegalStateException("Array is Full");
        else
            x = (f + Size) % data.length;
        data[x] = e;
        Size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) return null;
        E x = data[f];
        data[f] = null;
        f = (f + 1) % data.length;
        Size--;
        return x;
    }

    public E rotate() {
        E x = data[f];
        f = (f + 1) % data.length;
        return x;
    }

    public void clone(ArrayQueue<E> q) {
        ArrayQueue<E> q2 = new ArrayQueue<>();
        for (int i = 0; i < q.size(); i++)
            q2.enqueue(q.rotate());
    }
}