package com.example.anjishnumondal.test;

/**
 * Created by Anjishnu Mondal on 7/14/2016.
 */
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.TextView;

public class my_documents extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_documents);

        /* setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        TextView subLogo=(TextView)findViewById(R.id.subLogo);
        TextView upload_document=(TextView)findViewById(R.id.upload_document);
        TextView type_icon=(TextView)findViewById(R.id.type_icon);
        TextView note_img=(TextView)findViewById(R.id.note_img);
        TextView document_name=(TextView)findViewById(R.id.document_name);
        TextView download=(TextView)findViewById(R.id.download);
        TextView remove=(TextView)findViewById(R.id.remove);
        TextView document_text=(TextView)findViewById(R.id.document_text);
        TextView date=(TextView)findViewById(R.id.date_img);
        TextView document_date=(TextView)findViewById(R.id.document_date);
        TextView uploader=(TextView)findViewById(R.id.uploader);

        Spinner document_type=(Spinner)findViewById(R.id.document_type);

        Typeface font=Typeface.createFromAsset(getAssets(),"font/fontawesome.ttf");

        subLogo.setText(R.string.fa_eye);
        upload_document.setText(R.string.fa_attachment);
        type_icon.setText(R.string.fa_folder);
        note_img.setText(R.string.fa_sticky_note);
        download.setText(R.string.fa_download);
        remove.setText(R.string.fa_remove);
        date.setText(R.string.fa_calender);

        document_name.setText(R.string.document_name);
        document_text.setText(R.string.document_text);
        document_date.setText(R.string.document_date);
        uploader.setText(R.string.uploader);

        subLogo.setTypeface(font);
        upload_document.setTypeface(font);
        type_icon.setTypeface(font);
        note_img.setTypeface(font);
        download.setTypeface(font);
        remove.setTypeface(font);
        date.setTypeface(font);



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
