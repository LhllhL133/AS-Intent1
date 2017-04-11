package edu.lhl133.as_intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    EditText edit;
    String url;
    Button login;
    Intent intent=new Intent();
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().hide();
        edit=(EditText)findViewById(R.id.editText2);
        login=(Button)findViewById(R.id.button2);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url=edit.getText().toString();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://"+url));
                startActivity(intent);
            }
        });
    }
}
