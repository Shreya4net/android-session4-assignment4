package com.dce.puja.sortingdata;

import android.content.ClipData;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuView;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView simpleList;
    ArrayList AndroidList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (GridView) findViewById(R.id.simpleGridView);
        AndroidList.add(new item("cupcake ", R.drawable.logo1));
        AndroidList.add(new item("donut 2",R.drawable.logo2));
        AndroidList.add(new item("froy",R.drawable.logo3));
        AndroidList.add(new item("jellybene",R.drawable.logo4));
        AndroidList.add(new item("kitkat",R.drawable.logo5));
        AndroidList.add(new item("lolipop",R.drawable.logo6));
         MyAdapter myAdapter=new MyAdapter(this,R.layout.activity_gridview,AndroidList);
        simpleList.setAdapter(myAdapter);

    }
}





