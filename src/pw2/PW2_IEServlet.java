package pw2;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class PW2_IEServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		resp.getWriter().println("Hello, world");
		resp.getWriter().println("Hello, world");
		resp.getWriter().println("Hello, world");
	}
}
