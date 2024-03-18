package com.example.examplerecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvStudent;
    private ArrayList<Student> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvStudent = findViewById(R.id.rv_Student);
        rvStudent.setHasFixedSize(true);

        list.addAll(DataStudent.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvStudent.setLayoutManager(new LinearLayoutManager(this));
        ListStudentAdapter listStudentAdapter = new ListStudentAdapter(list);
        rvStudent.setAdapter(listStudentAdapter);
    }
}