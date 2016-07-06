package example.com.recyclerviewlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    FirstRecyclerViewAdapter go;
    Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mRecyclerView = (RecyclerView) findViewById(R.id.mainrecyclerview);

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);

        mRecyclerView.setLayoutManager(linearLayoutManager);

        List<FirstCustomObject> firstCustomObjectList = new ArrayList<>();

        firstCustomObjectList.add(new FirstCustomObject("First Title", "First Description", R.color.colorAccent, true));
        firstCustomObjectList.add(new FirstCustomObject("Second Title", "Second Description", R.color.colorAccent, true));
        firstCustomObjectList.add(new FirstCustomObject("Third Title", "Third Description", R.color.colorAccent, true));
        firstCustomObjectList.add(new FirstCustomObject("Fourth Title", "Fourth Description", R.color.colorAccent, true));
        firstCustomObjectList.add(new FirstCustomObject("Fifth Title", "Fifth Description", R.color.colorAccent, true));
        firstCustomObjectList.add(new FirstCustomObject("Sixth Title", "Sixth Description", R.color.colorAccent, true));
        firstCustomObjectList.add(new FirstCustomObject("Seventh Title", "Seventh Description", R.color.colorAccent, true));
        firstCustomObjectList.add(new FirstCustomObject("Eighth Title", "Eighth Description", R.color.colorAccent, true));
        firstCustomObjectList.add(new FirstCustomObject("Ninth Title", "Ninth Description", R.color.colorAccent, true));
        firstCustomObjectList.add(new FirstCustomObject("Tenth Title", "Tenth Description", R.color.colorAccent, true));


        go = new FirstRecyclerViewAdapter(firstCustomObjectList);
        mRecyclerView.setAdapter(go);

        mButton = (Button) findViewById(R.id.button2);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), SecondaryActivity.class);
                startActivity(intent);
            }
        });


    }
}
