import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author LD
 * @date 2020/7/9 16:39
 */
public class TranslateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String english = req.getParameter("english");
        String chinese = translate(english);
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.printf("<p>%s 的翻译结果是 %s</p>%n",english,chinese);
    }
    private  String translate(String english) throws ServletException{
        try (Connection c = DBUtil.getConnection()){
            String sql = "select chinese from dictionary where english = ?";
            try(PreparedStatement s = c.prepareStatement(sql)){
                s.setString(1,english);
                try(ResultSet r = s.executeQuery()) {
                    if(r.next()) {
                        return r.getString("chinese");
                    }else {
                        return "不认识的单词";
                    }
                }
            }

        }catch (SQLException e) {
            throw new ServletException(e);
        }
    }
}
