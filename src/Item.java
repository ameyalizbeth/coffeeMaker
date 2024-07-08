public  class Item {
    String name;
    private int price;
    Quantity quantity;
    public Item(String name, int price, Quantity quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPrice() {
        return this.price;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}
