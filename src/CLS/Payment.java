package CLS;

import java.util.Date;

public class Payment {
    int pay_id;
    double Total_price;

    public int getPay_id() {
        return pay_id;
    }

    public void setPay_id(int pay_id) {
        this.pay_id = pay_id;
    }

    public Payment() {
    }

    public Payment(int pay_id, double total_price) {
        this.pay_id = pay_id;
        Total_price = total_price;
    }

    public double getTotal_price() {
        return Total_price;
    }

    public void setTotal_price(double total_price) {
        Total_price = total_price;
    }
}

