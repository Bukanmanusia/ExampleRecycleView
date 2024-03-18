package com.example.examplerecycleview;
import android.provider.ContactsContract;

import java.util.ArrayList;

public class DataStudent {
    private static String [] studentname = {
            "Dwi Jelita Adhliyah",
            "Dwi Jelita Adhliyah",
            "Dwi Jelita Adhliyah",
            "Dwi Jelita Adhliyah"
    };
    private static  String[] nim = {
            "12250120331",
            "12250120331",
            "12250120331",
            "12250120331",
    };

    private static int[] studentphoto = {
            R.drawable.dwi,
            R.drawable.adhliyah,
            R.drawable.cantik,
            R.drawable.comel,
    };

    static ArrayList<Student> getListData(){
        ArrayList<Student> list = new ArrayList<>();
        for (int position = 0; position <studentname.length; position++){
            Student student = new Student();
            student.setName(studentname[position]);
            student.setNim(nim[position]);
            student.setPhoto(studentphoto[position]);
            list.add(student);
        }
        return list;
    }
}

