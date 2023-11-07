package W10Q1Nested;

public class Person {
    String name;
    String phone;
    Address add;
    DateOfBirth dob;
    public class Address{
        int hno;
        String street;
        String city;
        String state;

        Address(int hno, String street, String city, String state) {
            this.hno = hno;
            this.street = street; 
            this.city = city;
            this.state = state;
        } 
        public void displayAdd(){
            System.out.println("Address : " + hno + ", " + street + ", " + city + ", " + state);
        }
    }
    public class DateOfBirth{
        int day;
        int month;
        int year;

        DateOfBirth(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public void displayDOB(){
            System.out.println("Date of Birth : "+ day + "/" + month + "/" + year);
        }
    }

    Person(String name, String phone, int hno,String street, String city, String state, int day, int month, int year) {
        this.name = name;
        this.phone = phone;
        add = new Address(hno, street, city, state);
        dob = new DateOfBirth(day, month, year);
    }

    public void display() {
        System.out.println("Name : "+ name);
        System.out.println("Phone no. : " + phone);
        add.displayAdd();
        dob.displayDOB();
    }



    public static void main(String[] args) {
        Person p = new Person("Aftab", "7017021243", 12, "Medical Road", "Aligarh", "UP", 9, 03, 2003);
        p.display();
    }
}
