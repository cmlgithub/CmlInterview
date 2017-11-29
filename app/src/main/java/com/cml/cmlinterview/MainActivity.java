package com.cml.cmlinterview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.MyMath;

public class MainActivity extends AppCompatActivity {

    public static final String tag = "CML";
    private boolean testBoolean;
    private char testChar;
    private byte testByte;
    private short testShort;
    private int  testInt;
    private long  testLong;
    private float  testFloat;
    private double  testDouble;

    private String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(tag,testBoolean+"");
        Log.e(tag,testChar+"");
        Log.e(tag,testByte+"");
        Log.e(tag,testShort+"");
        Log.e(tag,testInt+"");
        Log.e(tag,testLong+"");
        Log.e(tag,testFloat+"");
        Log.e(tag,testDouble+"");

        Log.e(tag,""+MyMath.class.getName());
        int m = Integer.MAX_VALUE;
        int n = m *4;
        Log.e(tag,""+n);
    }


}
