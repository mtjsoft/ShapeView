package cn.mtjsoft.www.shapeviewdemo;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import cn.mtjsoft.www.shapeview.ShapeTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShapeTextView shapeTextView = findViewById(R.id.stv);
        // 代码动态设置
        shapeTextView.setSolidColor(ContextCompat.getColor(getBaseContext(), R.color.colorAccent));
        shapeTextView.setRadius(10);
        // 设置生效
        shapeTextView.setCustomBackground();
    }
}
