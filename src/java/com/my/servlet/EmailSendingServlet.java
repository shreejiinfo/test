/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.my.servlet;

import static com.sun.javafx.animation.TickCalculation.sub;
import composemail.EmailUtility;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class EmailSendingServlet extends HttpServlet {

	private String host;
	private String port;
	private String user;
	private String pass;

	public void init() {
		// reads SMTP server setting from web.xml file
		ServletContext context = getServletContext();
		host = context.getInitParameter("host");
		port = context.getInitParameter("port");
		user = context.getInitParameter("uname");
		pass = context.getInitParameter("pwad");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// reads form fields
		String recipient = request.getParameter("to");
		String copy = request.getParameter("cc");
		String subject = request.getParameter("sub");
                String content = request.getParameter("txtbody");

		String resultMessage = "";

		try {
			EmailUtility.sendEmail(host, port, user, pass, recipient, copy, subject,
					content);
			resultMessage = "The e-mail was sent successfully";
		} catch (Exception ex) {
			ex.printStackTrace();
			resultMessage = "There were an error: " + ex.getMessage();
		} finally {
			request.setAttribute("Message", resultMessage);
			getServletContext().getRequestDispatcher("index.jsp").forward(
					request, response);
		}
	}
    }
