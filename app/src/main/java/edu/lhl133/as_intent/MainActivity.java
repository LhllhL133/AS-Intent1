package edu.lhl133.as_intent;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TabHost host=getTabHost();
        host.addTab(host.newTabSpec("tab1").setIndicator("tab1")
        .setContent(new Intent(MainActivity.this,Main2Activity.class)));
        host.addTab(host.newTabSpec("tab2").setIndicator("tab2")
                .setContent(new Intent(MainActivity.this,Main3Activity.class)));
    }
}
