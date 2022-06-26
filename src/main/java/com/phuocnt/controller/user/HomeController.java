package com.phuocnt.controller.user;


import com.phuocnt.model.News;
import com.phuocnt.service.ICategoryService;
import com.phuocnt.service.INewsService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/home"})
public class HomeController extends HttpServlet {
    @Inject
    private ICategoryService categoryService;
    @Inject
    private INewsService newsService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("categories", categoryService.findAll());
        req.getRequestDispatcher("/views/user/home.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
