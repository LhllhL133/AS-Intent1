package edu.lhl133.as_intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText edit;
    Button login;
    Intent intent;
    String info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();
        edit=(EditText)findViewById(R.id.editText);
        login=(Button)findViewById(R.id.button);

        intent=new Intent();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info=edit.getText().toString();
                intent.setData(Uri.parse("http://"+info));
               // intent.setAction(Intent.ACTION_VIEW);
                startActivity(intent);
            }
        });
    }
}
