package com.lijiaying.keshe.portal.controller;

import com.lijiaying.keshe.portal.util.Code;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
@Api(tags = "CheckCodeController", description = "获取验证码")
public class CheckCodeController {
    @ApiOperation("获取验证码")
    @RequestMapping("/checkCode")
    public void checkCode(HttpServletRequest request, HttpServletResponse response){
        //服务器通知浏览器不要缓存
        response.setHeader("pragma","no-cache");
        response.setHeader("cache-control","no-cache");
        response.setHeader("expires","0");

        /**
         * 在内存中创建一个长80，宽20的图片，默认背景颜色为黑色
         * 第一个参数，长
         * 第二个参数，宽
         * 第三个参数，颜色
         */
        int wide = 80;
        int height = 20;
        BufferedImage image = new BufferedImage(wide, height, BufferedImage.TYPE_INT_RGB);

        //设置画笔
        Graphics graphics = image.getGraphics();
        //设置画笔颜色
        graphics.setColor(Color.GRAY);
        //填充图片颜色
        graphics.fillRect(0, 0, wide, height);

        //获取验证码
        String code = Code.getCode();
        //将code存放在session域中
        request.getSession().setAttribute("CHECKCODE_SERVER", code);

        //设置画笔颜色
        graphics.setColor(Color.yellow);
        //设置字体
        graphics.setFont(new Font("黑体", Font.BOLD, 24));
        //向图片上写入验证码
        graphics.drawString(code,15,25);

        /**
         * 将内存中的图片输出到浏览器
         * 第一个参数，图片对象
         * 第二个参数，图片格式
         * 第三个参数，输出位置
         */
        try {
            ImageIO.write(image, "PNG", response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
