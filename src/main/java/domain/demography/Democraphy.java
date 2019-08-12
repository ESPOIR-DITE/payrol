package domain.demography;

import domain.employe.Employee;

public class Democraphy {

    private Gender gender;
    private Race race;

    private Democraphy() {
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

    @Override
    public String toString() {
        return "Democraphy{" +
                ", gender=" + gender +
                ", race=" + race +
                '}';
    }

    public static class Builder {
        private Gender gender;
        private Race race;

        /**public Builder(int id) {
            this.id = id;
        }*/

        public  Builder(Gender gender){
            this.gender=gender;
            //return this;
        }
        public Builder buildRace(Race race){
            this.race=race;
            return this;
        }

        public Democraphy getDemo(){
            Democraphy democraphy=new Democraphy();
            democraphy.gender=this.gender;
            democraphy.race=this.race;
            return democraphy;
        }
    }
}