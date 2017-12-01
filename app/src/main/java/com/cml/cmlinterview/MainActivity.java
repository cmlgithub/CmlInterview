package com.cml.cmlinterview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String tag = "CML";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShareData.main(new String[5]);

        Integer integer = new Integer(5);
        Integer integer2 = 5;


        if(integer==integer2)
            Log.e(tag,"integer==integer2:true");
        else
            Log.e(tag,"integer==integer2:false");

//        if(integer==5)
//            Log.e(tag,"integer==5:true");
//        else
//            Log.e(tag,"integer==5:false");
//
//        if(integer==128)
//            Log.e(tag,"integer==128:true");
//        else
//            Log.e(tag,"integer==128:false");

    }


}
