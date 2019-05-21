package com.enjoeat.enjoeat_android.Activities;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.enjoeat.enjoeat_android.R;
import com.enjoeat.enjoeat_android.Utility;

public class BeforeOrderHomeActivity extends AppCompatActivity {

    private LinearLayout before_order_tab_home;
    private LinearLayout before_order_tab_menu;
    private LinearLayout before_order_tab_mypage;
    private TextView tv_wifi_password;
    private TextView tv_playlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_order_home);
        Utility.switchImmersiveStickyMode(getWindow().getDecorView());

        TabOnClickListener tabOnClickListener = new TabOnClickListener();

        before_order_tab_home = findViewById(R.id.before_order_tab_home);
        before_order_tab_menu = findViewById(R.id.before_order_tab_menu);
        before_order_tab_mypage = findViewById(R.id.before_order_tab_mypage);

        before_order_tab_home.setOnClickListener(tabOnClickListener);
        before_order_tab_menu.setOnClickListener(tabOnClickListener);
        before_order_tab_mypage.setOnClickListener(tabOnClickListener);

        tv_wifi_password = findViewById(R.id.tv_wifi_password);
        tv_playlist = findViewById(R.id.tv_playlist);
        tv_wifi_password.setSelected(true);
        tv_playlist.setSelected(true);
    }
    class TabOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            ImageView ic_home = findViewById(R.id.ic_tab_home);
            TextView tv_home= findViewById(R.id.tv_tab_home);
            ImageView iv_home_redbar = findViewById(R.id.iv_tab_home_redbar);

            ImageView ic_menu = findViewById(R.id.ic_tab_menu);
            TextView tv_menu= findViewById(R.id.tv_tab_menu);
            ImageView iv_menu_redbar = findViewById(R.id.iv_tab_menu_redbar);

            ImageView ic_mypage = findViewById(R.id.ic_tab_mypage);
            TextView tv_mypage= findViewById(R.id.tv_tab_mypage);
            ImageView iv_mypage_redbar = findViewById(R.id.iv_tab_mypage_redbar);

            iv_home_redbar.setVisibility(View.INVISIBLE);
            iv_menu_redbar.setVisibility(View.INVISIBLE);
            iv_mypage_redbar.setVisibility(View.INVISIBLE);

            ic_home.setImageResource(R.drawable.ic_tab_home);
            ic_menu.setImageResource(R.drawable.ic_tab_menu);
            ic_mypage.setImageResource(R.drawable.ic_tab_mypage);

            Typeface typeface_b = ResourcesCompat.getFont(BeforeOrderHomeActivity.this, R.font.nanum_square_b);
            Typeface typeface_eb = ResourcesCompat.getFont(BeforeOrderHomeActivity.this, R.font.nanum_square_eb);
            tv_home.setTextColor(Color.parseColor("#5f5f5f"));
            tv_home.setTypeface(typeface_b);
            tv_menu.setTextColor(Color.parseColor("#5f5f5f"));
            tv_menu.setTypeface(typeface_b);
            tv_mypage.setTextColor(Color.parseColor("#5f5f5f"));
            tv_mypage.setTypeface(typeface_b);
            switch(view.getId()) {
                case R.id.before_order_tab_home :
                    ic_home.setImageResource(R.drawable.ic_tab_home_red);
                    tv_home.setTextColor(Color.parseColor("#ff3f2c"));
                    tv_home.setTypeface(typeface_eb);
                    iv_home_redbar.setVisibility(View.VISIBLE);
                    break;
                case R.id.before_order_tab_menu :
                    ic_menu.setImageResource(R.drawable.ic_tab_menu_red);
                    tv_menu.setTextColor(Color.parseColor("#ff3f2c"));
                    tv_menu.setTypeface(typeface_eb);
                    iv_menu_redbar.setVisibility(View.VISIBLE);
                    break;
                case R.id.before_order_tab_mypage:
                    ic_mypage.setImageResource(R.drawable.ic_tab_mypage);
                    tv_mypage.setTextColor(Color.parseColor("#ff3f2c"));
                    tv_mypage.setTypeface(typeface_eb);
                    iv_mypage_redbar.setVisibility(View.VISIBLE);
                    break;
            }
        }
    }
}
