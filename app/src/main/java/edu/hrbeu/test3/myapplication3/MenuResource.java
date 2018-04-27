package edu.hrbeu.test3.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by Liuying on 2018/4/27.
 */

public class MenuResource extends AppCompatActivity {

    final static int MENU_00 = Menu.FIRST;
    final static int MENU_01 = Menu.FIRST+1;
    final static int MENU_02 = Menu.FIRST+2;
    final static int MENU_03 = Menu.FIRST+3;
    final static int MENU_04 = Menu.FIRST+4;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        menu.add(0,MENU_00,0,"打印").setIcon(R.drawable.pic0);
        menu.add(0,MENU_01,1,"新建").setIcon(R.drawable.pic1);
        menu.add(0,MENU_02,2,"邮件").setIcon(R.drawable.pic2);
        menu.add(0,MENU_03,3,"设置").setIcon(R.drawable.pic3);
        menu.add(0,MENU_04,4,"订阅").setIcon(R.drawable.pic4);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        TextView label = (TextView)findViewById(R.id.label);
        switch (item.getItemId()) {
            case R.id.main_menu_0:
                label.setText("打印，菜单ID：" + item.getItemId());
                return true;
            case R.id.main_menu_1:
                label.setText("新建，菜单ID：" + item.getItemId());
                return true;
            case R.id.main_menu_2:
                label.setText("邮件，菜单ID：" + item.getItemId());
                return true;
            case R.id.main_menu_3:
                label.setText("设置，菜单ID：" + item.getItemId());
                return true;
            case R.id.main_menu_4:
                label.setText("订阅，菜单ID：" + item.getItemId());
                return true;
            default:
                return false;
        }
    }


}
