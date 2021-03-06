package spring.mvc.servlet;

import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = "/servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Servlet.service");

        // HTML로 응답
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<body>");
        writer.println("    <div>1. url에 get 방식으로 데이터 전달하기 /get-request</div>");
        writer.println("    <div>2. Post 방식으로 바디에 JSON 데이터 전달하기 /request-body-json</div>");
        writer.println("    <div>3. JSON 데이터 뿌리기 /response-json</div></br>");
        writer.println("    <div><a href=\"basic/servlet-exam.html\">4. 서블릿으로 회원 저장 조회 실습하기</a></div>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
