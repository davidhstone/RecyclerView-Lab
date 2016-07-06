package example.com.recyclerviewlab;

/**
 * Created by davidstone on 7/5/16.
 */
public class FirstCustomObject {

    public FirstCustomObject(String title, String description, int color, boolean checked) {
        this.title = title;
        this.description = description;
        this.color = color;

    }

    String title;
    String description;
    int color;


    public FirstCustomObject(String s, String s1, int colorAccent){

        title = "Hi!";
        description = "funny";
        color = 999;


    }
}
