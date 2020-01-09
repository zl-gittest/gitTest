package Servlet;

import Service.PictureFormatChange;
import Service.UserMess;
import com.baidu.aip.ocr.AipOcr;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
//import com.baidu.ai.aip.utils.HttpUtil;

/**
 *@desc:手写文字识别
 *@date:2019/11/26
 *@author zuoliang
 */
@MultipartConfig()
@WebServlet("/universalHandwriting")
public class universalHandwriting extends HttpServlet{
    private static final long serialVersionUID = 1L;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        Part huantu = req.getPart("huantu3");
        String cd = huantu.getHeader("Content-Disposition");
        String filename = cd.substring(cd.lastIndexOf("=")+2, cd.length()-1);
        String path = "D:\\image\\"+filename;
        AipOcr aipOcr = new AipOcr(UserMess.APP_ID, UserMess.API_KEY, UserMess.SECRET_KEY);
        JSONObject jsonObject = PictureFormatChange.universalHandwriting(aipOcr, path);
        String sss= jsonObject.toString(2);
        System.out.println(sss);
        HttpSession session=req.getSession();
        session.setAttribute("result",sss);
        req.getRequestDispatcher("result.jsp").forward(req,resp);

    }
}
