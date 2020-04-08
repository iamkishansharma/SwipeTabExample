package com.example.swipetabexample;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Android extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View android = inflater.inflate(R.layout.android_frag, container, false);
        ((TextView)android.findViewById(R.id.textView)).setText("Android");
        return android;
    }


}
