package java;

/**
 * author : cml on 2017/11/30
 * github : https://github.com/cmlgithub
 */

public class SingleInner {


    private SingleInner(){}

    static class SingleHolder{
        private static SingleInner singleInner = new SingleInner();
    }

    public static synchronized SingleInner getInstance(){
        return SingleHolder.singleInner;
    }

}
