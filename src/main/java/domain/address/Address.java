package domain.address;

public class Address {
    private int addressId;
    private String streetAddress;
    private String postalAddress;

    private Address() {
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", streetAddress='" + streetAddress + '\'' +
                ", postalAddress='" + postalAddress + '\'' +
                '}';
    }

    public static class Builder{
        private int addressId;
        private String streetAddress;
        private String postalAddress;

        public Builder(int addressId) {
            this.addressId = addressId;
        }
        public Builder buildStreet(String streetAddress){
            this.streetAddress=streetAddress;
            return this;
        }
        public Builder buildPostal(String postalAddress){
            this.postalAddress=postalAddress;
            return this;
        }
        public Address getAddress()
        {
            Address address = new Address();
            address.addressId=this.addressId;
            address.postalAddress=this.postalAddress;
            address.streetAddress=this.streetAddress;
            return address;
        }
    }
}
