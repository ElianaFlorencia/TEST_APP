package com.example.test_app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.test_app.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    public class MenuItems {
        public static final int HOME = 1;
        public static final int COLLECTION = 2;
        public static final int WISHLIST = 3;
        public static final int PROFILE = 4;
    }


    ActivityMainBinding binding;
    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, fragment);
        fragmentTransaction.commit();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new HomeFragment());
        binding.bottomNavigationView.setBackground(null);

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            Fragment fragment = null;

            switch (itemId) {
                case MenuItems.HOME:
                    fragment = new HomeFragment();
                    break;

                case MenuItems.COLLECTION:
                    fragment = new CollectionFragment();
                    break;

                case MenuItems.WISHLIST:
                    fragment = new WishlistFragment();
                    break;

                case MenuItems.PROFILE:
                    fragment = new ProfileFragment();
                    break;
            }

            if (fragment != null) {
                replaceFragment(fragment);
            }

            return true;
        });


    }


}