package java_basic;

public class Coustomer implements Comparable<Coustomer> {
    private String name;
    private int age;

    public Coustomer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[Name: " + name + ", Age: " + age + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Coustomer coustomer = (Coustomer) o;

        return name.equals(coustomer.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public int compareTo(Coustomer coustomer) {
        if (this.age > coustomer.getAge()) {
            return 1;
        } else if (this.age == coustomer.getAge()) {
            return 0;
        } else {
            return -1;
        }

    }
}
