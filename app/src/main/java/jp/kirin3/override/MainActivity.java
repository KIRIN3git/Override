package jp.kirin3.override;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends ObstractActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkPoint1();
    }

    @Override
    protected void checkPoint2(){
        super.checkPoint2();
        Log.w( "DEBUG_DATA", "MainActivity checkPoint2");
    }
}
