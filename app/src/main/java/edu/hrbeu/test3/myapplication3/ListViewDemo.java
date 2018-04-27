package edu.hrbeu.test3.myapplication3;

/**
 * Created by Liuying on 2018/4/27.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * Created by Liuying on 2018/4/27.
 */

public class ListViewDemo extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        final TextView textView = (TextView)findViewById(R.id.TextView01);

        String[] strs={"ListView01","ListView02","ListView03"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, strs );
        ListView listView = (ListView)findViewById(R.id.ListView01);
        listView.setAdapter(adapter);

        AdapterView.OnItemClickListener listViewListener = new	AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                String msg = "父View："+arg0.toString()+"\n"+"子View："+arg1.toString()+"\n"+"位置："+String.valueOf(arg2)+"，ID："+String.valueOf(arg3);
                textView.setText(msg);
            }};
        listView.setOnItemClickListener(listViewListener);
    }



}
