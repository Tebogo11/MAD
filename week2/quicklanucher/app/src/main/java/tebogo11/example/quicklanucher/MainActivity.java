package tebogo11.example.quicklanucher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //attempt to lanuch a activity within the app
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secondActivity = (Button)findViewById(R.id.SecondActivityBtn);
        secondActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SecondActvity.class);
                startIntent.putExtra("tebogo11.example.quicklanucher.SOMETHING", "HelloWorld");
                startActivity(startIntent);
            }
        });
        //lanuch outside the app
        Button googlebtn = (Button) findViewById(R.id.GoogleBtn);
        googlebtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String google = "http//www.yahoo.com";
                Uri webaddress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotoGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoGoogle);

                }
            }
        });

}}
