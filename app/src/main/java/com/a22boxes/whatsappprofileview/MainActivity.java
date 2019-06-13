package com.a22boxes.whatsappprofileview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    RecyclerViewAdapter adapter;
    ArrayList<RecyclerEntity> list;

    @BindView(R.id.recycler)
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        list = new ArrayList<>();
        adapter = new RecyclerViewAdapter(this, list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        setRecyclerViewData();
    }

    private void setRecyclerViewData() {
        list.add(new RecyclerEntity(R.mipmap.person1, "Jane Austen", "5:30 PM"));
        list.add(new RecyclerEntity(R.mipmap.person2, "Mark Twain", "11:30 PM"));
        list.add(new RecyclerEntity(R.mipmap.person3, "Ernest Hemmingway", "6:00 PM"));
        list.add(new RecyclerEntity(R.mipmap.person4, "F. Scott Fritzgerald", "7:30 PM"));
        list.add(new RecyclerEntity(R.mipmap.person5, "George Orwell", "1:20 PM"));
        list.add(new RecyclerEntity(R.mipmap.person6, "Harper Lee", "3:30 PM"));
        list.add(new RecyclerEntity(R.mipmap.person7, "J.R.R. Tolkien", "5:40 PM"));
        list.add(new RecyclerEntity(R.mipmap.person8, "Agatha Christie", "8:30 PM"));
        list.add(new RecyclerEntity(R.mipmap.person9, "Arthur Conan Doyle", "5:40 PM"));

        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);
    }
}
