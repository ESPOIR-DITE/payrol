package domain.demography;

public class Gender {
    private int id;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder{
        private int id;
        private String description;

        public Builder(int id){
            this.id=id;
        }
        public Builder getDescription(String description){
            this.description=description;
            return this;
        }
        public Gender getGender(){
            Gender gender=new Gender();
            gender.description=this.description;
            gender.id=this.id;
            return gender;
        }
    }
}
