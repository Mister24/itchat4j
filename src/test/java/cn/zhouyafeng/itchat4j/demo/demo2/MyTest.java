/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package cn.zhouyafeng.itchat4j.demo.demo2;

import cn.zhouyafeng.itchat4j.Wechat;
import cn.zhouyafeng.itchat4j.demo.demo1.SimpleDemo;
import cn.zhouyafeng.itchat4j.face.IMsgHandlerFace;

/**
 *
 * @author fayuan.fzw
 * @version $Id: MyTest.java, v 0.1 2018年09月12日 下午5:13 fayuan.fzw Exp $
 */
public class MyTest {
    public static void main(String[] args) {
        String qrPath = "/Users/mr.24/antFinancial/codeTrunk/itchat4j/msg/login"; // 保存登陆二维码图片的路径，这里需要在本地新建目录
        IMsgHandlerFace msgHandler = new SimpleDemo(); // 实现IMsgHandlerFace接口的类
        Wechat wechat = new Wechat(msgHandler, qrPath); // 【注入】
        wechat.start(); // 启动服务，会在qrPath下生成一张二维码图片，扫描即可登陆，注意，二维码图片如果超过一定时间未扫描会过期，过期时会自动更新，所以你可能需要重新打开图片
    }
}