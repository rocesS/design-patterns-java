package org.example.Iterator;

import java.util.List;

public class NameRepository implements Container {
    List<String> list = List.of("one, two, three, four");
    public Iterator getIterator() {
        return new IteratorImpl();
    }

    private class IteratorImpl implements Iterator {
        int index = 0;
        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public Object next() {
            return list.get(index++);
        }
    }
}
