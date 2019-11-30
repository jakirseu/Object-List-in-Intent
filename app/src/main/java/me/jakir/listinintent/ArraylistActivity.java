package me.jakir.listinintent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ArraylistActivity extends AppCompatActivity {

    TextView tvNameList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arraylist);

        tvNameList = (TextView) findViewById(R.id.nameList);


        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){
           ArrayList<String> names = (ArrayList<String>)bundle.getStringArrayList("name_list");


            for(String name: names){
                tvNameList.append(name + "\n");
            }

        }


    }
}
