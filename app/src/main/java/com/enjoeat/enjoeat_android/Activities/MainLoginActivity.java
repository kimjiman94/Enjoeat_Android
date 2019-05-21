package com.enjoeat.enjoeat_android.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.enjoeat.enjoeat_android.R;
import com.enjoeat.enjoeat_android.Utility;

public class MainLoginActivity extends AppCompatActivity {

    private EditText et_login;
    private ImageView iv_check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utility.switchImmersiveStickyMode(getWindow().getDecorView());
        setContentView(R.layout.activity_main_login);
        et_login = findViewById(R.id.main_login_et_login);
        iv_check = findViewById(R.id.main_login_iv_check);
        setAllListener();
    }

    private void setAllListener() {
        et_login.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int count, int after) {
                String phone_num = s.toString();
                if(phone_num.length() == 11){
                    iv_check.setBackgroundColor(Color.parseColor("#ff3f2c"));
                    iv_check.setEnabled(true);
                    Utility.hideKeyBoard(MainLoginActivity.this, et_login);
                    Utility.switchImmersiveStickyMode(getWindow().getDecorView());
                }
                else{
                    iv_check.setBackgroundColor(Color.parseColor("#e2e2e2"));
                    iv_check.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        iv_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //서버통신 if 회원정보 있을때 -> 메인화면 주문전
                Intent intent = new Intent(MainLoginActivity.this, BeforeOrderHomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
