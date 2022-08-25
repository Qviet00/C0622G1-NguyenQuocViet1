package Case_Study.models;

public class Employee extends ManagementSystem {
    private String level;
    private String location;
    private String salary;

    public Employee() {
    }

    public Employee(String level, String location, String salary) {
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public Employee(String id, String name, String birthDay, String grand, double numberCard,
                    String numberPhone, String email, String level, String location, String salary) {
        super(id, name, birthDay, grand, numberCard, numberPhone, email);
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", this.getId(), this.getName(),
                this.getBirthDay(), this.getGrand(), this.getNumberCard(), this.getNumberPhone(), this.getEmail(), getLevel(),
                getLocation(), getSalary());
    }
}