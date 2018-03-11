package patterns.iterator_composite_10;

class MenuItem extends MenuComponent {
    private final String name;
    private final String description;
    private final boolean vegetarian;
    private final double price;

    public MenuItem(String name, String description, boolean vegetarian, double price){
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }

    public void print() {
        System.out.print("  " + getName());
        if (isVegetarian()){
            System.out.print("(v)");
        }
        System.out.print(", " + getPrice());
        System.out.println("    -- " + getDescription());
    }
}
