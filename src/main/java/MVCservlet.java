

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MVCservlet
 */
@WebServlet("/MVCservlet")
public class MVCservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	public MVCservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	 int n = Integer.parseInt(request.getParameter("montant"));
	 int num = Integer.parseInt(request.getParameter("duree"));
	 float numb = Float.parseFloat(request.getParameter("taux"));
	 float res = calculate(n,num,numb);
	 String message = "la mensualité m d’un crédit bancaire est "+Float. toString(res);
	 request.setAttribute("result", message);
	 request.getRequestDispatcher("MVCservlet.java").forward(request,response);
	//	doGet(request, response);
	}
	public float calculate (int c , int n , float t) {
		
	  return (float) ((c * t / 12 )/(1-(1 + Math.pow((t/12),n*(-1))))) ;
	}

}
