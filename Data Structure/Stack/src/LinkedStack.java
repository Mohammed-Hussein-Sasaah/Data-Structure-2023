
public class LinkedStack<E>implements Stack<E> {

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
    public E top() {
        return list.First();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }



    public void transfer(Stack<E> S,Stack<E> T)
    {
        while (!S.isEmpty())
        {
            T.push(S.pop());
        }
    }
    public void removeAll()
    {
        while (!isEmpty())
        {
            pop();
        }
    }



}