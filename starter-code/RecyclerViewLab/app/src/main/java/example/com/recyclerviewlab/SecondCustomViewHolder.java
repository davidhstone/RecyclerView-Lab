package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by davidstone on 7/5/16.
 */
public class SecondCustomViewHolder extends RecyclerView.ViewHolder{

    TextView title;
    TextView description;
    ImageView color;
    CheckBox checked;

    public SecondCustomViewHolder(View itemView) {
        super(itemView);

        title = (TextView) itemView.findViewById(R.id.textview_3);
        description = (TextView) itemView.findViewById(R.id.textview_4);
        color = (ImageView) itemView.findViewById(R.id.greensquare2);
        checked = (CheckBox) itemView.findViewById(R.id.checkBox);

    }

}
