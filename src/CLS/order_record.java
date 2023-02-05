package CLS;

public class order_record {
    Order order;
    Payment pay;
    Customer customer;
    int num_items;


    public order_record(Order order, Payment pay, Customer customer, int num_items) {
        this.order = order;
        this.pay = pay;
        this.customer = customer;
        this.num_items = num_items;
    }

    public order_record() {
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Payment getPay() {
        return pay;
    }

    public void setPay(Payment pay) {
        this.pay = pay;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getNum_items() {
        return num_items;
    }

    public void setNum_items(int num_items) {
        this.num_items = num_items;
    }

    @Override
    public String toString() {
        String sym=null;
          if (pay instanceof cash){
               sym = "********************************\n" +
                       "*         Ticket Summery        *\n" +
                       "********************************\n" +
                       "  Order ID:    " +  order.getId()+ "\n" +
                       "  Customer Information:\n" +
                       "  ID: " + customer.getId() + "\n" +
                       "  Name: " + customer.getName() + "\n" +
                       "  Phone: " + customer.getPhone() + "\n" +
                       "  Number Of Items: " + num_items + "  Total Price: " + pay.getTotal_price() + "\n" +
                       "  Payment Way : Cash \n" ;
          }
          if (pay instanceof card){
              sym = "********************************\n" +
                      "*         Ticket Summery        *\n" +
                      "********************************\n" +
                      "  Order ID:    " +  order.getId()+ "\n" +
                      "  Customer Information:\n" +
                      "  ID: " + customer.getId() + "\n" +
                      "  Name: " + customer.getName() + "\n" +
                      "  Phone: " + customer.getPhone() + "\n" +
                      "  Number Of Items: " + num_items + "  Total Price: " + pay.getTotal_price() + "\n" +
                      "  Payment Way : Caard \n" ;
          }
          return sym;

    }
}
