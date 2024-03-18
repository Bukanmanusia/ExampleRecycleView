package com.example.examplerecycleview;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
public class ListStudentAdapter extends RecyclerView.Adapter {
    private ArrayList<Student> listStudent;

    public ListStudentAdapter(ArrayList<Student> list){
        this.listStudent = list;
    }

    @NonNull
    @Override
    public ListviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student, parent, false);
        return new ListviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Student student = listStudent.get(position);
        Glide.with(holder.itemView.getContext())
                .load(student.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imagePhoto);
        holder.tvstudentname.setText(student.getName());
        holder.tvnim.setText(student.getNim());
    }


    @Override
    public int getItemCount() {
        return listStudent.size();
    }

    public class ListviewHolder extends RecyclerView.ViewHolder{
        public ImageView imagePhoto;
        imagePhoto studentphoto;
        TextView tvstudentname;
        TextView tvnim;
        ListviewHolder(View itemview) {
            super(itemview);
            studentphoto= itemView.findViewById(R.id.img_item_student);
            tvstudentname = itemView.findViewById(R.id.tv_item_name);
            tvnim = itemView.findViewById(R.id.tv_nim);
        }
    }
}

