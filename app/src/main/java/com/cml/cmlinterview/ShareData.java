package com.cml.cmlinterview;

import android.util.Log;

/**
 * author : cml on 2017/11/29
 * github : https://github.com/cmlgithub
 */

public class ShareData{
    public static int count = 0;
    public static void main(String[] args){
        final ShareData shareData = new ShareData();
        for(int i = 0;i<10;i++){
            new Thread(new Runnable(){
                public void run(){
                    try{
                        Thread.sleep(10);
                    }catch(Exception e){

                    }
                    for(int j =0;j<100;j++){
                        shareData.addCount();
                    }
                }
            }).start();
        }
        try{
            Thread.sleep(3000);
        }catch(Exception e){

        }
        Log.e("CML","share-count="+count);
    }
    public void addCount(){
        count++;
    }
}
