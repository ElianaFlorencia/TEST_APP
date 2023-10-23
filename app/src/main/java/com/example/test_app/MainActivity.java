package com.example.test_app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.View;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    RelativeLayout destacadosLayout;
    RelativeLayout categLayout;
    RelativeLayout gratuitosLayout;
    RelativeLayout descargadosLayout;
    RelativeLayout consolLayout;
    RelativeLayout novLayout;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //evento destacadosLayout
            destacadosLayout = findViewById(R.id.destacadosLayout);
            android.widget.TextView destacadosName = findViewById(R.id.destacadosName);
            destacadosLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    destacadosLayout.setBackgroundResource(R.color.yellowDestacados);
                    destacadosName.setTextColor(getResources().getColor(R.color.white));
                    destacadosLayout.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            destacadosLayout.setBackgroundResource(R.color.white);
                            destacadosName.setTextColor(getResources().getColor(R.color.purple_200));
                        }
                    }, 1000);
                }
            });//fin

            //evento categLayout
            categLayout = findViewById(R.id.categLayout);
            android.widget.TextView categName = findViewById(R.id.categName);
            categLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    categLayout.setBackgroundResource(R.color.orangeCateg);
                    categName.setTextColor(getResources().getColor(R.color.white));
                    categLayout.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            categLayout.setBackgroundResource(R.color.white);
                            categName.setTextColor(getResources().getColor(R.color.purple_200));
                        }
                    }, 1000);
                }
            });//fin

            //evento gratuitosLayout
            gratuitosLayout = findViewById(R.id.gratuitosLayout);
            android.widget.TextView gratuitosName = findViewById(R.id.gratuitosName);
            gratuitosLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    gratuitosLayout.setBackgroundResource(R.color.greenGratuitos);
                    gratuitosName.setTextColor(getResources().getColor(R.color.white));
                    gratuitosLayout.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            gratuitosLayout.setBackgroundResource(R.color.white);
                            gratuitosName.setTextColor(getResources().getColor(R.color.purple_200));
                        }
                    }, 1000);
                }
            });//fin

            //evento descargadosLayout
            descargadosLayout = findViewById(R.id.descargadosLayout);
            android.widget.TextView descargadosName = findViewById(R.id.descargadosName);
            descargadosLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    descargadosLayout.setBackgroundResource(R.color.purpleDescargados);
                    descargadosName.setTextColor(getResources().getColor(R.color.white));
                    descargadosLayout.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            descargadosLayout.setBackgroundResource(R.color.white);
                            descargadosName.setTextColor(getResources().getColor(R.color.purple_200));
                        }
                    }, 1000);
                }
            });//fin

            //evento consolLayout
            consolLayout = findViewById(R.id.consolLayout);
            android.widget.TextView consolName = findViewById(R.id.consolName);
            consolLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    consolLayout.setBackgroundResource(R.color.lightBlueConsol);
                    consolName.setTextColor(getResources().getColor(R.color.white));
                    consolLayout.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            consolLayout.setBackgroundResource(R.color.white);
                            consolName.setTextColor(getResources().getColor(R.color.purple_200));
                        }
                    }, 1000);
                }
            });//fin

            //evento novLayout
            novLayout = findViewById(R.id.novLayout);
            android.widget.TextView novName = findViewById(R.id.novName);
            novLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    novLayout.setBackgroundResource(R.color.redNov);
                    novName.setTextColor(getResources().getColor(R.color.white));
                    novLayout.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            novLayout.setBackgroundResource(R.color.white);
                            novName.setTextColor(getResources().getColor(R.color.purple_200));
                        }
                    }, 1000);
                }
            });//fin








        }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, fragment);
        fragmentTransaction.commit();
    }
}
