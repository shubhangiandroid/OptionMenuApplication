package com.spp.optionmenuapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_setting:
                Toast.makeText(getApplicationContext(),"Setting Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_profile:
                Toast.makeText(getApplicationContext(),"Profile Selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_logout:
                Toast.makeText(getApplicationContext(),"Logout Selected",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
