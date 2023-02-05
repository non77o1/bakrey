package CLS;

import java.io.Serializable;

public class Person implements Serializable {
    int Id;
    String name;
    String phone;

    public Person() {
    }

    public Person(int id, String name, String phone) {
        Id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", Phone='" + phone + '\'' +
                '}';
    }
}

