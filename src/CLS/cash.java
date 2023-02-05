package CLS;

public class cash extends Payment {
    String currency;

    public cash() {

    }

    public cash(int pay_id, double total_price, String currency) {
        super(pay_id, total_price);
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "cash{" +
                "pay_id=" + pay_id +
                ", Total_price=" + Total_price +
                ", currency='" + currency + '\'' +
                '}';
    }
}
