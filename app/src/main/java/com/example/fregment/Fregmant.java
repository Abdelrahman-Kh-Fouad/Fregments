package com.example.fregment;

import android.graphics.Color;
import android.graphics.ColorSpace;
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


    private class RGBColor{
        final int ColorBound =255;
        int R ,G , B;
        public void RGBColor(){
            setRand();
        }
        public void setRand(){
            Random rand = new Random();
            R = rand.nextInt(ColorBound);
            G = rand.nextInt(ColorBound);
            B = rand.nextInt(ColorBound);
        }
        
    }
    RGBColor nextColor ;
    public void Fragment(){}

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
        nextColor =new RGBColor();
        nextColor.setRand();
        textView.setBackgroundColor(Color.rgb(nextColor.R,nextColor.G ,nextColor.B));

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextColor.setRand();
                textView.setBackgroundColor(Color.rgb(nextColor.R,nextColor.G ,nextColor.B));
                System.out.println("sd");
            }
        });
    }
}