package me.jakir.listinintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Serializable {

    List<String> names = new ArrayList<String>();

    List<Name> nameObjectList =  new ArrayList<Name>();;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // creating array list
        names.add("Bill Gates");
        names.add("Warren Buffett");
        names.add("Jeff Bezos");
        names.add("Mark Zuckerberg");

        // Creating custom object list

        Name name1 = new Name("Bill Gates", "mail@billgates.com");;
        nameObjectList.add(name1);
        Name name2 = new Name("Warren Buffett", "mail@WarrenBuffett.com");;
        nameObjectList.add(name2);

    }

    public void openArrayListActivity(View view){
        Intent intent = new Intent(this, ArraylistActivity.class);
        intent.putStringArrayListExtra("name_list", (ArrayList<String>) names);
        startActivity(intent);

    }


    public void openObjectListActivity(View view){
        Intent intent = new Intent(this, ObjectListActivity.class);
        intent.putExtra("nameObjectList", (Serializable) nameObjectList);
        startActivity(intent);

    }
}
