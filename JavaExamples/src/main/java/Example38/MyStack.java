package Example38;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> implements CustomStack<T>{
    // Since CustomStack takes in Type Parameter
    // So MyStack needs to do so as well

    // How do I store the elements of the stack?
    //private ArrayList<T> list = new ArrayList<>();
    private List<T> list;
    MyStack(){
        list = new ArrayList<>();
    }

    MyStack(List<T> list){
        this.list = list;
    }

    /** You don't need to care about the concrete type
     * Since you already know the storage is of List<T> interface
     * you guarantee can call the methods defined in this interface
     * @param t
     */
    @Override
    public void push(T t) {
        list.add(t);
    }
    // this will be in Pset 2B, so try yourself first :)
    @Override
    public T pop() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}