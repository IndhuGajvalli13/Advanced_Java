package servlet_crudoperation;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet("/insert")
public class insertrecords extends HttpServlet{
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		long  mobile=Long.parseLong(req.getParameter("mobile"));
		long salary=Long.parseLong(req.getParameter("salary"));
		
		Employee employee=new Employee();
		employee.setEmpname(name);
		employee.setEmpemail(email);
		employee.setEmpmobile(mobile);
		employee.setEmpsalary(salary);
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("E3");
		EntityManager em=emf.createEntityManager();
		EntityTransaction t=em.getTransaction();
		
		t.begin();
		em.persist(employee);
		t.commit();
		
		resp.getWriter().print("");
		req.getRequestDispatcher("index.html").include(req, resp);;
	}
	

}
