package edu.hrbeu.test3.myapplication3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by Liuying on 2018/4/27.
 */

public class SpinnerDemo extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner);

        String[] strs={"Spinner01","Spinner02","Spinner03"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,strs );
        Spinner spinner = (Spinner) findViewById(R.id.Spinner01);
        spinner.setAdapter(adapter);

    }
}