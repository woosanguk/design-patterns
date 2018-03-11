package patterns.iterator_composite_10;

import java.util.Iterator;

class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("채식주의자용 BLT", "통밀 위에(식물성)베이컨, 상추, 토마토를 넞은 메뉴", true, 2.99);
        addItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems[numberOfItems] = menuItem;
        numberOfItems = numberOfItems + 1;
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
