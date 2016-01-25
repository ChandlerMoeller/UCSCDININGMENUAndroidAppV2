package com.drmidnight.ucscdiningmenuv2;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.annotation.Nullable;

public class aboutfragment extends android.support.v4.app.Fragment {

    private Toolbar toolbar;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_aboutfragment,container,false);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("About");

        return v;
    }
}