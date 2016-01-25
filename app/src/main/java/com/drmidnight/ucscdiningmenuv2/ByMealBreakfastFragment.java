package com.drmidnight.ucscdiningmenuv2;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
//import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ByMealBreakfastFragment extends Fragment {

    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;
    List<MainActivity.Menudetail> meal = null;
    String dininghallname = "Crown/Merrill";
    String dininghallhours = "7:15am to 11:00am";
    String diningmeal = "Breakfast";
    int dininghallpic = R.drawable.ic_piazza;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bymealbreakfast_layout, null);









/*        if(!test.isEmpty()) {
            meal = test.get(0);
        }*/


          /*  mRecyclerView = (RecyclerView) view.findViewById(R.id.RecyclerViewDining); // Assigning the RecyclerView Object to the xml View

            mRecyclerView.setHasFixedSize(false);                            // Letting the system know that the list objects are of fixed size

            mAdapter = new MainAdapter(meal, dininghallname, dininghallhours, diningmeal, dininghallpic, getContext());
            // And passing the titles,icons,header view name, header view email,
            // and header view profile picture

            mRecyclerView.setAdapter(mAdapter);                              // Setting the adapter to RecyclerView

            final GestureDetector mGestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public boolean onSingleTapUp(MotionEvent e) {
                    return true;
                }

            });


            mRecyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
                @Override
                public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                    View child = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());


                    if (child != null && mGestureDetector.onTouchEvent(motionEvent)) {
                        Toast.makeText(getContext(), "The Item Clicked is: " + recyclerView.getChildPosition(child), Toast.LENGTH_SHORT).show();

                        switch (recyclerView.getChildPosition(child)) {
                            case 0:
                                //This is the header
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:

                                break;
                            case 4:

                                break;
                            case 5:

                                break;
                            case 6:
                                //This is a line
                                break;
                            case 7:
                                //This is a subtitle
                                break;
                            case 8:

                                break;
                            case 9:

                                break;
                            case 10:

                                break;
                            default:
                                break;
                        }

                        return true;

                    }

                    return false;
                }

                @Override
                public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {

                }

                @Override
                public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

                }
            });


            mLayoutManager = new LinearLayoutManager(getContext());                 // Creating a layout Manager

            mRecyclerView.setLayoutManager(mLayoutManager);               // Setting the layout Manager




*/










        return view;
    }




/*    public void refreshData(ArrayList<List<MainActivity.Menudetail>> test) {







        //yourArray = new ArrayList<YourObject>(data);
        meal = test.get(0);
        System.out.println("REFRESHED DATA");
        mAdapter.notifyDataSetChanged();
    }*/


}
