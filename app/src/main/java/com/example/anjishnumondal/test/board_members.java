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

public class board_members extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_members);

        TextView subLogo=(TextView)findViewById(R.id.subLogo);
        TextView ex_officio_name=(TextView)findViewById(R.id.ex_officio_name);
        TextView ex_officio_designation=(TextView)findViewById(R.id.ex_offcio_designation);
        TextView ex_officio_phone=(TextView)findViewById(R.id.ex_officio_phone);
        TextView ex_officio_mail=(TextView)findViewById(R.id.ex_officio_mail);
        TextView phone_icon=(TextView)findViewById(R.id.phone_icon);
        TextView mail_icon=(TextView)findViewById(R.id.mail_icon);

        Typeface font=Typeface.createFromAsset(getAssets(),"font/fontawesome.ttf");

        subLogo.setText(R.string.fa_users);
        phone_icon.setText(R.string.fa_phone);
        mail_icon.setText(R.string.fa_envelope);

        ex_officio_name.setText(R.string.ex_officio_name);
        ex_officio_designation.setText(R.string.ex_offcio_designation);
        ex_officio_phone.setText(R.string.ex_offio_phone);
        ex_officio_mail.setText(R.string.ex_officio_mail);

        subLogo.setTypeface(font);
        phone_icon.setTypeface(font);
        mail_icon.setTypeface(font);

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
