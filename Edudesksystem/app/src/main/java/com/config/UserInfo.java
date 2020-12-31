package com.config;

import java.util.Vector;

/**
 * Author: Shilaiyuan
 * Collage: Chongqing University of Technology
 * Date: 2020-12-31
 * Description:
 * */



public final class UserInfo {


    /**
     * @Fields userId :用户账号
     * */
    public String userId;


    /**
     * @Fields userName :用户昵称
     * */

    public String userName;


    /**
     * @Fields userSex :用户性别
     */

    public String userSex;

    /**
     * @Fields userBirthday :用户生日
     * */

    public String userBirthday;


    /**
     * @Fields userFace :用户头像
     * */

    public String userFace;


    /**
     * @Fields userTrades :用户签名
     * */

    public String userTrades;


    /**
     * @Fields userNumber :用户编号（学号/教职工编号）
     * */

    public String userNumber;


    /**
     * @Fields Mates :用户同学列表
     * */

    protected Vector<MatesOrTechers> Mates = new Vector<>();


    /**
     * @Fields Techers :用户教师列表
     */

    protected Vector<MatesOrTechers> Techers = new Vector<>();


    public static class MatesOrTechers{

        private String id;
        private String name;
        private String sex;
        private String birthday;
        private String face;
        private String trade;
        private String number;

        public void MateOrTechers(String id, String name, String sex, String birthday, String face
        , String trade, String number){
            this.id = id;
            this.name = name;
            this.sex = sex;
            this.birthday = birthday;
            this.face = face;
            this.trade =trade;
            this.number = number;
        }


        public String getId() {
            return id;
        }


        public String getName() {
            return name;
        }


        public String getSex() {
            return sex;
        }


        public String getBirthday() {
            return birthday;
        }


        public String getFace() {
            return face;
        }


        public String getTrade() {
            return trade;
        }


        public String getNumber() {
            return number;
        }
    }

}
