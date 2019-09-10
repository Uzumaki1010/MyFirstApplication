package com.jnu.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditTextActivity extends AppCompatActivity {

    private Button buttonCL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        buttonCL=(Button)this.findViewById(R.id.button_change_language);

        buttonCL.setOnClickListener(new MyClickListener());
    }

    private class MyClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Button button=(Button)view;
            EditText editTextCL = (EditText)findViewById(R.id.edit_text_contry);//获取EditText组件
            TextView textViewCL = (TextView)findViewById(R.id.text_view_language);//获取TextView组件

            String str = editTextCL.getText().toString();//获取EditText中填写的内容

            //根据名称获取资源
            String ResName1="language_"+str;
            String ResName2="change_language_"+str;
            Context context=EditTextActivity.this.getApplicationContext();
            int tvID=context.getResources().getIdentifier(ResName1,"string",context.getPackageName());
            int btID=context.getResources().getIdentifier(ResName2,"string",context.getPackageName());

            textViewCL.setText(EditTextActivity.this.getString(tvID));//设置TextView的文本内容
            button.setText(EditTextActivity.this.getString(btID));//设置Button的文本内容
        }
    }
}
