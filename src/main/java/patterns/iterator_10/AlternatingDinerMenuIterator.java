package patterns.iterator_10;

import java.util.Calendar;
import java.util.Iterator;

class AlternatingDinerMenuIterator implements Iterator{
    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items){
        this.items = items;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.DAY_OF_WEEK % 2;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null){
            return false;
        }
        return true;
    }

    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 2;
        return menuItem;
    }

    public void remove() {
        throw new UnsupportedOperationException("remove()는 지원하지 않습니다.");
    }
}
