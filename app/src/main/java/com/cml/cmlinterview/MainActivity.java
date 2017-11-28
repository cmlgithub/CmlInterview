package com.cml.cmlinterview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

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

        TestClass testClass = new TestClass();
        Log.e(tag,"static:a1"+TestClass.a);
        Log.e(tag,"object:a1"+testClass.a);
        TestClass.a++;
        TestClass testClass2 = new TestClass();
        Log.e(tag,"static:a1"+TestClass.a);
        Log.e(tag,"object:a1"+testClass2.a);
    }


}
