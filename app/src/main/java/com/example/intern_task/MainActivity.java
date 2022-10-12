package com.example.intern_task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sign_in(View view) {
        // CHECK FOR MOBILE NUMBER
        Integer mobile_check = 0;
        final String regexStr = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
        final EditText chmobno2 = (EditText)findViewById(R.id.main_email);
        String mb=chmobno2.getText().toString();
        System.out.println("helloji"+mb.length());
        if( mb.matches(regexStr)){
            mobile_check = 1;
        }
        else{
            chmobno2.setError("invalid");
        }

        
    }
    public void sign_up(View view) {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }
}
