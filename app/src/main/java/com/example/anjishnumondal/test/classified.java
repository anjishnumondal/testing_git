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

public class classified extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classified);

         TextView subLogo=(TextView)findViewById(R.id.subLogo);
        TextView rupee_icon=(TextView)findViewById(R.id.rupee_icon);
        TextView from_date=(TextView)findViewById(R.id.from_date_img);
        TextView valid_date=(TextView)findViewById(R.id.valid_date_img);
        TextView upload_image=(TextView)findViewById(R.id.upload_img);


        Typeface font=Typeface.createFromAsset(getAssets(),"font/fontawesome.ttf");

        subLogo.setText(R.string.fa_newspaper);
        rupee_icon.setText(R.string.fa_rupee);
        from_date.setText(R.string.fa_calender);
        valid_date.setText(R.string.fa_calender);
        upload_image.setText(R.string.fa_upload);

        subLogo.setTypeface(font);
        rupee_icon.setTypeface(font);
        from_date.setTypeface(font);
        valid_date.setTypeface(font);
        upload_image.setTypeface(font);



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
