package tebogo11.example.reportproblem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Reportprobem extends AppCompatActivity implements OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.btn1);
        b.setOnClickListener(this);
        Button b2 = (Button) findViewById(R.id.btn2);
        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText) findViewById(R.id.et1);
                TextView tv = (TextView) findViewById(R.id.tv1);
                et.setText("");
                tv.setText("");
            }
        });
    }

    public void onClick(View view) {
        EditText et = (EditText) findViewById(R.id.et1);
        TextView tv = (TextView) findViewById(R.id.tv1);
        String rptedPro = et.getText().toString();
        tv.setText(rptedPro);

    }

}
