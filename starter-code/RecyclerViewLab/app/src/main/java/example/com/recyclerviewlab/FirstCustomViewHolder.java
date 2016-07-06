package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by davidstone on 7/5/16.
 */
public class FirstCustomViewHolder extends RecyclerView.ViewHolder{

    TextView title;
    TextView description;
    ImageView color;

    public FirstCustomViewHolder(View itemView) {
        super(itemView);

        title = (TextView) itemView.findViewById(R.id.textview_1);
        description = (TextView) itemView.findViewById(R.id.textview_2);
        color = (ImageView) itemView.findViewById(R.id.greensquare1);

    }
}
