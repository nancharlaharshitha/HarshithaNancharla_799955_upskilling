import java.sql.*;
public class StudentDAO {
    Connection con;
    public StudentDAO(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student",
                "root",
                "Pandu@!"
            );
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
    public void InsertStudent(int id,String name){
        try{
            String query="INSERT INTO students VALUES(?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setInt(1,id);
            pst.setString(2,name);
            int r=pst.executeUpdate();
            System.out.println("redord Inseted: "+r);
        }
        catch(Exception e){
            System.out.println("Error! "+e);
        }
    }
    public void UpdateStudent(int id,String name){
        try{
            String query="UPDATE students SET name=? WHERE id=?";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,name);
            pst.setInt(2,id);
            int r=pst.executeUpdate();
            System.out.println("record updated: "+r);
        }
        catch(Exception e){
            System.out.println("Error! "+e);
        }
    }
    
}
