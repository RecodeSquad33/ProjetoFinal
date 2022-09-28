package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Logar")
public class LogarServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// recebendo os dados do formulario via parametro
		String v = "Voluntario";
		String sv = "123";
		String i = "Instituicao";
		String si = "456";

		if (v.equals(request.getParameter("login")) && (sv.equals(request.getParameter("senha")))) {
			response.sendRedirect("perfilVol.jsp");

		} else if (i.equals(request.getParameter("login")) && (si.equals(request.getParameter("senha")))){
			response.sendRedirect("perfilInst.jsp");
		
		} else {
			response.sendRedirect("login.html");
		}

	}

}
