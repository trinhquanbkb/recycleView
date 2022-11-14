package com.example.myapplication.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class RecycleAdapterView extends RecyclerView.Adapter<RecycleAdapterView.DataViewHolder> {
    //1. chỉ ra danh sách
    List<Person> personList;
    Context context;

    public RecycleAdapterView(List<Person> personList, Context context) {
        this.personList = personList;
        this.context = context;
    }

    //5. hiển thị view lên dữ liệu
    @NonNull
    @Override
    public RecycleAdapterView.DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        //6. chuyển đổi dữ liệu từ xml sang java
        switch (viewType){
            case 1:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item, parent, false);
                break;
            case 2:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_famale, parent, false);
                break;
            default:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item, parent, false);
                break;
        }
        //trả ra màn hình
        return new DataViewHolder(view);
    }

    //3. lấy view item bắt được để set dữ liệu cho nó
    @Override
    public void onBindViewHolder(@NonNull RecycleAdapterView.DataViewHolder holder, int position) {
        String name = personList.get(position).getName();
        holder.textView.setText(name);
    }

    //4.phân biệt type của view để làm gì đó
    @Override
    public int getItemViewType(int position) {
        if(personList.get(position).isMale()){
            return 1;
        }else{
            return 2;
        }
    }

    @Override
    public int getItemCount() {
        return personList == null ? 0 : personList.size();
    }

    //2. class này dùng để bắt được view item
    public static class DataViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
