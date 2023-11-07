package W10DynamicPolymorphism;

public class Main {
    public static void main(String[] args) {
        JavaLanguage j = new JavaLanguage();
        CPlusPlus c = new CPlusPlus();

        j.abstraction();
        j.polymorphism();
        j.inheritance();
        j.persistence();
        j.interfaces();

        c.abstraction();
        c.polymorphism();
        c.inheritance();
        c.template();
        c.friendFunction();
    }
}
