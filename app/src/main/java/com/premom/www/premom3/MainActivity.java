package com.premom.www.premom3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button m_refButton;

    public void sl_BtnClick(View v){
            Intent ref_Intent;
            ref_Intent = new Intent(this, LoginActivity.class);
            startActivity(ref_Intent);

            finish();

    }
    protected void onCreate(Bundle savedInstanceState) {
        // test 123
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
        setContentView(R.layout.activity_main);
        //ajeong
=======
        this.setContentView(R.layout.activity_main);
        m_refButton=(Button)findViewById(R.id.sl_button);
>>>>>>> 4f39ce5d1a1e33fc4f22177ca2c82ce28d589ccf
    }
}
