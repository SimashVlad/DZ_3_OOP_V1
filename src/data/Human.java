package data;

public class Human {

    private String Name, secondName, gender, age;

    public Human(String firstName, String surname, String age, String gender) {
        this.Name = firstName;
        this.secondName = surname;
        this.gender = gender;
        this.age = age;
    }

    public Human() {
    }

    public String getName() {
        return Name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "(имя: " + Name + ", " + " фамилия: " + secondName + ", " + " пол: " + gender + ", " + " возраст: " + age +")";
    }
}