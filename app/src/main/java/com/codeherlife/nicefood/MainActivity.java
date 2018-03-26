package com.codeherlife.nicefood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)this.findViewById(
                R.id.text_view_title);
        textView.setText(R.string.products_title);

        ArrayList<String> candyList = new ArrayList<String>();

        candyList.add("Orange Chicken");
        candyList.add("Beef and Broccoli");
        candyList.add("Chow Mein");
        candyList.add("Fried Rice");
        candyList.add("Steamed Vegetables");
        candyList.add("Chicken Wings");
        candyList.add("Egg Rolls");
        candyList.add("Cream Cheese Wontons");
        candyList.add("Thai Tea Boba");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                R.layout.list_item_candy,
                R.id.text_view_candy,
                candyList );
        ListView listView = (ListView)this.findViewById(
                R.id.list_view_candy);
        listView.setAdapter(adapter);

    }
}
