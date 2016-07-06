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
public class FirstRecyclerViewAdapter extends RecyclerView.Adapter<FirstCustomViewHolder> {

    List<FirstCustomObject> firstCustomObjectList;

    public FirstRecyclerViewAdapter(List<FirstCustomObject> firstCustomObjects) {

        firstCustomObjectList = firstCustomObjects;
    }
        @Override
        public FirstCustomViewHolder onCreateViewHolder (ViewGroup parent,int viewType){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View parentView = inflater.inflate(R.layout.first_custom_view, parent, false);
            FirstCustomViewHolder viewHolder = new FirstCustomViewHolder(parentView);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder (FirstCustomViewHolder holder, int position){
            final int myPosition = position;
            final FirstCustomObject firstCustomObject = firstCustomObjectList.get(position);
            holder.title.setText(firstCustomObject.title);
            holder.description.setText(firstCustomObject.description);
            holder.title.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view){
                    Toast.makeText(view.getContext(), "The title of the row is " + firstCustomObject.title, Toast.LENGTH_SHORT).show();
                }
            });


        }

        @Override
        public int getItemCount () {
            return firstCustomObjectList.size();
        }

}
