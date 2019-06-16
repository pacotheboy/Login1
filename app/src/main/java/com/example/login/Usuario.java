package com.example.login;

import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;


/*Esta vista es para el usuario una vez registrado*/
public class Usuario extends AppCompatActivity {

    private DrawerLayout nDrawerLayout;
    private ActionBarDrawerToggle nToogle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
        nDrawerLayout=(DrawerLayout) findViewById(R.id.drawer);
        nToogle=new ActionBarDrawerToggle(this,nDrawerLayout,R.string.open,R.string.close);
        nDrawerLayout.addDrawerListener(nToogle);
        nToogle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (nToogle.onOptionsItemSelected(item))
        {
            return  true;
        }

        return super.onOptionsItemSelected(item);
    }
}
