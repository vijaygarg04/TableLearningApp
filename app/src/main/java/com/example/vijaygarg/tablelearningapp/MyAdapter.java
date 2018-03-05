package com.example.vijaygarg.tablelearningapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vijaygarg on 05/03/18.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewholder>{
    ArrayList<String >arr;
    Context context;

    public void setList(ArrayList<String>arr){
        this.arr=arr;
    }
    public MyAdapter(ArrayList<String> arr, Context context) {
        this.arr = arr;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.listview,parent,false);
        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {
        holder.tv.setText(arr.get(position));

    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    class MyViewholder extends RecyclerView.ViewHolder{
        TextView tv;
        public MyViewholder(View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.tvtable);
        }
    }
}
