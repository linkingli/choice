package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.function;
import domain.user;
import service.IUserService;
import service.IuserFoundService;
import service.userFoundService;
import service.userService;


public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置字符编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("utf-8");
		//前台获取参数
		String name=request.getParameter("username");
		String passwd=request.getParameter("password");
		System.out.println(name);
		//调用service实现业务逻辑
		IUserService service=new userService();
		user userlist=service.getByName(name,passwd);
		//调用service实现业务逻辑
		IuserFoundService service1= new userFoundService();
		List<function> rolelist	=service1.getByRole(userlist.getId());
		
		//session的添加
		HttpSession session = request.getSession();
		session.setAttribute("user",userlist);
		session.setAttribute("role",rolelist );
		if(null==userlist)
		{
			response.getWriter().println("用户名不存在或者密码错误");
		}
		else
		{
			request.getRequestDispatcher("/success.jsp").forward(request, response);
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
