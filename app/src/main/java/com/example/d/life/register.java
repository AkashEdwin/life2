package com.example.d.life;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class register extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        this.getWindow().setSoftInputMode( WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);


        Spinner s= (Spinner) findViewById(R.id.spinner);


            s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    final Toast toastobject = Toast.makeText(register.this, parent.getSelectedItem().toString(), Toast.LENGTH_SHORT);
                    toastobject.show();

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.female:
                if (checked)
                    break;
            case R.id.male:
                if (checked)
                    break;
        }
    }

    public void buttonOnClick(View b) {
        Button button = (Button) b;
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
        Toast.makeText( register.this, "Registered \nPlease Login", Toast.LENGTH_SHORT).show();
    }
  }

