package org.knowit.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.knowit.DB.AssignmentDB;
import org.knowit.DB.PostQuizDB;

/**
 * Servlet implementation class PostQuiz
 */
@WebServlet("/PostQuiz")
public class PostQuiz extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostQuiz() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
         System.out.println("Service method");
		
		
		String fillup=request.getParameter("fillup");
		String answerf=request.getParameter("answerf");
        //String addfill=request.getParameter("addfill");
        String mcq=request.getParameter("mcq");
		String option1=request.getParameter("option1");
        String option2=request.getParameter("option2");
		String option3=request.getParameter("option3");
		String option4=request.getParameter("option4");
		String answermc=request.getParameter("answermc");
        //String addmc=request.getParameter("addmc");
        String tf=request.getParameter("tf");
		String answer=request.getParameter("answer");
        //String addtf =request.getParameter("addtf");
		
	  PostQuizDB postquizDB=new PostQuizDB();
	  postquizDB.submitfill(fillup,answerf);
	  postquizDB.submitmc(mcq,option1,option2,option3,option4,answermc);
	  postquizDB.submittf(tf,answer);
		response.sendRedirect("postquiz.html");
	}

}
