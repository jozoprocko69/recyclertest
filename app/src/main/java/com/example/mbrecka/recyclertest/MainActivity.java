package com.example.mbrecka.recyclertest;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.mbrecka.recyclertest.dummy.DummyContent;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private FrameLayout mapContainer;
    private FrameLayout fragmentContainer;
    private View mapView;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapContainer = findViewById(R.id.mapContainer);
        fragmentContainer = findViewById(R.id.fragmentContainer);

        mapView = findViewById(R.id.mapView);
        recyclerView = findViewById(R.id.recycler);

        mapView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("matej", "MAP ON CLICK onClick() called with: v = [" + v + "]");
            }
        });


        recyclerView.setLayoutManager(new LinearLayoutManager(this)
//                                      {
//            @Override
//            public boolean canScrollHorizontally() {
//                return false;
//            }
//
//            @Override
//            public boolean canScrollVertically() {
//                return false;
//            }
//        }
        );
//        recyclerView.setLayoutFrozen(true);
//        recyclerView.setScrollContainer(false);
//        recyclerView.setNestedScrollingEnabled(false);
//        recyclerView.setClickable(false);
//        recyclerView.setFocusable(false);
//        recyclerView.setFocusedByDefault(false);
//        recyclerView.setAdapter(new MyItemRecyclerViewAdapter(new ArrayList<DummyContent.DummyItem>(), null));
        final MyItemRecyclerViewAdapter adapter = new MyItemRecyclerViewAdapter(DummyContent.ITEMS, null);
        recyclerView.setAdapter(adapter);
//        recyclerView.setFocusableInTouchMode(false);
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("matej", "onClick() called with: v = [" + v + "]");
            }
        });

//        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {
//            @Override
//            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder1) {
//                return false;
//            }
//
//            @Override
//            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
//                adapter.onSwipe(viewHolder);
//            }
//        }).attachToRecyclerView(recyclerView);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
