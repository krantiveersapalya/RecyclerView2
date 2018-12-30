package com.example.apalya.recyclerview;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Toolbar toolbar;
    String [] name={
            "User1",
            "User2",
            "User3",
            "User4",
            "User5",
            "User6",
            "User7",
            "User8",
            "User9",
            "User10",
            "User11",
            "User12"

    };
    String [] desc  ={
            "Descprition 1",
            "Descprition 2",
            "Descprition 3 ",
            "Descprition 4",
            "Descprition 5",
            "Descprition 6",
            "Descprition 7",
            "Descprition 8",
            "Descprition 9",
            "Descprition 10",
            "Descprition 11",
            "Descprition 12"


    };

    int[] image={
            R.drawable.user1,
            R.drawable.user2,
            R.drawable.user1,
            R.drawable.user2,
            R.drawable.user1,
            R.drawable.user2,
            R.drawable.user1,
            R.drawable.user2,
            R.drawable.user1,
            R.drawable.user2,
            R.drawable.user1,
            R.drawable.user2

    };

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//adding toolbar
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


recyclerView = (RecyclerView) findViewById(R.id.recycler_item);

List<User> sampleuser =new ArrayList<>();

for (int i=0;i<name.length;i++) {

    User user = new User();
    user.username = name[i];
    user.userdesc = desc[i];
    user.userimage = image[i];
    sampleuser.add(user);

}
LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RecyclerAdapter(sampleuser));


    }}

