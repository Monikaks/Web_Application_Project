import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
	public String regUser(RegisterBean regBean)
    {
        
        String username = regBean.getUsername();
        String email = regBean.getEmail();
        String ph_number = regBean.getPh_number();
        String password = regBean.getPassword();
        
        Connection con = null;
        PreparedStatement preparedStatement = null;         
        try
        {
            con = DbUtil.createConnection();
            String query = "insert into reg_details(username, email, ph_number, password) values (?,?,?,?)"; //Insert user details into the table 'USERS'
            preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
            
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, ph_number);
            preparedStatement.setString(4, password);
            
            int i= preparedStatement.executeUpdate();
            
            if (i!=0)  //Just to ensure data has been inserted into the database
            return "SUCCESS"; 
        }
        catch(SQLException e)
        {
           e.printStackTrace();
        }       
        return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
    }
}