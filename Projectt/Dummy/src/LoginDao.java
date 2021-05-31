
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class LoginDao {
int status ;
public int setRegister(login l) {
try {
Class.forName("com.mysql.jdbc.Driver");
Connection con =
DriverManager.getConnection("jdbc:mysql://localhost:3306/Wad","Monika","Shanmu_26");
PreparedStatement ps = con.prepareStatement("INSERT INTO register VALUES(?,?,?,?,?,?,?);");
ps.setString(1,l.getName());
ps.setString(2,l.getEmail());
ps.setString(3,l.getPhone());
ps.setString(4,l.getWebsite());
ps.setString(5,l.getPriority());;
ps.setString(6,l.getType());
ps.setString(7,l.getText());
status =ps.executeUpdate();
} catch (Exception e) {
e.printStackTrace();
}
return status;
}
}