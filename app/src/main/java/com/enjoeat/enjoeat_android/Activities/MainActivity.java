package com.enjoeat.enjoeat_android.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.enjoeat.enjoeat_android.R;
import com.enjoeat.enjoeat_android.Utility;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utility.switchImmersiveStickyMode(getWindow().getDecorView());
        setContentView(R.layout.activity_main);

        View v_screen_touch = findViewById(R.id.init_main_v_screen_touch);
        v_screen_touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainLoginActivity.class);
                startActivity(intent);
            }
        });
    }
}