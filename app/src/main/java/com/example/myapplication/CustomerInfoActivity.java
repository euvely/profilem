package com.example.myapplication;

import android.content.Intent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.write);

        buttonNext.setOnClickListener(View.OnClickListener {
            // 입력된 정보를 가져오기
            val name = editTextName.text.toString();
            val dob = editTextDOB.text.toString();
            val location = editTextLocation.text.toString();

            // 다음 화면으로 데이터 전달
            val intent = Intent(this, NextActivity::class.java);
            intent.putExtra("name", name);
            intent.putExtra("dob", dob);
            intent.putExtra("location", location);
            startActivity(intent);
        })
    }
}
