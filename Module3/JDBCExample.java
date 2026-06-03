import java.sql.*;
public class JDBCExample {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student",
                "root",
                "Pandu@!"
            );
            Statement st=con.createStatement();
            ResultSet res=st.executeQuery("SELECT * FROM students");
            while(res.next()){
                int id=res.getInt("id");
                String name=res.getString("name");
                System.out.println("ID: "+id);
                System.out.println("Name: "+name);
            }
            con.close();
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
    
}
