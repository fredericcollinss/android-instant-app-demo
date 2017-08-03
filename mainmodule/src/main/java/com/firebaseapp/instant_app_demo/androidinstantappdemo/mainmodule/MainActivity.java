package com.firebaseapp.instant_app_demo.androidinstantappdemo.mainmodule;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.trustcircle.internetmodule.InternetActivity;
import com.trustcircle.permissionmodule.PermissionActivity;

public class MainActivity extends AppCompatActivity {

    private Button mRecyclerViewButton;
    private Button mPermissionRequestButton;
    private Button mInternetAccessButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mRecyclerViewButton = (Button) findViewById(R.id.rv_button);
//        mRecyclerViewButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, RecyclerViewActivity.class);
//                startActivity(i);
//            }
//        });

        mPermissionRequestButton = (Button) findViewById(R.id.permission_module_button);
        mPermissionRequestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, PermissionActivity.class);
                startActivity(i);
            }
        });

        mInternetAccessButton = findViewById(R.id.internet_access_module_button);
        mInternetAccessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, InternetActivity.class);
                startActivity(i);
            }
        });


    }
}
