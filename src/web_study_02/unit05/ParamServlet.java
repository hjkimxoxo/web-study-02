package web_study_02.unit05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ParamServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=EUCKR");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		int age= Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String mail = request.getParameter("chk_mail");
		String content = request.getParameter("content");
		//악세사리
		String items[] = request.getParameterValues("item");
		//직업
		String job = request.getParameter("job");
		//관심분야
		String interest[] = request.getParameterValues("interest");

		//out.println();
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("<h2>당신이 입력한 정보입니다.</h2><br>");
		out.println("아이디:");
		out.println(id + "<br>");
		out.println("<br>암호:");
		out.println(pw + "<br>");
		out.println("<br>나이:");
		out.println(age + "<br>");
		out.println("<br>성별:");
		out.println(gender + "<br>");
		out.println("<br>가입인사: ");
		out.println(content + "<br>");
		out.println("<br>당신이 선택한 직업 : ");
		out.println(job + "<br>");
		//악세사리
		if(items == null) {
			out.print("<br>선택한 악세사리가 없습니다");
		}else {
			out.println("<br>당신이 선택한 악세사리입니다.<br>");
			for(String item : items) {
				out.println(item + "<br>");
			}
		}
	
		out.println("<br>당신이 선택한 직업 : ");
		out.println(job + "<br>");
		
		if(items == null) {
			out.print("<br>선택한 항목이 없습니다");
		}else {
			out.println("<br>당신이 선택한 항목입니다.<br>");
			for(String item : items) {
				out.println(item + "<br>");
			}
		}
		
	
		//관심분야
		if(interest == null) {
			out.print("<br>선택한 항목이 없습니다");
		}else {
			out.println("<br>당신이 선택한 관심분야입니다.<br>");
			for(String item : interest) {
				out.println(item);
		}
		
		
		
		//이전링크 
			
		out.println("<br><br><a href='javascript:history.go(-1)'>다시</a>");
		out.print("</body></html>");
		out.close();
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
