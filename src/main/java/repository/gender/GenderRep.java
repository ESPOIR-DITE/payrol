package repository.gender;

import domain.address.Address;
import domain.demography.Gender;
import factory.domain.AddressFactory;
import factory.domain.GenderFactory;

import java.sql.*;
import java.util.ArrayList;

public class GenderRep implements GenderRepInt {
    private String url="jdbc:mysql://localhost:3306/employee_payroll?autoReconnect=true&useSSL=false";
    private String user="root";
    private String password="";
    private Connection conne;
    private static GenderRep genderRep=null;

    private GenderRep() {
        try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static GenderRep getGenderRep(){
        if(genderRep==null){
            genderRep=new GenderRep();
        }return genderRep;
    }
    @Override
    public Gender create(Gender gender){
        String codeInt=getHighId();
        try {
        String sql="INSERT INTO GENDER (ID,DESCRIPTION ) VALUES ("+codeInt+",'"+gender.getDescription()+"');";
        PreparedStatement statement=conne.prepareStatement(sql);
        statement.executeUpdate();
    } catch (
    SQLException e) {
        e.printStackTrace();
    }
        return read(codeInt);
    }

    public Gender getId(String description){
        Gender gender=null;
        try {
            String sql="SELECT * FROM GENDER WHERE DESCRIPTION='"+description+"';";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                gender = GenderFactory.getGenderFac(rs.getInt(1),rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return gender;
    }

    @Override
    public Gender read(String id) {

            Gender gender=null;
            try {
                String sql="SELECT * FROM GENDER WHERE ID=(SELECT GENDER_ID FROM empoyee_gender WHERE EMP_ID="+id+");";
                PreparedStatement statement=conne.prepareStatement(sql);
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    gender = GenderFactory.getGenderFac(rs.getInt(1),rs.getString(2));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return gender;

    }

    @Override
    public Gender udate(Gender gender) {
        try {
            String sql="UPDATE GENDER SET DESCRIPTION='"+gender.getDescription()+"' WHERE ID="+gender.getId()+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(""+gender.getId());
    }

    @Override
    public Gender delete(String id) {
        Gender gender=GenderFactory.getGenderFac(read(id).getId(),read(id).getDescription());
        try {
            String sql="DELETE FROM GENDER WHERE ID="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return gender;
    }

    @Override
    public ArrayList readAll() {
        ArrayList<String>myList=new ArrayList<>();

        Gender gender=null;
        try {
            String sql="SELECT * FROM GENDER ;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                gender = GenderFactory.getGenderFac(rs.getInt(1),rs.getString(2));
                myList.add(gender.toString());
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
            String sql="select MAX(ID) from GENDER  ;";
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
