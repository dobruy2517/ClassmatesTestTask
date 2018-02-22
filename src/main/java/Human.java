public abstract class Human {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public Human setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Human setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public  Human(){

    }
}
