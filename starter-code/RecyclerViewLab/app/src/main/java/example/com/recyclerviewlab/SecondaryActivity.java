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

public class SecondaryActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    SecondRecyclerViewAdapter go;
    Button mButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        mRecyclerView = (RecyclerView) findViewById(R.id.secondaryrecyclerview);

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);

        mRecyclerView.setLayoutManager(linearLayoutManager);

        List<SecondCustomObject> secondCustomObjectList = new ArrayList<>();

        secondCustomObjectList.add(new SecondCustomObject("First Title", "First Description", R.color.colorAccent, true));
        secondCustomObjectList.add(new SecondCustomObject("Second Title", "Second Description", R.color.colorAccent, true));
        secondCustomObjectList.add(new SecondCustomObject("Third Title", "Third Description", R.color.colorAccent, true));
        secondCustomObjectList.add(new SecondCustomObject("Fourth Title", "Fourth Description", R.color.colorAccent, true));
        secondCustomObjectList.add(new SecondCustomObject("FifthTitle", "Fifth Description", R.color.colorAccent, true));
        secondCustomObjectList.add(new SecondCustomObject("Sixth Title", "Sixth Description", R.color.colorAccent, true));
        secondCustomObjectList.add(new SecondCustomObject("Seventh Title", "Seventh Description", R.color.colorAccent, true));
        secondCustomObjectList.add(new SecondCustomObject("Eigth Title", "Eigth Description", R.color.colorAccent, true));
        secondCustomObjectList.add(new SecondCustomObject("Ninth Title", "Ninth Description", R.color.colorAccent, true));
        secondCustomObjectList.add(new SecondCustomObject("Tenth Title", "Tenth Description", R.color.colorAccent, true));



        go = new SecondRecyclerViewAdapter(secondCustomObjectList);
        mRecyclerView.setAdapter(go);

        mButton = (Button) findViewById(R.id.button3);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
