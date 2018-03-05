package com.example.vijaygarg.tablelearningapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

RecyclerView rv;
SeekBar sb;
ArrayList<String> arr;
MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.recyclerView);
        sb=findViewById(R.id.seekbar);
        arr=new ArrayList<>();
        sb.setMax(50);
        sb.setProgress(25);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                arr=new ArrayList<>();
                for(int j=1;j<=10;j++){

                    arr.add(i+"  *  "+j+"  =  "+j*i);
                }
        myAdapter.setList(arr);
        myAdapter.notifyDataSetChanged();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        myAdapter=new MyAdapter(arr,this);
        for(int j=1;j<=10;j++){

            arr.add(25+"  *  "+j+"  =  "+j*25);
        }
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();
    }

}
