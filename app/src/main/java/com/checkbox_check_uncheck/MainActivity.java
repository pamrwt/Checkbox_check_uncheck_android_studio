package com.checkbox_check_uncheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Spinner spinner;
public static List<String> list=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);

        spinner_adapter s=new spinner_adapter(getApplicationContext(),
                android.R.layout.simple_spinner_item,getResources().getStringArray(R.array.month_array));

        spinner.setAdapter(s);


    }
}
