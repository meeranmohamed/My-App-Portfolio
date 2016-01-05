package com.app.portfolio.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button = (Button) findViewById(R.id.spotify_streamer_button);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.scores_button);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.library_button);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.build_big_button);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.xyz_reader_button);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.capstone_button);
        button.setOnClickListener(this);

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

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(toast != null)
            toast.cancel();
        switch (id) {
            case R.id.spotify_streamer_button:
                toast = Toast.makeText(this, "This button will launch Spotify streamer App", Toast.LENGTH_LONG);
                toast.show();
                break;

            case R.id.scores_button:
                toast = Toast.makeText(this, "This button will launch Scores App", Toast.LENGTH_SHORT);
                toast.show();
                break;

            case R.id.library_button:
                toast = Toast.makeText(this, "This button will launch Library App", Toast.LENGTH_SHORT);
                toast.show();
                break;

            case R.id.build_big_button:
                toast = Toast.makeText(this, "This button will launch Build It Bigger App", Toast.LENGTH_SHORT);
                toast.show();
                break;

            case R.id.xyz_reader_button:
                toast = Toast.makeText(this, "This button will launch XYZ Reader App", Toast.LENGTH_SHORT);
                toast.show();
                break;

            case R.id.capstone_button:
                toast = Toast.makeText(this, "This button will launch Capstone App", Toast.LENGTH_SHORT);
                toast.show();
                break;
        }
    }
}
