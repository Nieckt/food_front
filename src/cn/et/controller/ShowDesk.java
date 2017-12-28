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
			//���õ�request��������
			request.setAttribute("tableList", myDesk.getTableLIstAll());
			//�����ݴ���ҳ�� 
			//����ת��
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
