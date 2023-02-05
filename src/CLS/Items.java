package CLS;

public class Items {
    int item_id;
    String item_name;
    double item_prise;

    public Items() {
    }

    public Items(int item_id, String item_name, double item_prise) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.item_prise = item_prise;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public double getItem_prise() {
        return item_prise;
    }

    public void setItem_prise(double item_prise) {
        this.item_prise = item_prise;
    }

    @Override
    public String toString() {
        return item_name + "\t\t prise= " + item_prise;
    }



}

