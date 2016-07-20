package com.example.anjishnumondal.test;

/**
 * Created by Anjishnu Mondal on 7/12/2016.
 */

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class emergency_contacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_contacts);

        TextView subLogo=(TextView)findViewById(R.id.subLogo);
        TextView policeLogo=(TextView)findViewById(R.id.policelogo);
        TextView policeLabel=(TextView)findViewById(R.id.policelabel);
        TextView policeRow1Label=(TextView)findViewById(R.id.police_row_1_label);
        TextView phone1=(TextView)findViewById(R.id.phone1);
        TextView police_row_1_no=(TextView)findViewById(R.id.police_row1_no);
        TextView policeRow2Label=(TextView)findViewById(R.id.police_row_2_label);
        TextView phone2=(TextView)findViewById(R.id.phone2);
        TextView police_row_2_no=(TextView)findViewById(R.id.police_row2_no);

        Typeface font=Typeface.createFromAsset(getAssets(),"font/fontawesome.ttf");

        subLogo.setText(R.string.fa_plus_circle);
        policeLogo.setText(R.string.fa_shield);
        policeLabel.setText(R.string.police_label);
        policeRow1Label.setText(R.string.police_row1_label);
        phone1.setText(R.string.fa_phone);
        police_row_1_no.setText(R.string.police_row_1_no);
        policeRow2Label.setText(R.string.police_row2_label);
        phone2.setText(R.string.fa_phone);
        police_row_2_no.setText(R.string.police_row_2_no);


        subLogo.setTypeface(font);
        policeLogo.setTypeface(font);
        phone1.setTypeface(font);
        phone2.setTypeface(font);

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
