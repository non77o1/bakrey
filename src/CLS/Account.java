package CLS;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account implements Serializable {
    String username;
    String password;



    public Account() {
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    @Override
//    public String toString() {
//        return "Account{" +
//                "username='" + username + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }

    ObjectOutputStream output;
    public void openFile()
    {
        try {
            output=new ObjectOutputStream(Files.newOutputStream(Paths.get("AccountSer.ser")));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
    List<Account> em =new ArrayList<Account>();
    public void addRecord(){
        LocalDate today =  LocalDate.now();             //Today
        LocalDate PayDate = today.plusDays(20);
        java.sql.Date d = java.sql.Date.valueOf( PayDate ) ;
        em.add(new Account("ali55","5509"));
        em.add(new Account("omar88","8809"));
        em.add(new Account("khalid99","9909"));
        em.add(new Account("mohammed77","7709"));

        for (Account e:em){
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
    ObjectInputStream input;
    public    void openToGet(){
        try {
            input=new ObjectInputStream(Files.newInputStream(Paths.get("AccountSer.ser"))) ;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Account> readData(){
        List<Account> rem =new ArrayList<Account>();
        try {
            while (true){
                Account e= (Account) input.readObject();
                rem.add(e);
                System.out.println(e.getUsername()+" "+e.getPassword());
            }
        } catch (EOFException e){
            System.out.println("no more file");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
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

    public static void main(String[] args) {
        Account c=new Account();
        c.openFile();
        c.addRecord();
        c.close();

        c.openToGet();
        c.readData();
        c.closeFile();


    }

}
