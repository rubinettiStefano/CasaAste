package com.generation.casaaste;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//http://localhost:8080/CasaAste_war_exploded/
//war-> web archive repository
//http protocollo di comunicazione
//localhost -> mio computer
//:8080 -> loro indicano il server SOFTWARE che nel nostro caso si chiama TOMCAT e gira sulla porta
//CasaAste_war_exploded

//http://localhost:8080/CasaAste_war_exploded/aste

@WebServlet(value = "/aste")
public class ServletAste extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		req.getRequestDispatcher("aste.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String nom = req.getParameter("nominativo");
		String ciao = req.getParameter("ciao");
		req.setAttribute("nominativo", nom);
		req.getRequestDispatcher("aste.jsp").forward(req, resp);
	}
}
