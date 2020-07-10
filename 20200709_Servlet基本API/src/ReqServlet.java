import javax.print.attribute.standard.PrinterInfo;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * @author LD
 * @date 2020/7/10 19:37
 */
public class ReqServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         PrintInfo(req, resp);
    }

    private void PrintInfo(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        resp.setContentType("text/plain; charset=utf-8");
        PrintWriter writer = resp.getWriter();
        String method = req.getMethod();
        writer.println("请求的方式是："+method);
        writer.println("URL中的完整路径："+req.getRequestURI());
        writer.println("URL中的Context路径："+ req.getContextPath());
        writer.println("URL中的web.xml中的路径：" + req.getServletPath());
        writer.println("完整的QueryString:" +req.getQueryString());
        //根据query string 的Key 获取对应的 value
        writer.println("QueryString 中name 为 key1 的值："+req.getParameter("key1"));
        writer.println("QueryString 中name 为 key2 的值："+req.getParameter("key2"));
        writer.println("QueryString 中有如下name：");
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String name = parameterNames.nextElement();
            writer.println(name);
        }
        //获取协议版本信息

        writer.println("请求协议版本："+req.getProtocol());

        //获取头信息
        //根据 Key 获取对应的 Value
        writer.println("请求头：User-Agent = " + req.getHeader("User-Agent"));
        //获取所有的请求头信息
        writer.println("所有的请求头信息如下：");
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            String value = req.getHeader(name);
            writer.println(name +"=" + value);
        }

        //

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
