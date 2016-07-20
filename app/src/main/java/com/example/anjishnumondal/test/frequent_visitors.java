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

public class frequent_visitors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frequent_visitors);


        TextView subLogo=(TextView)findViewById(R.id.subLogo);
        TextView name_img=(TextView)findViewById(R.id.name_img);
        TextView name=(TextView)findViewById(R.id.visitor_name);
        TextView phone_img=(TextView)findViewById(R.id.phone_img);
        TextView phone_img1=(TextView)findViewById(R.id.phone_img1);
        TextView phone_show=(TextView)findViewById(R.id.phone_show);

        Typeface font=Typeface.createFromAsset(getAssets(),"font/fontawesome.ttf");

        subLogo.setText(R.string.fa_eye);
        name_img.setText(R.string.fa_user);
        phone_img.setText(R.string.fa_phone);
        phone_img1.setText(R.string.fa_phone);

        name.setText(R.string.visitor_name);
        phone_show.setText(R.string.phone_no);

        subLogo.setTypeface(font);
        name_img.setTypeface(font);
        phone_img.setTypeface(font);
        phone_img1.setTypeface(font);

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
