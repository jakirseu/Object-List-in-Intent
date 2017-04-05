package me.jakir.listinintent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.Serializable;
import java.util.List;

public class ObjectListActivity extends AppCompatActivity implements Serializable {

    TextView tvNameList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_list);

        tvNameList = (TextView) findViewById(R.id.objectList);


        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){

            List<Name> names = (List<Name>) bundle.getSerializable("nameObjectList");

            for(Name name: names){
                tvNameList.append(name.getName() + " " + name.getEmail() + "\n");
            }

        }

    }
}
