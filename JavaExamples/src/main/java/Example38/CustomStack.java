package Example38;

public interface CustomStack<T> {

    void push(T t);

    T pop();

    int size();

    T peek();

    boolean isEmpty();
}

