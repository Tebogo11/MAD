package tebogo11.example.quicklanucher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_actvity);

        if (getIntent().hasExtra("tebogo11.example.quicklanucher.SOMETHING")) {
            {
                TextView tv = (TextView) findViewById(R.id.textView);
                String text = getIntent().getExtras().getString("tebogo11.example.quicklanucher.SOMETHING");
                        tv.setText(text);
            }
        }
    }
}
