package com.example.anjishnumondal.test;

/**
 * Created by Anjishnu Mondal on 7/13/2016.
 */

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_list);

        TextView subLogo=(TextView)findViewById(R.id.subLogo);
        TextView employeeName=(TextView)findViewById(R.id.employee_name);
        TextView job=(TextView)findViewById(R.id.job);
        TextView clock=(TextView)findViewById(R.id.clock);
        TextView schedule=(TextView)findViewById(R.id.schedule);
        Button edit=(Button)findViewById(R.id.edit);
        Button remove=(Button)findViewById(R.id.remove);

        Typeface font=Typeface.createFromAsset(getAssets(),"font/fontawesome.ttf");

        subLogo.setText(R.string.fa_users);
        edit.setText(R.string.fa_edit);
        remove.setText(R.string.fa_remove);
        clock.setText(R.string.fa_clock);

        employeeName.setText(R.string.emp_name);
        job.setText(R.string.job);
        schedule.setText(R.string.schedule);

        subLogo.setTypeface(font);
        edit.setTypeface(font);
        remove.setTypeface(font);
        clock.setTypeface(font);

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
