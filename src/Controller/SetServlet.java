package Controller;

import java.io.IOException;
import java.util.HashSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TouristPlace;
import service.SetOperations;

@WebServlet(urlPatterns = { "/set" })

public class SetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static HashSet<TouristPlace> hashSet = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String destination = request.getParameter("travel");
		String rank = request.getParameter("rank");
		String add = request.getParameter("add");

		String sortbydestination = request.getParameter("sortbydestination");
		String sortbyrank = request.getParameter("sortbyrank");
		String remove = request.getParameter("remove");
		String reset = request.getParameter("reset");
		TouristPlace place = new TouristPlace(name, destination, rank);
		SetOperations operations = new SetOperations();
		if (add != null) {
			// call the add method and store the return value in a set variable
			hashSet = operations.add(place);
			System.out.println(hashSet);
			request.setAttribute("bucketListadd", hashSet);
			request.setAttribute("message", "user added successfully");
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/set.jsp");
			rd.forward(request, response);
		}

		if (remove != null) {
			// call the remove method and store the return value in a set variable
			hashSet = operations.remove(place);
			System.out.println(hashSet);
			request.setAttribute("bucketListremove", hashSet);
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/set.jsp");
			rd.forward(request, response);
		}

		if (sortbydestination != null) {
			// call the sortByDestination method and store the return value in a set
			// variable

			request.setAttribute("bucketList", operations.sortByDestination(hashSet));
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/set.jsp");
			rd.forward(request, response);
		}

		if (sortbyrank != null) {
			// call the sortByRank method and store the return value in a set variable

			request.setAttribute("bucketList", operations.sortByRank(hashSet));
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/set.jsp");
			rd.forward(request, response);
		}

		if (reset != null) {
			// call the reset method and store the return value in a set variable

			request.setAttribute("bucketList", operations.reset(hashSet));
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/set.jsp");
			rd.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
