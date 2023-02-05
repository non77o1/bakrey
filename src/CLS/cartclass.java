package CLS;

public class cartclass {
    int order_id;
    int item_id;
    int numItem;
    double totalPrice;
    Items items;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public int getNumItem() {
        return numItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public cartclass() {
    }

    public cartclass(int order_id, int item_id, int numItem, double totalPrice) {
        this.order_id = order_id;
        this.item_id = item_id;
        this.numItem = numItem;
        this.totalPrice = totalPrice;
//        this.items = null;
    }

    public String toString(){
        return "\nnum: "+numItem+" "+items.getItem_name()+"  total price: "+totalPrice+"\n";
    }
}
