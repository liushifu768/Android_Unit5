package edu.hrbeu.test3.myapplication3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private static EditText a = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView = (TextView) findViewById(R.id.TextView1);
        EditText editText = (EditText) findViewById(R.id.EditText1);
        a = (EditText) findViewById(R.id.EditText1);


        Button button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (a.getText().toString().equals("lewis")) {
                    Intent intent = new Intent(MainActivity.this, NewActivity.class);
                    //intent.setAction(Intent.ACTION_DIAL);
                    //ntent.addCategory(Intent.CATEGORY_HOME);
                    startActivity(intent);
                }


            }
        });

    }
}
