package domain.employeeObj;

import domain.demography.Gender;
import domain.demography.Race;
import domain.employe.Employee;

public class EmployeeObject {
    private Gender gender;
    private Race race;
    private Employee employee;

    private EmployeeObject() {
    }


    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "employeeObject{" +
                "gender=" + gender +
                ", race=" + race +
                ", employee=" + employee +
                '}';
    }
    public static class Builder{
        private Gender gender;
        private Race race;
        private Employee employee;

        public Builder(Gender gender) {
            this.gender = gender;
        }
        public Builder buildRace(Race race){
            this.race=race;
            return this;
        }
        public Builder buildEmployee(Employee employee){
            this.employee=employee;
            return this;
        }
        public EmployeeObject getEmployeeObject(){
            EmployeeObject object=new EmployeeObject();
            object.employee=this.employee;
            object.gender=this.gender;
            object.race=this.race;
            return object;
        }
    }
}
