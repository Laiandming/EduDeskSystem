package com.config;

import android.telephony.SmsManager;

/**
 * Author : Shilaiyuan
 * Collage :Chongqing University of Technology
 * Date ：2020-12-31
 * Description : 配置服务器信息，包含服务器连接，密码验证，文件下载功能，占用4个端口
 * */



public class ServerInfo {
    /**
     * @Field SERVER_IP :服务器地址
     * */
    public final static String SERVER_IP = "127.0.0.1";

    /**
     * @Field CHAT_PORT :会话端口
     * */
    public final static String CHAT_PORT = ""; //待配置

    /**
     * @Field CHECK_PORT :验证端口
     * */
    public final static String CHECK_PORT = ""; //待配置

    /**
     * @Field FILE_TRANS_PORT :文件传输端口
     * */
}
