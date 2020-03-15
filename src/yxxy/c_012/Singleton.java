package yxxy.c_012;

/**
 * @Author: wuqing
 */
public class Singleton {

  private static volatile Singleton singleton;

  private Singleton(){};

  public static Singleton getInstance(){
    if(singleton!=null){
      return singleton;
    }
    return new Singleton();
  }

}
