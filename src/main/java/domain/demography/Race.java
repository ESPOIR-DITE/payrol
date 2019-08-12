package domain.demography;

public class Race {
    private String descriptio;
    private int id;

    public String getDescriptio() {
        return descriptio;
    }

    public void setDescriptio(String descriptio) {
        this.descriptio = descriptio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Race{" +
                "descriptio='" + descriptio + '\'' +
                ", id=" + id +
                '}';
    }

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
