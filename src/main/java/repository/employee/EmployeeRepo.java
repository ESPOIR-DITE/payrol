package repository.employee;

import domain.contact.Contact;
import domain.employe.Employee;
import factory.domain.ContactFactory;
import factory.domain.EmployeeFactory;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeRepo implements EmployeeRepInt {
    //private Employee employee= EmployeeFactory.getFactoryEmpl()
    private static EmployeeRepo employeeRepo=null;
    private Employee employee=null;

    private String url="jdbc:mysql://localhost:3306/employee_payroll?autoReconnect=true&useSSL=false";
    private String user="root";
    private String password="";
    private Connection conne;

    private EmployeeRepo() {
        try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static EmployeeRepo getEmployeeRep(){
        if(employeeRepo==null){
            employeeRepo=new EmployeeRepo();
        }return employeeRepo;
    }

    @Override
    public Employee create(Employee employee) {
        int codeInt=getHighId();
        try {
            String sql="INSERT INTO EMPLOYEE (ID,NAME ,LASTNAME ) VALUES ("+codeInt+",'"+employee.getName()+"','"+employee.getLastName()+"');";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(""+codeInt);
    }

    @Override
    public Employee read(String id) {

        try {
            String sql="SELECT * FROM EMPLOYEE WHERE ID="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                employee = EmployeeFactory.getFactoryEmpl(rs.getInt(1),rs.getString(2),rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public Employee udate(Employee employee) {
        try {
            String sql="UPDATE CONTRACT SET NAME='"+employee.getName()+"',LASTNAME='"+employee.getLastName()+"' WHERE ID="+employee.getEmployNumber()+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(""+employee.getEmployNumber());
    }

    @Override
    public Employee delete(String id) {
        Employee employee=EmployeeFactory.getFactoryEmpl(read(id).getEmployNumber(),read(id).getName(),read(id).getLastName());
        try {
            String sql="DELETE FROM CONTRACT WHERE ID="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public ArrayList readAll() {

        ArrayList<String>myList=new ArrayList<>();
        try {
            String sql="SELECT * FROM EMPLOYEE ;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                employee = EmployeeFactory.getFactoryEmpl(rs.getInt(1),rs.getString(2),rs.getString(3));
                myList.add(employee.toString());
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
            String sql="select MAX(ID) from EMPLOYEE  ;";
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
