package src.constuctors;

public class Child extends Parent {
    private String patronymic;

    public Child(String name, int age, String patronymic) {
        super(name, age);
        this.patronymic = patronymic;
    }

    public Child(String patronymic) {
        super();
        this.patronymic = patronymic;
    }
}
