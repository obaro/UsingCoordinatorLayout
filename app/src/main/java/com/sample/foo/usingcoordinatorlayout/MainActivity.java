package com.sample.foo.usingcoordinatorlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mFabAndSnackbarButton;
    private Button mFabAndTwoWidgetsButton;
    private Button mCollapsingToolbarButton;
    private Button mCustomBehaviorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFabAndSnackbarButton = (Button) findViewById(R.id.fabAndSnackbarButton);
        mFabAndSnackbarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FabAndSnackbarActivity.class));
            }
        });

        mFabAndTwoWidgetsButton = (Button) findViewById(R.id.fabAndTwoWidgetsButton);
        mFabAndTwoWidgetsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FabFollowsWidgetActivity.class));
            }
        });

        mCollapsingToolbarButton = (Button) findViewById(R.id.collapseToolbarButton);
        mCollapsingToolbarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CollapsingToolbarActivity.class));
            }
        });

        mCustomBehaviorButton = (Button) findViewById(R.id.customBehaviorButton);
        mCustomBehaviorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CustomBehaviorActivity.class));
            }
        });
    }
}
