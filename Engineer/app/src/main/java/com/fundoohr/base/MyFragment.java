package com.fundoohr.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.fundoohr.bridgeit.fundoohr.R;


/**
 * Created by bridgeit on 11/2/17.
 */
public class MyFragment extends BaseFragment implements View.OnClickListener{

Button buttonLogin;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_attendance__details,container,false);

        initViews(rootView);

        return rootView;
    }

    @Override
    public void initViews(View rootView) {

        buttonLogin = (Button) rootView.findViewById(R.id.app_bar_layout);

        setClickListener();
    }

    @Override
    public void setClickListener() {
        buttonLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            // click login
            case R.id.app_bar_layout :

                break;

        }
    }
}
