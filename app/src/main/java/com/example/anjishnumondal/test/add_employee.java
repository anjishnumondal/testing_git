package com.example.anjishnumondal.test;

/**
 * Created by Anjishnu Mondal on 7/13/2016.
 */

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class add_employee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);

        TextView subLogo=(TextView)findViewById(R.id.subLogo);
        TextView upload_img=(TextView)findViewById(R.id.upload_img);
        TextView name_img=(TextView)findViewById(R.id.name_img);
        TextView date_img=(TextView)findViewById(R.id.date_img);
        TextView phone_img=(TextView)findViewById(R.id.phone_img);
        TextView gender_img=(TextView)findViewById(R.id.gender_img);
        TextView role_img=(TextView)findViewById(R.id.role_img);

        Typeface font=Typeface.createFromAsset(getAssets(),"font/fontawesome.ttf");

        subLogo.setText(R.string.fa_users);
        upload_img.setText(R.string.fa_user_add);
        name_img.setText(R.string.fa_user);
        date_img.setText(R.string.fa_calender);
        phone_img.setText(R.string.fa_phone);
        gender_img.setText(R.string.fa_gender);
        role_img.setText(R.string.fa_user);


        subLogo.setTypeface(font);
        upload_img.setTypeface(font);
        name_img.setTypeface(font);
        date_img.setTypeface(font);
        phone_img.setTypeface(font);
        gender_img.setTypeface(font);
        role_img.setTypeface(font);

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

