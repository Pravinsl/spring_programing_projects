package com.sp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sp.dbcon.DbConnection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regFrom")
public class Register extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		String myname = req.getParameter("name");
		String myemail = req.getParameter("email");
		String mypass = req.getParameter("password");
		String mycity = req.getParameter("city");

		try {
			Connection con = DbConnection.getConnection();
			String inser_sql_query = "INSERT INTO register VALUES(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(inser_sql_query);

			ps.setString(1, myname);
			ps.setString(2, myemail);
			ps.setString(3, mypass);
			ps.setString(4, mycity);

			int count = ps.executeUpdate();
			if (count > 0) {
				out.println("<h3 style='color:green'> Registered Successfully </h3>");

				RequestDispatcher rd = req.getRequestDispatcher("/login.html");
				rd.include(req, resp);
			} else {
				out.println("<h3 style='color:red'> User not register due to some error </h3>");

				RequestDispatcher rd = req.getRequestDispatcher("/register.html");
				rd.include(req, resp);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
