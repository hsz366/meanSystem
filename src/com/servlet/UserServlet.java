package com.servlet;

import com.pojo.Asset;
import com.pojo.Lender;
import com.pojo.User;
import com.service.impl.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        String act = request.getParameter("act");
        if("1".equals(act)){
            request.getRequestDispatcher("page/usermeans.jsp").forward(request, response);
        }else if("2".equals(act)){
            String oldPassword = request.getParameter("oldPassword");
            String newPassword = request.getParameter("newPassword");
            String rePassword = request.getParameter("rePassword");
            UserUpdateServiceImpl userUpdate = new UserUpdateServiceImpl();
            boolean update = userUpdate.Update(user.getName(), newPassword);
            if(update){
                response.sendRedirect("UserServlet?act=1");
            }
        }else if("3".equals(act)){
            String name = user.getName();
            LenderUserServiceImpl lenderUser = new LenderUserServiceImpl();
            List lender = lenderUser.getLender(name);
            session.setAttribute("lender",lender);
            request.getRequestDispatcher("page/apply.jsp").forward(request, response);
        } else if("51".equals(act)){
            int id = Integer.parseInt(request.getParameter("id"));
            int status = Integer.parseInt(request.getParameter("status"));
            int lock = Integer.parseInt(request.getParameter("lock"));
            AdminImpl admin = new AdminImpl();
            boolean root = admin.getRoot(id, status, lock);
            System.out.println(id);
            System.out.println(status);
            System.out.println(lock);
            System.out.println(root);
            request.getRequestDispatcher("UserServlet?act=8").forward(request, response);
        }else if("8".equals(act)){
            UserListServiceImpl userList = new UserListServiceImpl();
            List<User> list = userList.getUser();
            request.setAttribute("userList",list);
            request.getRequestDispatcher("page/admin.jsp").forward(request, response);
        }else if("9".equals(act)){
            AssetServiceImpl assetService = new AssetServiceImpl();
            List<Asset> assetServiceList = assetService.getList();
            session.setAttribute("assetServiceList",assetServiceList);
            request.getRequestDispatcher("page/add_lend.jsp").forward(request, response);
        }else if("10".equals(act)){
            String cpname = request.getParameter("cpname");
            String count = request.getParameter("count");
            int i = Integer.parseInt(count);
            AskServiceImpl askService = new AskServiceImpl();
            askService.askLend(user.getName(),cpname,i);
            request.getRequestDispatcher("UserServlet?act=3").forward(request, response);
        }else if("11".equals(act)){
            LenderUserServiceImpl lenderUserService = new LenderUserServiceImpl();
            List<Lender> noBcak = lenderUserService.noBcak(user.getName());
            session.setAttribute("noBack",noBcak);
            request.getRequestDispatcher("page/repay.jsp").forward(request, response);
        }else if("12".equals(act)){
            String cpid = request.getParameter("cpid");
            LenderUserServiceImpl lenderUserService = new LenderUserServiceImpl();
            boolean b = lenderUserService.giveBack(cpid);
            request.getRequestDispatcher("UserServlet?act=11").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
