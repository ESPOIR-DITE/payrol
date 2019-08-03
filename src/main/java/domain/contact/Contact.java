package domain.contact;

public class Contact {
    private int id;
    private String cellPhne;
    private String homePhone;
    private String email;

    private Contact() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCellPhne() {
        return cellPhne;
    }

    public void setCellPhne(String cellPhne) {
        this.cellPhne = cellPhne;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", cellPhne='" + cellPhne + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder{
        private int id;
        private String cellPhne;
        private String homePhone;
        private String email;

        public Builder(int id){
            this.id=id;
        }
        public Builder getCellPhone(String cellPhne) {
            this.cellPhne = cellPhne;
            return this;
        }
        public Builder buildCellPhone(String cellPhne){
            this.cellPhne=cellPhne;
            return this;
        }
        public Builder buildHomePhone(String homePhone){
            this.homePhone=homePhone;
            return this;
        }
        public Builder buildEmail(String email){
            this.email=email;
            return this;
        }
        public Contact getContact(){
            Contact contact=new Contact();
            contact.id=this.id;
            contact.cellPhne=this.cellPhne;
            contact.email=this.email;
            contact.homePhone=this.homePhone;

            return contact;
        }
    }


}
