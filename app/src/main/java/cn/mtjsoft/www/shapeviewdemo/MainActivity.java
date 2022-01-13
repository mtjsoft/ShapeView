package cn.mtjsoft.www.shapeviewdemo;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import cn.mtjsoft.www.shapeview.CustomBuilder;
import cn.mtjsoft.www.shapeview.ShapeTextView;

public class MainActivity extends AppCompatActivity {

    private ShapeTextView shapeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shapeTextView = findViewById(R.id.stv);
        // 代码动态设置
        shapeTextView.setBuilder(
                shapeTextView
                        .getBuilder()
                        .setStrokeWidth(3)
                        .setStrokeColor(ContextCompat.getColor(getBaseContext(), R.color.colorAccent))
                        .setColors(ContextCompat.getColor(getBaseContext(), R.color.colorAccent),
                                ContextCompat.getColor(getBaseContext(), R.color.colorPrimaryDark),
                                ContextCompat.getColor(getBaseContext(), R.color.colorPrimary))
                        .setRadius(10)
        );
    }
}
