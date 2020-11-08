package com.mhodges.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Doggo> doggoArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doggoArrayList = new ArrayList<Doggo>();

        doggoArrayList.add(new Doggo("Jack", "TerrBoy", 14, 45, 10));
        doggoArrayList.add(new Doggo("Not jack", "TerrBoy", 14, 32, 9));
        doggoArrayList.add(new Doggo("Still not jack", "TerrBoy", 14, 16, 11));

        ShowItems();
    }

    private void ShowItems(){
        DoggoAdapter doggoAdapter = new DoggoAdapter(this, R.layout.list_item, doggoArrayList);
        ((ListView)findViewById(R.id.lvDoggo)).setAdapter(doggoAdapter);
    }


    public void btnACS_Click(View view) {
        Collections.sort(doggoArrayList);
        ShowItems();
    }

    public void btnDSC_Click(View view) {
        Collections.sort(doggoArrayList, Collections.<Doggo>reverseOrder());
        ShowItems();
    }

    public void btnDifferentASC_Click(View view) {
        Collections.sort(doggoArrayList, new Comparator<Doggo>() {
            @Override
            public int compare(Doggo doggo, Doggo t1) {
                return Float.compare(doggo.getHeight(), t1.getHeight());
            }
        });

        ShowItems();
    }
}

//    Collections.sort(articles, new Comparator<Article>() {
//        public int compare(Article a1, Article a2) {
//            Date d1 = ConvertDate(a1.getPubDate());
//            Date d2 = ConvertDate(a2.getPubDate());
//
//            if (d1 == null || d2 == null)
//                return 0;
//
//            if (sharedPreferences.getString("sortingDirection", "asc").equals("asc"))
//                return d2.compareTo(d1);
//            else
//                return d1.compareTo(d2);
//            }
//    });