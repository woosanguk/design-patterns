package patterns.iterator_composite_10;

import java.util.Iterator;
import java.util.Stack;

class CompositeIterator implements Iterator{

    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    public boolean hasNext() {
        if (stack.empty()){
            return false;
        }
        Iterator iterator = (Iterator) stack.peek();
        if (!iterator.hasNext()){
            stack.pop();
            return hasNext();
        }
        return true;
    }

    public Object next() {
        if (hasNext()){
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu){
                stack.push(component.createIterator());
            }
            return component;
        }
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
