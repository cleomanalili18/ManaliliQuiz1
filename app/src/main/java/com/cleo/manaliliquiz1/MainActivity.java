package com.cleo.manaliliquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class nextProgram (View view) {
        Intent intent = new Intent (this, ActivityTwo.class);
        startActivity(intent);
    }

    public class nextProgram2 (View view) {
        Intent intent = new Intent (ActivityTwo.class, ActivityThree.class);
        startActivity(intent);
    }

    public class nextProgram3 (View view) {
        Intent intent = new Intent (ActivityThree.class, ActivityFour.class);
        startActivity(intent);
    }
}
