package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.CheckBox;
import android.widget.RadioGroup;

public class Quiz extends AppCompatActivity {
    private Button submitButton;
    private int score;
    private RadioGroup numOneRadionGroup;
    private RadioGroup numTwoRadionGroup;
    private RadioGroup numFiveRadionGroup;

    private EditText editText;
    private CheckBox gangaCheckbox;
    private CheckBox kuntiCheckbox;
    private CheckBox radhaCheckbox;
    private CheckBox satyavatiCheckbox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        submitButton = findViewById(R.id.submit_button);
        editText = findViewById(R.id.edit_text);
        gangaCheckbox = findViewById(R.id.ganga_checkbox);
        radhaCheckbox = findViewById(R.id.radha_checkbox);
        satyavatiCheckbox = findViewById(R.id.satyavati_checkbox);
        kuntiCheckbox = findViewById(R.id.kunti_checkbox);
        numOneRadionGroup = findViewById(R.id.num_one_radio_group);
        numTwoRadionGroup = findViewById(R.id.num_two_radio_group);
        numFiveRadionGroup = findViewById(R.id.num_five_radio_group);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score = 0;

                if(numOneRadionGroup.getCheckedRadioButtonId() == R.id.shantanu_radio){
                    score += 1;
                }

                if(numTwoRadionGroup.getCheckedRadioButtonId() == R.id.dushala_radio){
                    score += 1;
                }

                if(numFiveRadionGroup.getCheckedRadioButtonId() == R.id.ved_vyasa_radio){
                    score += 1;
                }

                String userAnswer = editText.getText().toString();
                if(userAnswer.equalsIgnoreCase("18")){
                    score += 1;
                }

                if(gangaCheckbox.isChecked() && satyavatiCheckbox.isChecked() && !radhaCheckbox.isChecked()
                        && !kuntiCheckbox.isChecked()){
                    score += 1;
                }

                Intent intent = new Intent(Quiz.this, ScoreActivity.class);
                intent.putExtra("SCORE", score+"/5");
                startActivity(intent);

            }
        });


    }
}

