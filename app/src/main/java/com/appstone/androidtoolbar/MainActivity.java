package com.appstone.androidtoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        BottomNavigationView bottomNav = findViewById(R.id.bottomnav);
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_edit:
                        Toast.makeText(MainActivity.this, "Bottom Edit is Pressed", Toast.LENGTH_SHORT).show();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentHolder, new SubFragment()).commit();
                        break;

                    case R.id.actionDelete:
                        Toast.makeText(MainActivity.this, "Bottom Delete is Pressed", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.actionSave:
                        Toast.makeText(MainActivity.this, "Bottom Save is Pressed", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });
//        getSupportActionBar().setTitle("My APP");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                Toast.makeText(MainActivity.this, "Back is Pressed", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_edit:
                Toast.makeText(MainActivity.this, "Edit is Pressed", Toast.LENGTH_SHORT).show();
                break;

            case R.id.actionDelete:
                Toast.makeText(MainActivity.this, "Deelet is Pressed", Toast.LENGTH_SHORT).show();
                break;

            case R.id.actionSave:
                Toast.makeText(MainActivity.this, "Save is Pressed", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
