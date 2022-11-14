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
        people.add(new Person("Quan", true, R.drawable.cpu_img_0));
        people.add(new Person("Ngoc", false, R.drawable.cpu_img_1));
        people.add(new Person("QDuan", true, R.drawable.cpu_img_2));
        people.add(new Person("Nam", true, R.drawable.cpu_img_3));
        people.add(new Person("Hai", true, R.drawable.cpu_img_4));
        people.add(new Person("Beo", false, R.drawable.boost_img_0));
        people.add(new Person("Tu", false, R.drawable.boost_img_1));
        people.add(new Person("Linh", true, R.drawable.boost_img_2));
        people.add(new Person("Dung", true, R.drawable.boost_img_3));
        people.add(new Person("Manh", true, R.drawable.boost_img_4));
        people.add(new Person("hang", false, R.drawable.boost_img_5));
        people.add(new Person("Nga", false, R.drawable.ae));
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