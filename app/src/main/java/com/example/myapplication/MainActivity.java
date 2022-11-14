package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;


import com.example.myapplication.Model.Person;
import com.example.myapplication.Model.RecycleAdapterView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Person> people = new ArrayList<>();
        people.add(new Person("Quan", true));
        people.add(new Person("Ngoc", false));
        people.add(new Person("QDuan", true));
        people.add(new Person("Nam", true));
        people.add(new Person("Hai", true));
        people.add(new Person("Beo", false));
        people.add(new Person("Tu", false));
        people.add(new Person("Linh", true));
        people.add(new Person("Dung", true));
        people.add(new Person("Manh", true));
        people.add(new Person("hang", false));
        people.add(new Person("Nga", false));
        recyclerView = findViewById(R.id.recycleView);
        //tạo ra một thằng quản lý viewgroup linearLayout và thằng đấy có thuộc tính sắp xếp kiểu vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        //set  layout cho recycleView
        recyclerView.setLayoutManager(linearLayoutManager);
        //fix cứng size cho recycleView
        recyclerView.setHasFixedSize(true);
        //dùng adapter set dữ liệu cho recycleView để dẩy dữ liệu lên
        recyclerView.setAdapter(new RecycleAdapterView(people, this));
    }

}