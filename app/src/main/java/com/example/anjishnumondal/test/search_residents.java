package com.example.anjishnumondal.test;

/**
 * Created by Anjishnu Mondal on 7/15/2016.
 */
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


import org.w3c.dom.Text;

public class search_residents extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_residents);

        TextView subLogo=(TextView)findViewById(R.id.subLogo);
        TextView search_icon=(TextView)findViewById(R.id.search_icon);
        TextView resident_name=(TextView)findViewById(R.id.search_name);
        TextView resident_profession=(TextView)findViewById(R.id.resident_profession);
        TextView phone_icon=(TextView)findViewById(R.id.phone_icon);
        TextView resident_block=(TextView)findViewById(R.id.resident_block);

        Typeface font=Typeface.createFromAsset(getAssets(),"font/fontawesome.ttf");

        subLogo.setText(R.string.fa_search);
        phone_icon.setText(R.string.fa_phone);
        search_icon.setText(R.string.fa_search);

        resident_name.setText(R.string.search_name);
        resident_profession.setText(R.string.search_profession);
        resident_block.setText(R.string.search_block_no);

        subLogo.setTypeface(font);
        phone_icon.setTypeface(font);
        search_icon.setTypeface(font);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
