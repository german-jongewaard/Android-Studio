package com.example.masvistas.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.*;

/**
 * Created by german on 16-8-16.
 */
public class Tab3 extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        return inflater.inflate(R.layout.tab3, container, false);
    }
}