import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
   
    public LoginServlet()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        System.out.println(email+"----- email");
        System.out.println(password+"----- password");
        
        LoginBean loginBean = new LoginBean();
        
        loginBean.setEmail(email);
        loginBean.setPassword(password); 
        
        LoginDao loginDao = new LoginDao();
        
        String userLogin = loginDao.loginUser(loginBean);
        
        if(userLogin.equals("SUCCESS"))   
        {
           request.getRequestDispatcher("/rechargeportal.html").forward(request, response);
        }
        else   
        {
           request.setAttribute("errMessage", userLogin);
           request.getRequestDispatcher("/register.html").forward(request, response);
        }
	}

}