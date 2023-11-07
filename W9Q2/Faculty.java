package W9Q2;

public class Faculty extends University{
    String name;

    Faculty(String name, String university, int ranking) {
        super(university, ranking);
        this.name = name;
    }

    public void Details() {
        System.out.println("Faculty Name: " + name);
        super.Details();
    }
    
}
