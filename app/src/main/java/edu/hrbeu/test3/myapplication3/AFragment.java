package edu.hrbeu.test3.myapplication3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Liuying on 2018/4/27.
 */

public class AFragment extends FragmentActivity {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_a, container, false);
    }
}
