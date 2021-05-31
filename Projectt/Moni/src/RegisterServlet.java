import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")

public class RegisterServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
   
    public RegisterServlet()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		String username = request.getParameter("username");
        String email = request.getParameter("email");
        String ph_number = request.getParameter("ph_number");
        String password = request.getParameter("password");
        
       
        System.out.println(username+"----- username");
        System.out.println(email+"----- email");
        System.out.println(ph_number+"----- ph_number");
        System.out.println(password+"----- password");
        
        RegisterBean regBean = new RegisterBean();
        
        
        regBean.setUsername(username);
        regBean.setEmail(email);
        regBean.setPh_number(ph_number);
        regBean.setPassword(password); 
        
        RegisterDao regDao = new RegisterDao();
        
        String userReg = regDao.regUser(regBean);
        
        if(userReg.equals("SUCCESS"))   
        {
           request.getRequestDispatcher("/login.html").forward(request, response);
        }
        else   
        {
           request.setAttribute("errMessage", userReg);
           request.getRequestDispatcher("/register.html").forward(request, response);
        }
	}

}