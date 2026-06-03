import java.sql.*;
class TransactionHandlinginJDBC{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bank",
                "root",
                "Pandu@!"
            );
            con.setAutoCommit(false);
            int senderId=1;
            int receiverId=2;
            double amount=1000;
            PreparedStatement debit =con.prepareStatement(
                "UPDATE accounts SET balance=balance-? WHERE id=?"
            );
            debit.setDouble(1,amount);
            debit.setInt(2,senderId);
            int r1=debit.executeUpdate();
            PreparedStatement credit =con.prepareStatement(
                "UPDATE accounts SET balance=balance+? WHERE id=?"
            );
            credit.setDouble(1,amount);
            credit.setInt(2,receiverId);
            int r2=credit.executeUpdate();
            if(r1>0 &&r2>0){
                con.commit();
                System.out.println("Tranction Sucessfull");
            }
            else{
                System.out.println("Not Sucessfull");
            }
            con.close();
        }
        catch(Exception e){
            System.out.println("Error!: "+e);
        }
    }
}