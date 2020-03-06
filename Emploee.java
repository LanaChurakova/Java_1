package lesson5;

public class Emploee {
    private String name;
    private String post;
    private String email;
    private String tel;
    private int age;
    private int salary;

    public Emploee(String name, String post, String email, String tel, int age, int salary) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getPost() {
        return post;
    }
    public String getEmail() {
        return email;
    }
    public String getTel() {
        return tel;
    }
    public int getSalary() {
        return salary;
    }

    public String getEmploee() {
        return ("Имя сотрудника: " + getName() +
                "\nДолжность сотрудника: " + getPost() +
                "\nE-mail сотрудника: " + getEmail() +
                "\nТелефон сотрудника: " + getTel() +
                "\nВозраст сотрудника: " + getAge() +
                "\nОклад сотрудника: " + getSalary());
    }

    public void adultAge(int ageMin) {
        if (this.age >= ageMin) {
            System.out.println(this.getName() + ", "+ this.getAge());
        } else return;
    }
}
