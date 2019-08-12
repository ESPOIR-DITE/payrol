package repository.identity;

import domain.identity.Identity;
import factory.domain.EmployeeFactory;
import factory.domain.IdentityFactory;

import java.sql.*;
import java.util.ArrayList;

public class IdentityRep implements IdentityRepInt {
    Identity identity=null;
    private static IdentityRep identityRep=null;

    private String url="jdbc:mysql://localhost:3306/employee_payroll?autoReconnect=true&useSSL=false";
    private String user="root";
    private String password="";
    private Connection conne;

    private IdentityRep() {
        try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static IdentityRep getIdentityRep(){
        if(identityRep==null){
            identityRep=new IdentityRep();
        }return identityRep;
    }

    @Override
    public Identity create(Identity identity) {
        int codeInt=getHighId();
        try {
            String sql="INSERT INTO IDENTITY (ID,IDENTITY_TYPE,IDENTITY_VALEU) VALUES ("+codeInt+",'"+identity.getIndentityTpe()+"','"+identity.getIdentityValeu()+"');";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(""+codeInt);
    }

    @Override
    public Identity read(String id) {
        try {
            String sql="SELECT * FROM IDENTITY WHERE ID="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                identity = IdentityFactory.getIdentityFac(rs.getInt(1),rs.getString(2),rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return identity;
    }

    @Override
    public Identity udate(Identity identity) {
        try {
            String sql="UPDATE IDENTITY SET IDENTITY_TYPE='"+identity.getIndentityTpe()+"',IDENTITY_VALEU='"+identity.getIdentityValeu()+"' WHERE ID="+identity.getIdentityId()+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(""+identity.getIdentityId());
    }

    @Override
    public Identity delete(String id) {
        identity=IdentityFactory.getIdentityFac(read(id).getIdentityId(),read(id).getIndentityTpe(),read(id).getIdentityValeu());
        try {
            String sql="DELETE FROM IDETITY WHERE ID="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return identity;
    }

    @Override
    public ArrayList readAll() {
        ArrayList<String>myList=new ArrayList<>();
        try {
            String sql="SELECT * FROM IDENTITY;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                identity = IdentityFactory.getIdentityFac(rs.getInt(1),rs.getString(2),rs.getString(3));
                myList.add(identity.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return myList;
    }

    @Override
    public int getHighId() {
        int highValeu=0;
        try {
            String sql="select MAX(ID) from IDENTITY;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
                highValeu=rs.getInt(1);

                if(highValeu==0){
                    highValeu=1000;
                }else highValeu=highValeu+1;


            }
        }catch (SQLException e)
        {
            e.printStackTrace();
            System.out.println("!!!!SQL EXCEPTION INT ADDRESS CLASS (GETHIGH)");
        }catch (NumberFormatException x){ highValeu=1000;}
        catch (NullPointerException y){ highValeu=1000;}

        return highValeu;
    }
}
