package iterator_composite;

import java.util.Iterator;

class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("채식주의자용 BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99);
    }

    void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_ITEMS){

        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
