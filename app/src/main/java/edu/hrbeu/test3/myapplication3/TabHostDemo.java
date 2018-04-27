package edu.hrbeu.test3.myapplication3;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;

/**
 * Created by Liuying on 2018/4/27.
 */

    @SuppressWarnings("deprecation")
    public class TabHostDemo extends TabActivity {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            TabHost tabHost = getTabHost();
            LayoutInflater.from(this).inflate(R.layout.tab1,tabHost.getTabContentView(),true);
            LayoutInflater.from(this).inflate(R.layout.tab2,tabHost.getTabContentView(),true);
            LayoutInflater.from(this).inflate(R.layout.tab3,tabHost.getTabContentView(),true);
            tabHost.addTab(tabHost.newTabSpec("TAB1")
                    .setIndicator("线性布局").setContent(R.id.layout01));
            tabHost.addTab(tabHost.newTabSpec("TAB2")
                    .setIndicator("相对布局").setContent(R.id.layout02));
            tabHost.addTab(tabHost.newTabSpec("TAB3")
                    .setIndicator("网格布局").setContent(R.id.layout03));
        }
    }



