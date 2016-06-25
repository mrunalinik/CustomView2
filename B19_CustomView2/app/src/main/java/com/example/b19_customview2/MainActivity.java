package com.example.b19_customview2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.b19_customview2.views.TopBar;

public class MainActivity extends AppCompatActivity {

    private TopBar topBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topBar = (TopBar) findViewById(R.id.topBar);

        topBar.setTitle("BOA");

        topBar.setLoginListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Login is clicked", Toast.LENGTH_LONG).show();
            }
        });
    }
}
