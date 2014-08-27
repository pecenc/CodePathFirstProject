package com.example.codepath.codepathfirstproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	public EditText etWords;
	public TextView tvLabel;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etWords = (EditText) findViewById(R.id.etWords);
        tvLabel = (TextView) findViewById(R.id.tvLabel);
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public void onSubmit(View v){
    	//Toast.makeText(this,"Hello World", Toast.LENGTH_SHORT).show();
    	String fieldValue = etWords.getText().toString();
    	Toast.makeText(this, fieldValue, Toast.LENGTH_SHORT).show();
    	tvLabel.setText(fieldValue);
    }
}
