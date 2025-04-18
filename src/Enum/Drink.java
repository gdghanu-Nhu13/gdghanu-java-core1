package Enum; // nó có thể nói l à liệt k ê

public enum Drink {
    coffee(30000),
    tea(20000),
    smoothie(40000);

    private final int price;
    // constructor cua enum
    Drink(int price) {
        this.price = price;
    }

    // getter de lay gia
    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Drink myDrink = Drink.coffee;

        System.out.println("you chose: " + myDrink);
        System.out.println("the price is: " + myDrink.getPrice() + " Vnd");

        switch (myDrink) {
            case coffee :
                System.out.println("smells like fresh coffee!");
                break;
            case tea:
                System.out.println("a calming cup of tea");
                break;
            case smoothie:
                System.out.println("chilled smoothie coming right up");
                break;
        }
    }
}
