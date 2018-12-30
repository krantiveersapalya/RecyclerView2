package com.example.apalya.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public ImageView image;
    public TextView name;
    public TextView desc;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        image=(ImageView) itemView.findViewById(R.id.iv);
        name= (TextView) itemView.findViewById(R.id.name_tv1);
        desc =(TextView) itemView.findViewById(R.id.descr_tv);





    }
}
