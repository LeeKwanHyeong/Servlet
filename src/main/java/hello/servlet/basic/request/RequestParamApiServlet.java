package hello.servlet.basic.request;

import org.springframework.util.StreamUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "requestParamApiServlet", urlPatterns = "/request-param-api")
public class RequestParamApiServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletInputStream inputStream = request.getInputStream();

        /**
         * 하위 데이터를 꺼낼때는 인코딩 정보를 알려줘야 한다.
         * Byte to String -> 어떤 인코딩인지 알려줘야 한다.
         * 반대로 String to Byte -> 어떤 인코딩인지 알려줘야 한다.
         * 지금은 대부분 UTF-8을 쓴다.
         */

        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);

        System.out.println("messageBody = " + messageBody);
        response.getWriter().write("RequestParamApiServlet OK");

    }
}
