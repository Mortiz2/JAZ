package pl.pjatk.krzpro;

public class Student {

    public String firstName;
    public String lastName;

    public int index;

    public Student() {
        System.out.println("Student Bean utworzony");
        this.firstName = firstName;
        this.lastName = lastName;
        this.index = index;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
