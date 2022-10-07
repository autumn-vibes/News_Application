package com.example.intern_task;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {

    private String[] data1;
    private String[] data2;
    private ArrayList<byte[]> bitmap;

    public HomeAdapter(ArrayList<String> data1, ArrayList<String> data2,ArrayList<byte[]> bitmap){
        this.data1 = data1.toArray(new String[0]);
        this.data2 = data2.toArray(new String[0]);
        this.bitmap = bitmap;
    }

    @NonNull


    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {



        }
        //


    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder{


    }

}
