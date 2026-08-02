package homework11dot1;

public class Person {
    String name;
    int age;
    String profession;
// Конструктор
    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }
// Зміна професії
    public void setProfession(String newProfession) {
        profession = newProfession;
    }
// Виведення
    public void ShowInfo() {
    System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession);
    }
}
