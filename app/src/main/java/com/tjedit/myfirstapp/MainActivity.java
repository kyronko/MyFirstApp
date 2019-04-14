package com.tjedit.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userIdEdt;
    EditText userPwEdt;
    Button LoginBtn;
    TextView contentTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userPwEdt=findViewById(R.id.userPwEdt);
        userIdEdt=findViewById(R.id.userIdEdt);
        LoginBtn=findViewById(R.id.LoginBtn);
        contentTxt=findViewById(R.id.contentTxt);


        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String userId=userIdEdt.getText().toString();
               String userPw=userPwEdt.getText().toString();


                Toast.makeText(MainActivity.this, "userId", Toast.LENGTH_SHORT).show();

                contentTxt.setText(String.format("ID : %s, PW : %s",userId,userPw));
            }
        });

    }


}
