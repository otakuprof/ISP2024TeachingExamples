package Example38;

public interface CustomStack<T> {
    // T is type parameter

    void push(T t);

    T pop();

    int size();

    T peek();

    boolean isEmpty();
}

