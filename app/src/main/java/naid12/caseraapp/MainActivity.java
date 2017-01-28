package naid12.caseraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  EditText LoginName;
  CheckBox chBoxStayLogged;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      LoginName = (EditText) findViewById(R.id.LoginName);
    }

  public void btnLoginOnClick(View v) {
    Log.i("Click", "Button was cliced");
    Log.i("Click", LoginName.getText().toString());
    Toast.makeText(this, "Welcome to Caasera, you have succesfuly Logged in." +
        LoginName.getText().toString(), Toast.LENGTH_LONG).show(); // + " " +
    // chBoxStayLoggedin.getText().toString(), Toast.LENGTH_LONG).show();
  }
    /*public void btnLoginOnClick(  View v) {
        Log.i("Click", "Button wes clicked!");

        Toast.makeText(this, "Welcome to Caasera, We have succesfuly Logged in." +
            LoginName.getText().toString() + " " +
            chBoxStayLoggedin.getText().toString(), Toast.LENGTH_LONG).show();
    }*/
}
