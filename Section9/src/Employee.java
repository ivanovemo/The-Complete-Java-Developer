public abstract class Employee {
    public String firstName;
    public String lastName;
    public int age;

    public Employee(String firstname, String lastName, int age) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName() {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public abstract String work();
}
