package edu.hrbeu.test3.myapplication3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

/**
 * Created by Liuying on 2018/4/26.
 */

public class NewActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);
        Button button=(Button)findViewById(R.id.btn4);
        Button button3=(Button)findViewById(R.id.btn3);
        Button button2=(Button)findViewById(R.id.btn2);
        Button button5=(Button)findViewById(R.id.btn5);
        Button button6=(Button)findViewById(R.id.btn6);
        RadioButton RadioButton1= (RadioButton) findViewById(R.id.RadioButton01);
        RadioButton RadioButton2= (RadioButton) findViewById(R.id.RadioButton02);
        RadioButton RadioButton3= (RadioButton) findViewById(R.id.RadioButton03);

        //隐式启动
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.baidu.com"));
                startActivity(intent);

            }
        });
        //显示启动
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(NewActivity.this,ListViewDemo.class);
                startActivity(intent);

            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(NewActivity.this,TabHostDemo.class);
                startActivity(intent);

            }
        });

        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(NewActivity.this,MenuResource.class);
                startActivity(intent);

            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(NewActivity.this,FragmentActivity.class);
                startActivity(intent);

            }
        });

        RadioButton.OnClickListener radioButtonListener = new RadioButton.OnClickListener(){

            public void onClick(View view) {
                Intent intent=new Intent(NewActivity.this, SpinnerDemo.class);
                startActivity(intent);
            }
        };
        RadioButton1.setOnClickListener(radioButtonListener);
        RadioButton2.setOnClickListener(radioButtonListener);
        RadioButton3.setOnClickListener(radioButtonListener);

    }
}