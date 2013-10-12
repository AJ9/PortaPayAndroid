package com.example.portapay;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class PortaPayMain extends Activity {

	static public Activity ppMain;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porta_pay_main);
        this.ppMain = this;  
		
        final Button button = (Button) findViewById(R.id.btn_launchMap);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mapDrawIntent = new Intent (ppMain, MapActivity.class) ;
                startActivity(mapDrawIntent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.porta_pay_main, menu);
        return true;
    }
    
}
