package com.example.v3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.v3.exerciseList.ExerciseAbList;
import com.example.v3.exerciseList.ExerciseEntireList;
import com.example.v3.exerciseList.ExerciseLowerList;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ExerciseFragment extends Fragment implements View.OnClickListener{
    ImageView exercise_list_entire_btn;
    ImageView exercise_list_lower_btn;
    ImageView exercise_list_ab_btn;

    SharedPreferences prefs;
    SharedPreferences.Editor edit;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_exercise, container, false);

        prefs = this.getActivity().getSharedPreferences("myPrefs", Context.MODE_PRIVATE);
        edit = prefs.edit();

        exercise_list_entire_btn = v.findViewById(R.id.exercise_list_entire_btn);
        exercise_list_lower_btn = v.findViewById(R.id.exercise_list_lower_btn);
        exercise_list_ab_btn = v.findViewById(R.id.exercise_list_ab_btn);

        exercise_list_entire_btn.setOnClickListener(this);
        exercise_list_lower_btn.setOnClickListener(this);
        exercise_list_ab_btn.setOnClickListener(this);
        return v;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.exercise_list_entire_btn:
                Intent intent1 = new Intent(getActivity(), ExerciseEntireList.class);
                startActivity(intent1);
                break;
            case R.id.exercise_list_lower_btn:
                Intent intent2 = new Intent(getActivity(), ExerciseLowerList.class);
                startActivity(intent2);
                break;
            case R.id.exercise_list_ab_btn:
                Intent intent3 = new Intent(getActivity(), ExerciseAbList.class);
                startActivity(intent3);
                break;

        }

    }

}