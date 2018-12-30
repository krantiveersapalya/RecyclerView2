package com.example.apalya.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<ViewHolder> {
  private List<User> users;

    public RecyclerAdapter(List<User> users) {
        this.users = users;
    }

    /*public class RecyclerAdapter extends RecyclerView.Adapter<ViewHolder> when u press alt enter it automatically add all three methods*/
    @NonNull
    @Override

  /*  IT IS USED TO CREATE NEW ITEM INSIDE THE RECYCLER VIEW
  SO REMOVE         return null;
  */

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //it main creating view iteams
        View view =LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_item,viewGroup,false);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        User smapleuser=users.get(i);
        viewHolder.name.setText(smapleuser.username);
        viewHolder.desc.setText(smapleuser.userdesc);
        viewHolder.image.setImageResource(smapleuser.userimage);

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
