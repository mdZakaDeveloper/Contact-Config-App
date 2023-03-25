package com.example.contactconfig;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Contact o1 = new Contact(1, "7995775173", "Zaka Kareem");
    Contact o2 = new Contact(2, "7995775173", "Zaka Kareem");
    Contact o3 = new Contact(3, "7995775173", "Zaka Kareem");
    Contact o4 = new Contact(4, "7995775173", "Zaka Kareem");
    Contact o5 = new Contact(5, "7995775173", "Zaka Kareem");
    Contact o6 = new Contact(6, "7995775173", "Zaka Kareem");
    Contact o7 = new Contact(7, "7995775173", "Zaka Kareem");
    Contact o8 = new Contact(8, "7995775173", "Zaka Kareem");
    Contact o9 = new Contact(9, "7995775173", "Zaka Kareem");
    Contact o10 = new Contact(10, "7995775173", "Zaka Kareem");
    Contact o11= new Contact(11, "7995775173", "Zaka Kareem");

    Contact[] contacts = {o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad = new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}