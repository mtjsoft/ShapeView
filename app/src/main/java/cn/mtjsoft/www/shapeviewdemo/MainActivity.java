package cn.mtjsoft.www.shapeviewdemo;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import cn.mtjsoft.www.shapeview.ShapeTextView;

public class MainActivity extends AppCompatActivity {

    private ShapeTextView shapeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                Window window = getWindow();
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.setStatusBarColor(ContextCompat.getColor(this, R.color.colorPrimary));
                window.getDecorView()
                    .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.app_name);
        }
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
        String str = String.format(getString(R.string.test_str),"小明", "男");
        Log.i("mtj", str);
    }
}
