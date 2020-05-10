package com.checkbox_check_uncheck;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class spinner_adapter extends ArrayAdapter<String> {
    String montharray[];
    Context context;

    public spinner_adapter(@NonNull Context context, int resource,String[] montharray) {
        super(context, resource,montharray);
        this.context=context;
        this.montharray=montharray;
    }

    @Override
    public View getDropDownView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(R.layout.adapter_layout,null);
        CheckBox checkBox=convertView.findViewById(R.id.checkbox);
        checkBox.setText(montharray[position]);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                    MainActivity.list.add(montharray[position]);
                }else {
                    MainActivity.list.remove(montharray[position]);
                }
                Toast.makeText(context,MainActivity.list.toString(),Toast.LENGTH_LONG).show();

            }
        });



        return convertView;
    }
}
