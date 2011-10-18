package servlet;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Friend;

/**
 * Servlet implementation class Whatever
 */
@WebServlet({ "/whatever", "/wherever/*" })
public class Whatever extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@PersistenceUnit
	EntityManagerFactory emf;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Whatever() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletOutputStream outputStream = response.getOutputStream();
		outputStream.print("hello world!");
		
		Friend f = (Friend) emf.createEntityManager().createQuery("select f from Friend f").getResultList().get(0);
	
		outputStream.print(" "+f.getName());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
