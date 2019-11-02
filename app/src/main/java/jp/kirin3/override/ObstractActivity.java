package jp.kirin3.override;

import android.app.Activity;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class ObstractActivity extends AppCompatActivity {

    public void checkPoint1(){
        Log.w( "DEBUG_DATA", "ObstractActivity checkPoint1");
        checkPoint2();
    }

    protected void checkPoint2(){
        Log.w( "DEBUG_DATA", "ObstractActivity checkPoint2");
    }


}
