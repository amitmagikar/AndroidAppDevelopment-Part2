package com.example.amitmagikar.checkboxesandradiobuttons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CheckBoxesAndRadioButtons extends AppCompatActivity {

    private CheckBox check1, check2, check3;
    private RadioButton radio1, radio2, radio3;
    private RadioGroup radioGroup;
    private Button button, rateAppButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_boxes_and_radio_buttons);

        check1 = (CheckBox) findViewById(R.id.checkBox1);
        check2 = (CheckBox) findViewById(R.id.checkBox2);
        check3 = (CheckBox) findViewById(R.id.checkBox3);

        radio1 = (RadioButton) findViewById(R.id.radioButton1);
        radio2 = (RadioButton) findViewById(R.id.radioButton2);
        radio3 = (RadioButton) findViewById(R.id.radioButton3);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        button = (Button) findViewById(R.id.button);
        rateAppButton = (Button) findViewById(R.id.rateAppButton);

        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer check1Result = new StringBuffer();
                if(check1.isChecked()) {
                    check1Result.append("Audi: Selected");
                    Toast.makeText(CheckBoxesAndRadioButtons.this, check1Result.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer check2Result = new StringBuffer();
                if(check2.isChecked()) {
                    check2Result.append("BMW: Selected");
                    Toast.makeText(CheckBoxesAndRadioButtons.this, check2Result.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        check3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer check3Result = new StringBuffer();
                if(check3.isChecked()) {
                    check3Result.append("Ferrari: Selected");
                    Toast.makeText(CheckBoxesAndRadioButtons.this, check3Result.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        radio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer radio1Result = new StringBuffer();
                if(radio1.isChecked()) {
                    radio1Result.append("White: Selected");
                    Toast.makeText(CheckBoxesAndRadioButtons.this, radio1Result.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        radio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer radio2Result = new StringBuffer();
                if(radio2.isChecked()) {
                    radio2Result.append("Black: Selected");
                    Toast.makeText(CheckBoxesAndRadioButtons.this, radio2Result.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        radio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer radio3Result = new StringBuffer();
                if(radio3.isChecked()) {
                    radio3Result.append("Blue: Selected");
                    Toast.makeText(CheckBoxesAndRadioButtons.this, radio3Result.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();

                if(check1.isChecked())
                    result.append("Audi: Selected\n");

                if(check2.isChecked())
                    result.append("BMW: Selected\n");

                if(check3.isChecked())
                    result.append("Ferrari: Selected\n");

                int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();

                if(radio1.getId() == selectedRadioButtonId)
                    result.append("White: Selected");

                if(radio2.getId() == selectedRadioButtonId)
                    result.append("Black: Selected ");

                if(radio3.getId() == selectedRadioButtonId)
                    result.append("Blue: Selected ");

                Toast.makeText(CheckBoxesAndRadioButtons.this, result.toString(), Toast.LENGTH_LONG).show();

            }
        });

        rateAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CheckBoxesAndRadioButtons.this, RatingBarActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
