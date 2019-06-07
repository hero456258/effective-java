package com.mingqian.chapter02;

import java.math.BigInteger;
import java.util.Random;

/**
 * Created by mingqian on 2019/6/7
 * 第一条：用静态工厂方法代替构造器
 */
public class BooleanUtils {

  public static Boolean valueOf(boolean b){
    return b ? Boolean.TRUE : Boolean.FALSE;
  }

  public static void main(String[] args) {
    Boolean result = BooleanUtils.valueOf(true);
    System.out.println(result);//true
  }
}
