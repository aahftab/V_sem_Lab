package W9Q2;

public class Department extends Faculty{
    String name;
    String chairman;

    Department(String name, String chairman, String faculty, String university, int ranking) {
        super(faculty, university, ranking);
        this.name = name;
        this.chairman = chairman;
    }
    public void Details() {
        System.out.println("Name: " + name);
        System.out.println("Chairman: " + chairman);
    }

    public void Display() {
        this.Details();
        super.Details();
    }
}
