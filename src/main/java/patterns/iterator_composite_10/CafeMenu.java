package patterns.iterator_composite_10;

import java.util.Hashtable;
import java.util.Iterator;

class CafeMenu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("베지 버거와 에어 프라이", "통밀빵, 상추, 토마토, 감자튀김이 첨가된 베지 버거", true, 3.99);
        addItem("오늘의 스프","샐러드가 곁들여진 오늘의 스프", false, 3.69);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}