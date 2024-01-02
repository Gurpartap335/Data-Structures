package lecture.stack;

import java.util.Collection;

public interface LifoStack<E> extends Collection<E> {
    E peek();

    E pop();

    void push(E item);
}
