package domain.employe;

public class Employee {
    private int employNumber;
    private String name;
    private String lastName;

    private Employee() {
    }

    public int getEmployNumber() {
        return employNumber;
    }

    public void setEmployNumber(int employNumber) {
        this.employNumber = employNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employNumber=" + employNumber +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder{
        private int employNumber;
        private String name;
        private String lastName;

        public Builder(int employNumber) {
            this.employNumber=employNumber;
        }
        public Builder buildName(String name){
            this.name=name;
            return this;
        }
        public Builder buildLastname(String lastName){
            this.lastName=lastName;
            return this;
        }
        public Employee getEmpoyee()
        {
            Employee employee=new Employee();
            employee.employNumber=this.employNumber;
            employee.lastName=this.lastName;
            employee.name=this.name;
            return employee;
        }
    }
}
