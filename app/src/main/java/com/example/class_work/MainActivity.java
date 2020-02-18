package com.example.class_work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  public static String web="http://www.gmail.com";
    public static String fb="http://www.facebook.com";
    Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=findViewById(R.id.btnplay1);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,act_one.class);
                startActivity(intent);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu){
      getMenuInflater().inflate(R.menu.elija,menu);
      return true;


    }
    public boolean onOptionsItemSelected(MenuItem item){
        int work = item.getItemId();
        switch (work) {
            case R.id.mail:
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);

                }
            case R.id.tea:
                Intent b = new Intent(Intent.ACTION_VIEW, Uri.parse(fb));
                if (b.resolveActivity(getPackageManager()) != null) {
                    startActivity(b);
                }
        }
         return super.onOptionsItemSelected(item);
        }
}

