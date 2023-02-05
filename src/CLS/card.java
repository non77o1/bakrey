package CLS;

public class card extends Payment {

    String owner_name;
    String card_num;
    String CCV;

    public card() {

    }

    public card(int pay_id, double total_price, String owner_name, String card_num, String CCV) {
        super(pay_id, total_price);
        this.owner_name = owner_name;
        this.card_num = card_num;
        this.CCV = CCV;
    }



    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getCard_num() {
        return card_num;
    }

    public void setCard_num(String card_num) {
        this.card_num = card_num;
    }

    public String getCCV() {
        return CCV;
    }

    public void setCCV(String CCV) {
        this.CCV = CCV;
    }

    @Override
    public String toString() {
        return "card{" +
                "pay_id=" + pay_id +
                ", Total_price=" + Total_price +
                ", owner_name='" + owner_name + '\'' +
                ", card_num='" + card_num + '\'' +
                ", CCV='" + CCV + '\'' +
                '}';
    }
}
