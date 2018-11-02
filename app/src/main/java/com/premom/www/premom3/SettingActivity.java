package com.premom.www.premom3;

<<<<<<< HEAD
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
=======
import android.app.Service;
import android.content.Intent;
>>>>>>> 46838e8d0ce61ea5f4df45e3b7530f20e00bdb38
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class SettingActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

<<<<<<< HEAD
        // Display the fragment as the main content.
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingPreferenceFragment())
                .commit();

=======
    }

    public void inform_btn(View v){
        Intent inform_Intent;
        inform_Intent = new Intent(this, InformActivity.class);
        startActivity(inform_Intent);

        finish();
    }

    public void service_btn(View v){
        Intent service_Intent;
        service_Intent = new Intent(this, ServiceHelpActivity.class);
        startActivity(service_Intent);

        finish();
    }

    public void logout_btn(View v){
        Intent logout_Intent;
        logout_Intent = new Intent(this, LogoutActivity.class);
        startActivity(logout_Intent);
>>>>>>> 46838e8d0ce61ea5f4df45e3b7530f20e00bdb38

        finish();
    }

<<<<<<< HEAD



}
=======
    }






>>>>>>> 46838e8d0ce61ea5f4df45e3b7530f20e00bdb38
