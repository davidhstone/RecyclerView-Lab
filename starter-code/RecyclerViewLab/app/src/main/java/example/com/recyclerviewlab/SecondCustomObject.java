package example.com.recyclerviewlab;

/**
 * Created by davidstone on 7/5/16.
 */
public class SecondCustomObject {

    public SecondCustomObject(String title, String description, int color, boolean checked) {
        this.title = title;
        this.description = description;
        this.color = color;
        this.checked = checked;
    }

    String title;
    String description;
    int color;
    Boolean checked;

    public SecondCustomObject(String s, String s1, int colorAccent){

        title = "Hi!";
        description = "funny";
        color = 999;
        checked = false;

    }
}
