package com.example.abhisheki.androidsession5_assignment1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater M = getMenuInflater();
        M.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        TextView txt = (TextView) findViewById(R.id.txtSubmenu);

        switch (item.getItemId()) {
            case R.id.itmRed:
                txt.setTextColor(Color.RED);
                return true;
            case R.id.itmGreen:
                txt.setTextColor(Color.GREEN);
                return true;
            case R.id.itmBlue:
                txt.setTextColor(Color.BLUE);
                return true;
            default:
                return true;
        }
    }
}
