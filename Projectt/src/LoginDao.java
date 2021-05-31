import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	public String loginUser(LoginBean loginBean)
    {
        String semail = loginBean.getEmail();
        String spassword = loginBean.getPassword();
        
        Connection con = null;
        PreparedStatement pst = null;         
        try
        {
            con = DbUtil.createConnection();
            String query = "select count(*) from reg_details where email=? and password=?"; 
            pst=con.prepareStatement(query);
            pst.setString(1,semail);
            pst.setString(2,spassword);
            ResultSet rs = pst.executeQuery();
            int cnt = 0;
            if (rs.next())
                cnt = rs.getInt(1);
            if(cnt!=0)
                return "SUCCESS";
            
        }
        
        catch(SQLException e)
        {
           e.printStackTrace();
        }       
        return "Oops.. Something went wrong there..!"; 
    }
}

