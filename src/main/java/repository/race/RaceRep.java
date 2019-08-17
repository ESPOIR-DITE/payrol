package repository.race;

import domain.demography.Gender;
import domain.demography.Race;
import factory.domain.GenderFactory;
import factory.domain.RaceFactory;

import java.sql.*;
import java.util.ArrayList;

public class RaceRep implements RaceInt {
    private String url="jdbc:mysql://localhost:3306/employee_payroll?autoReconnect=true&useSSL=false";
    private String user="root";
    private String password="";
    private Connection conne;
    private static RaceRep rp=null;

    private RaceRep() {
        try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static RaceRep getRaceRep(){
        if(rp==null){
            rp=new RaceRep();
        }return rp;
    }


    @Override
    public Race create(Race race) {
        String codeInt=getHighId();
        try {
            String sql="INSERT INTO RACE (ID,DESRITION  ) VALUES ('"+codeInt+"','"+race.getDescriptio()+"');";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
        return read(codeInt);
    }

    @Override
    public Race read(String id) {
        Race race=null;
        try {
            String sql="SELECT * FROM RACE WHERE ID="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                race = RaceFactory.getFacRace(rs.getInt(1),rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return race;
    }

    @Override
    public Race udate(Race race) {
        try {
            String sql="UPDATE RACE SET DESRITION ='"+race.getDescriptio()+"' WHERE ID="+race.getId()+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(""+race.getId());
    }

    @Override
    public Race delete(String id) {
        Race race=RaceFactory.getFacRace(read(id).getId(),read(id).getDescriptio());
        try {
            String sql="DELETE FROM RACE WHERE ID='"+id+"';";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return race;
    }

    @Override
    public ArrayList readAll() {
        ArrayList<String>myList=new ArrayList<>();

        Race race=null;
        try {
            String sql="SELECT * FROM RACE ;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                race = RaceFactory.getFacRace(rs.getInt(1),rs.getString(2));
                myList.add(race.toString());
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
            String sql="select MAX(ID) from RACE  ;";
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
