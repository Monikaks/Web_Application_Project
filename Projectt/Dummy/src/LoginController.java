import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {
String name =request.getParameter("name");
String email=request.getParameter("email");
String phone =request.getParameter("phone");
String website =request.getParameter("website");
String priority =request.getParameter("priority");
String type =request.getParameter("type");
String text =request.getParameter("text");
login login =new login();
login.setName(name);
login.setEmail(email);
login.setPhone(phone);
login.setWebsite(website);
login.setPriority(priority);
login.setType(type);
login.setText(text);
LoginDao dao = new LoginDao();
dao.setRegister(login);
response.sendRedirect("Result.html");
}
}