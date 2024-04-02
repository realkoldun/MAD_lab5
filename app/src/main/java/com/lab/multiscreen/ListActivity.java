package com.lab.multiscreen;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;


public class ListActivity extends android.app.ListActivity {

    String[] islands = {"Канары", "Курилы", "Мальдивы", "Филиппины"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, islands);
        setListAdapter(arrayAdapter);
        Log.d("App", "stared");

        AdapterView.OnItemClickListener itemClickListener = (parent, view, position, id) -> {
            Log.d("App", "clicked");
            switch (position) {
                case 0:
                    Intent intent_1 = new Intent(ListActivity.this, Canars.class);
                    startActivity(intent_1);
                    break;
                case 1:
                    Intent intent_2 = new Intent(ListActivity.this, Maldives.class);
                    startActivity(intent_2);
                    break;
                case 2:
                    Intent intent_3 = new Intent(ListActivity.this, Smokings.class);
                    startActivity(intent_3);
                    break;
                case 3:
                    Intent intent_4 = new Intent(ListActivity.this, Phillipins.class);
                    startActivity(intent_4);
                    break;
            }
            Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(),
                    Toast.LENGTH_SHORT).show();
        };
        getListView().setOnItemClickListener(itemClickListener);
    }
}