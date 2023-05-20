package serializable;

import java.io.Serializable;
import java.io.*;

public class Student implements Serializable {
    static int id;
    String name;
    Address homeAddress;
    transient String phoneNumber;


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", homeAddress=" + homeAddress.city +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public Student(int id, String name, String city, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.homeAddress= new Address(city);
        this.phoneNumber = phoneNumber;
        System.out.println("Constructor "+this);
    }

    class Address implements Serializable {
        String city;

        public Address(String city){
            this.city=city;
        }
    }

    public static void main(String[] args) {
        try {
            //Creating the object
            //Creating stream and writing the object
            FileOutputStream file = new FileOutputStream("/Users/megha/Documents/ser.csv");
            ObjectOutputStream obj = new ObjectOutputStream(file);
            obj.writeObject(new Student(1, "Megha","Bhagalpur","9521343704"));
            obj.flush();
            //closing the stream
            obj.close();
            System.out.println("success");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
///// Deserialization
        try {
            Student.id=100;
            FileInputStream file = new FileInputStream("/Users/megha/Documents/ser.csv");
            ObjectInputStream in = new ObjectInputStream(file);
            Student student = (Student)  in.readObject();

            in.close();
            System.out.println("Deserialization");
            System.out.println(student);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
    }
}

