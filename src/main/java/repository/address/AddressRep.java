package repository.address;

import domain.address.Address;
import factory.domain.AddressFactory;

import java.sql.*;
import java.util.ArrayList;

public class AddressRep implements AddressRepInt {
    private String url="jdbc:mysql://localhost:3306/employee_payroll?autoReconnect=true&useSSL=false";
    private String user="root";
    private String password="";
    private Connection conne;
    private  static AddressRep addressRep=null;

    private AddressRep() {
        try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static AddressRep getAddress(){
        if(addressRep==null){
            addressRep=new AddressRep();
        }return addressRep;
    }

    @Override
    public Address create(Address address) {
        String codeInt=getHighId();
        try {
            String sql="INSERT INTO ADDRESS (ID,STREET_ADDRESS,POSTAL_ADDRESS) VALUES ("+codeInt+",'"+address.getStreetAddress()+"','"+address.getPostalAddress()+"');";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(codeInt);
    }

    @Override
    public Address read(String id) {
        Address myAddress=null;
        try {
            String sql="SELECT * FROM ADDRESS WHERE ID="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                myAddress = AddressFactory.getAddressFactory(rs.getInt(1),rs.getString(2),rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return myAddress;
    }

    @Override
    public Address udate(Address address) {

        try {
            String sql="UPDATE ADDRESS SET STREET_ADDRESS='"+address.getStreetAddress()+"',POSTAL_ADDRESS='"+address.getPostalAddress()+"' WHERE ID="+address.getAddressId()+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(""+address.getAddressId());
    }

    @Override
    public Address delete(String id) {
       Address s=AddressFactory.getAddressFactory(read(id).getAddressId(),read(id).getStreetAddress(),read(id).getPostalAddress()) ;
        try {
            String sql="DELETE FROM ADDRESS WHERE ID="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return s;
    }

    @Override
    public ArrayList readAll() {
        ArrayList<String>myList=new ArrayList<>();

        Address myAddress=null;
        try {
            String sql="SELECT * FROM ADDRESS ;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
               myAddress = AddressFactory.getAddressFactory(rs.getInt(1),rs.getString(2),rs.getString(3));
                myList.add(myAddress.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return myList;
    }

    @Override
    public String getHighId() {
        String highValeu=null;
        try {
            String sql="select MAX(ID) from ADDRESS  ;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
                highValeu=rs.getString(1);
                int x=Integer.parseInt(highValeu)+1;
                highValeu=""+x;


            }
        }catch (SQLException e)
        {
            e.printStackTrace();
            System.out.println("!!!!SQL EXCEPTION INT ADDRESS CLASS (GETHIGH)");
        }catch (NumberFormatException x){ highValeu="1000";}
        catch (NullPointerException y){ highValeu="1000";}

        return highValeu;
    }
}
