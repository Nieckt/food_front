package cn.et.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.et.model.MyDeskAll;

/**
 * Servlet implementation class ShowDesk
 */
public class ShowDesk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowDesk() {
        super();
        // TODO Auto-generated constructor stub
    }

    MyDeskAll myDesk = new MyDeskAll();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//设置到request作用域中
			request.setAttribute("tableList", myDesk.getTableLIstAll());
			//将数据传到页面 
			//请求转发
			request.getRequestDispatcher("index.jsp").forward(request, response);;
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		this.doGet(request, response);
	}

}
