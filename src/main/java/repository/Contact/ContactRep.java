package repository.Contact;

import domain.contact.Contact;
import factory.domain.AddressFactory;
import factory.domain.ContactFactory;

import java.sql.*;
import java.util.ArrayList;

public class ContactRep implements ContacRepInt {
    private String url="jdbc:mysql://localhost:3306/employee_payroll?autoReconnect=true&useSSL=false";
    private String user="root";
    private String password="";
    private Connection conne;

    private static ContactRep contactRep=null;

    private ContactRep() {
        try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static ContactRep getContactRep() {
        if(contactRep==null){
            contactRep=new ContactRep();
        }
        return contactRep;
    }

    @Override
    public Contact create(Contact contact) {
        String codeInt=getHighId();
        try {
            String sql="INSERT INTO CONTRACT (ID,CELLPHONE,HOMENUMBER,EMAIL  ) VALUES ('"+codeInt+"','"+contact.getCellPhne()+"','"+contact.getHomePhone()+"','"+contact.getEmail()+"');";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(codeInt);
    }

    @Override
    public Contact read(String id) {
        Contact contact=null;
        try {
            String sql="SELECT * FROM contract WHERE ID="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                contact = ContactFactory.getContactFac(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contact;
    }

    @Override
    public Contact udate(Contact contact) {

        try {
            String sql="UPDATE CONTRACT SET CELLPHONE='"+contact.getCellPhne()+"',HOMENUMBER='"+contact.getHomePhone()+"',EMAIL='"+contact.getEmail()+"' WHERE ID="+contact.getId()+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(""+contact.getId());
    }

    @Override
    public Contact delete(String id) {
        Contact contact=ContactFactory.getContactFac(read(id).getId(),read(id).getCellPhne(),read(id).getHomePhone(),read(id).getEmail());
        try {
            String sql="DELETE FROM CONTRACT WHERE ID="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contact;
    }

    @Override
    public ArrayList readAll() {
        Contact contact=null;
        ArrayList<String>myList=new ArrayList<>();
        try {
            String sql="SELECT * FROM CONTRACT ;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                contact = ContactFactory.getContactFac(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
                myList.add(contact.toString());
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
            String sql="select MAX(ID) from CONTRACT  ;";
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
