package me.jp.wheelview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jp.wheelview.WheelView;

import java.util.ArrayList;
import java.util.Date;

import me.jp.wheelview.widget.WLQQTimePicker;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       WLQQTimePicker timePicker = (WLQQTimePicker) findViewById(R.id.timepicker);
        timePicker.setDate(new Date().getTime());
    }

}
