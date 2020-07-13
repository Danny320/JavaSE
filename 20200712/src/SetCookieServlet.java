import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author LD
 * @date 2020/7/13 10:05
 */
public class SetCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Set-Cookie","tody=2020-07-13");
        resp.setContentType("text/plain; charset=utf-8");
        resp.getWriter().println("种下cookie：today=2020-07-13");
    }
}
