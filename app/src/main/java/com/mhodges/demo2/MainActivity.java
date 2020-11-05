package com.mhodges.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Doggo> doggoArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doggoArrayList = new ArrayList<Doggo>();

        doggoArrayList.add(new Doggo("Jack", "TerrBoy", 14, 23, 10));
        doggoArrayList.add(new Doggo("Not jack", "TerrBoy", 14, 23, 9));
        doggoArrayList.add(new Doggo("Still not jack", "TerrBoy", 14, 23, 11));

        Collections.sort(doggoArrayList, Collections.<Doggo>reverseOrder());
        DoggoAdapter doggoAdapter = new DoggoAdapter(this, R.layout.list_item, doggoArrayList);
        ((ListView)findViewById(R.id.lvDoggo)).setAdapter(doggoAdapter);
    }


}