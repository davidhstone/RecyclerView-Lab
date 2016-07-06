package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by davidstone on 7/5/16.
 */
public class SecondRecyclerViewAdapter extends RecyclerView.Adapter<SecondCustomViewHolder> {

    List<SecondCustomObject> secondCustomObjectList;

    public SecondRecyclerViewAdapter(List<SecondCustomObject> secondCustomObjects){

        secondCustomObjectList = secondCustomObjects;
    }

    @Override
    public SecondCustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View parentView = inflater.inflate(R.layout.second_custom_view, parent, false);
        SecondCustomViewHolder secondViewHolder = new SecondCustomViewHolder(parentView);
        return secondViewHolder;
    }

    @Override
    public void onBindViewHolder(SecondCustomViewHolder holder, int position) {
        final SecondCustomObject secondCustomObject = secondCustomObjectList.get(position);
        final SecondCustomViewHolder secondCustomViewHolder2 = holder;
        holder.title.setText(secondCustomObject.title);
        holder.description.setText(secondCustomObject.description);
        holder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
            //    Toast.makeText(view.getContext(), "The checkbox is " + secondCustomObject.checked, Toast.LENGTH_SHORT).show();
                secondCustomObject.checked = !secondCustomObject.checked;
                secondCustomViewHolder2.checked.setChecked(secondCustomObject.checked);
                Toast.makeText(view.getContext(), "The checkbox is " + secondCustomObject.checked, Toast.LENGTH_SHORT).show();


            }
        });



    }

    @Override
    public int getItemCount() {
        return secondCustomObjectList.size();
    }
}
