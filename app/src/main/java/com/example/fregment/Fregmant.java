package com.example.fregment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Random;

public class Fregmant extends Fragment {

    static int ColorBound =16777216;
    int nextColor ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fregment_layout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView=(TextView) view.findViewById(R.id.textView5);
        Random rand = new Random();
        nextColor = rand.nextInt(ColorBound);
        textView.setBackgroundColor(nextColor);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextColor = rand.nextInt(ColorBound);
                textView.setBackgroundColor(nextColor);
            }
        });
    }
}