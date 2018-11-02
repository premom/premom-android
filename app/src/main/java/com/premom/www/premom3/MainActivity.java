package com.premom.www.premom3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
<<<<<<< HEAD
    Button m_refButton;

    public void sl_BtnClick(View v){
            Intent ref_Intent;
            ref_Intent = new Intent(this, LoginActivity.class);
            startActivity(ref_Intent);
=======
    Button go_seat_txt;
    ImageButton go_seat_img;
    Button go_diary_txt;
    ImageButton go_diary_img;
    Button go_setting_txt;
    ImageButton go_setting_img;
    Button go_mypage_txt;
    ImageButton go_mypage_img;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setContentView(R.layout.activity_main);

        setViewId();

        go_seat_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goSeatActivity();
            }
        });

        go_seat_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goSeatActivity();
            }
        });

        go_diary_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goDiaryActivity();
            }
        });

        go_diary_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goDiaryActivity();
            }
        });

        go_setting_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goSettingActivity();
            }
        });

        go_setting_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goSettingActivity();
            }
        });

        go_mypage_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goMypageActivity();
            }
        });

        go_mypage_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goMypageActivity();
            }
        });
    }
<<<<<<< HEAD
=======


    public void setViewId() {
        go_seat_txt = (Button) findViewById(R.id.menu_seat_txt);
        go_seat_img = (ImageButton) findViewById(R.id.menu_seat_img);
        go_diary_txt = (Button) findViewById(R.id.menu_diary_txt);
        go_diary_img = (ImageButton) findViewById(R.id.menu_diary_img);
        go_setting_txt = (Button) findViewById(R.id.menu_setting_txt);
        go_setting_img = (ImageButton) findViewById(R.id.menu_setting_img);
        go_mypage_txt = (Button) findViewById(R.id.menu_mypage_txt);
        go_mypage_img = (ImageButton) findViewById(R.id.menu_mypage_img);
    }

<<<<<<< HEAD
    public void goSeatActivity(){
<<<<<<< HEAD
        Intent m1_Intent;
        m1_Intent = new Intent(this, SeatActivity.class);
        startActivity(m1_Intent);
>>>>>>> 300b700... menu complete
>>>>>>> 4e3715dfddd14bf8c335dc8483e6109ea43d8f95
=======
        Intent intent;
        intent = new Intent(this, SeatActivity.class);
        startActivity(intent);
>>>>>>> e7ee23d... login & mypage

=======
<<<<<<< HEAD

=======
>>>>>>> 3395b03f4793625fd61cc35e91182be8b3ef5343
>>>>>>> 8bef630cd847cfa34cd2e27cbd8d54d0ecd7e747
    public void setViewId() {
        go_seat_txt = (Button) findViewById(R.id.menu_seat_txt);
        go_seat_img = (ImageButton) findViewById(R.id.menu_seat_img);
        go_diary_txt = (Button) findViewById(R.id.menu_diary_txt);
        go_diary_img = (ImageButton) findViewById(R.id.menu_diary_img);
        go_setting_txt = (Button) findViewById(R.id.menu_setting_txt);
        go_setting_img = (ImageButton) findViewById(R.id.menu_setting_img);
    }

    public void goSeatActivity(){
        Intent m1_Intent;
        m1_Intent = new Intent(this, SeatActivity.class);
        startActivity(m1_Intent);
>>>>>>> 300b700... menu complete

<<<<<<< HEAD
            finish();
=======
//        finish();
>>>>>>> 2089b45... mainactivity - finish x

    }
    protected void onCreate(Bundle savedInstanceState) {
<<<<<<< HEAD
        // hyez test
=======
        // test 123
>>>>>>> 79b1a6cadb776b85e40aec8babdb2c5ca0709627
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
        setContentView(R.layout.activity_main);
        //ajeong
=======
        this.setContentView(R.layout.activity_main);
<<<<<<< HEAD
        m_refButton=(Button)findViewById(R.id.sl_button);
>>>>>>> 4f39ce5d1a1e33fc4f22177ca2c82ce28d589ccf
=======
//        m_refButton=(Button)findViewById(R.id.sl_button);

<<<<<<< HEAD
>>>>>>> dbbfcbc... mainActivity design
    }
}
=======
    public void goDiaryActivity(){
<<<<<<< HEAD
        Intent m2_Intent;
<<<<<<< HEAD
<<<<<<< HEAD
        m2_Intent = new Intent(this, DiaryActivity.class);
        startActivity(m2_Intent);
=======
        Intent intent;
        intent = new Intent(this, DiaryActivity.class);
        startActivity(intent);
>>>>>>> e7ee23d... login & mypage

//        finish();
=======
        m2_Intent = new Intent(this, SettingActivity.class);
=======
        m2_Intent = new Intent(this, SettingActivity.class);
=======
        m2_Intent = new Intent(this, DiaryActivity.class);
>>>>>>> 3395b03f4793625fd61cc35e91182be8b3ef5343
>>>>>>> 8bef630cd847cfa34cd2e27cbd8d54d0ecd7e747
        startActivity(m2_Intent);

        finish();
>>>>>>> 4e3715dfddd14bf8c335dc8483e6109ea43d8f95

    }

    public void goSettingActivity(){
        Intent intent;
        intent = new Intent(this, SettingActivity.class);
        startActivity(intent);

//        finish();

    }

    public void goMypageActivity(){
        Intent intent;
        intent = new Intent(this, MypageActivity.class);
        startActivity(intent);

<<<<<<< HEAD
//        finish();
=======
        finish();
>>>>>>> 4e3715dfddd14bf8c335dc8483e6109ea43d8f95

    }

}
>>>>>>> 300b700... menu complete
