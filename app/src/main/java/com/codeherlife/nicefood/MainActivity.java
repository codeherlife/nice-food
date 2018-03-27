package com.codeherlife.nicefood;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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
        candyList.add("Kung Pao Chicken");
        candyList.add("Eggplant Chicken");
        candyList.add("Beef and Broccoli");
        candyList.add("Fried Fish");
        candyList.add("Coconut Shrimp");
        candyList.add("Terriyaki Pork");
        candyList.add("Chow Mein");
        candyList.add("Fried Rice");
        candyList.add("Steamed Rice");
        candyList.add("Steamed Vegetables");
        candyList.add("Chicken Wings");
        candyList.add("Egg Drop Soup");
        candyList.add("Hot and Sour Soup");
        candyList.add("Wonton Soup");
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

        Context context = this;
        String text = "Welcome to the Nice Food menu app!";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();


    }
}
