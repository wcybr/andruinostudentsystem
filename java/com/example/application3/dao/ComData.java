package com.example.application3.dao;

import com.example.application3.bean.StudentInfo;
import com.example.application3.bean.StudentScore;

import com.example.application3.bean.UserInfo;

/**
 * 存储 程序 运行需要的暂时保存的 数据
 *
 */
public class ComData {
   public static UserInfo utem=null;//登陆成功的用户信息
   static public StudentInfo item=null;//存储在学生信息维护中 点击列表 显示的信息
   static public StudentScore stem=null;//存储在学生成绩维护中 点击列表 显示的信息
}
