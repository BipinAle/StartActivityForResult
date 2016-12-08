package bpn.startactivityforresult;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void click(View view) {

        Intent returnIntent = new Intent();
        returnIntent.putExtra("result","result");
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
}
