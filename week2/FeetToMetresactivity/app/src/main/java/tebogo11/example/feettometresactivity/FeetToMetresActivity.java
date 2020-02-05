package tebogo11.example.feettometresactivity;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FeetToMetresActivity extends AppCompatActivity implements View.OnClickListener {
        /**Called when the activity is first created */
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button b = (Button)findViewById(R.id.btn1);
            b.setOnClickListener(this);
        }

        @Override
    public void onClick(View view) {
            TextView tv = (TextView)findViewById(R.id.tv1);
            EditText et = (EditText)findViewById(R.id.et1);
            double feet = Double.parseDouble(et.getText().toString());
            double metres = feet*0.305;
            tv.setText("In metres that is : " + metres);

    }
}
