package W9Q2;

public class University {
    String name;
    int ranking;

    University(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public void Details() {
        System.out.println("University Name: " + name);
        System.out.println("Ranking: " + ranking);
    }
}
