package domain.demography;

public class Race {
    private String descriptio;
    private int id;

    private Race() {
    }

    public static class Builder{
        private String descriptio;
        private int id;

        public Builder(int id) {
            this.id=id;
        }
        public Builder buildDescription(String descriptio){
            this.descriptio=descriptio;
            return this;
        }
        public Race getRace() {
            Race race = new Race();
            race.descriptio=this.descriptio;
            race.id=this.id;
            return race;

        }
    }
}
