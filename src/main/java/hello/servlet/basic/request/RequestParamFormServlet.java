package hello.servlet.basic.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 2. HTTP 요청 데이터 - POST HTML Form
 */

@WebServlet(name = "requestParamFormServlet", urlPatterns = "/request-param-form")
public class RequestParamFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("RequestParamForm = Start");

        System.out.println("[전체 파라미터 조회] = start");

        request.getParameterNames().asIterator()
                .forEachRemaining(paramName -> System.out.println(paramName + "=" + request.getParameter(paramName)));

        System.out.println("[전체 파라미터 조회] = end");
        System.out.println();

        System.out.println("[단일 파라미터 조회]");

        String userName = request.getParameter("userName");
        System.out.println("userName = " + userName);

        String age = request.getParameter("age");
        System.out.println("age = " + age);

        String sex = request.getParameter("sex");
        System.out.println("sex = " + sex);
        System.out.println();

        System.out.println("[이름이 같은 복수 파라미터 조회]");
        String[] userNames = request.getParameterValues("userName");
        for(String name: userNames){
            System.out.println("userName = " + name);
        }

        response.getWriter().write("RequestParamFormServlet OK");

        System.out.println("RequestParamForm = end");
    }
}
