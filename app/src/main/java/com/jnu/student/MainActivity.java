package com.jnu.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewHello=findViewById(R.id.textViewHello);
        textViewHello.setText("你好，世界！");

        textViewHello.setText(this.getString(R.string.hello_world));

        Context context=this.getApplicationContext();
        String resName="likeAndroid";
        int likeId=context.getResources().getIdentifier(resName,"string", context.getPackageName());
        textViewHello.setText(this.getString(likeId));
    }
}