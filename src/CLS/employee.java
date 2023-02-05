package CLS;

import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.util.*;


public class employee extends Person implements Serializable {
    double salary;
    java.sql.Date payment_date;

    public employee() {

    }

    public employee(int id, String name, String phone, double salary, java.sql.Date payment_date) {
        super(id, name, phone);
        this.salary = salary;
        this.payment_date = payment_date;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public java.sql.Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(java.sql.Date payment_date) {
        this.payment_date = payment_date;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", Phone='" + phone + '\'' +
                ", salary=" + salary +
                ", payment_date=" + payment_date +
                '}';
    }

    //to write
    ObjectOutputStream output;
    public void openFile()
    {
        try {
            output=new ObjectOutputStream(Files.newOutputStream(Paths.get("employeeSer.ser")));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
    List<employee> em =new ArrayList<employee>();
    public void addRecord(){
        LocalDate today =  LocalDate.now();             //Today
        LocalDate PayDate = today.plusDays(20);
        java.sql.Date d = java.sql.Date.valueOf( PayDate ) ;
        em.add(new employee(0,"ali","0584739205",6700.0,d));
        em.add(new employee(0,"omar","0503759135",5700.0,d));
        em.add(new employee(0,"khalid","0528375623",4700.0,d));
        em.add(new employee(0,"mohammed","0548134512",7700.0,d));

        for (employee e:em){
            try {
                output.writeObject(e);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void close(){
        try {
            if (output!=null){
                output.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //to read
    ObjectInputStream input;
    public    void openToGet(){
        try {
            input=new ObjectInputStream(Files.newInputStream(Paths.get("employeeSer.ser"))) ;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<employee> readData(){
        List<employee> rem =new ArrayList<employee>();
        try {
            while (true){
                employee e= (employee) input.readObject();
                rem.add(e);
            }
        } catch (EOFException e){
            System.out.println("no more file");
        }catch (ClassCastException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rem;
    }

    public void closeFile(){
        try {
            if (input!=null){
                input.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
