
import java.util.ArrayList;
import java.util.List;
public class CoffeeMaker {
    List<Item> items;
    Quantity initialQuantity;
    public CoffeeMaker(List<Item> items, Quantity initialQuantity) {
        this.items = items;
        this.initialQuantity = initialQuantity;
    }

    public List<String> menu(){
        List<String> items = new ArrayList<>();
        for(Item item: this.items){
            items.add(item.name);
        }
        return items;
    }

    public void reduceQuantity (Quantity itemQUantity) {
        this.initialQuantity.coffeeQuantity-=itemQUantity.coffeeQuantity;
        this.initialQuantity.waterQuantity-=itemQUantity.waterQuantity;
        this.initialQuantity.milkQuantity-=itemQUantity.milkQuantity;
    }
}
