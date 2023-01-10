package com.example.hospitalsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectRegistrationActivity extends AppCompatActivity {
private TextView back;
private Button doctorReg, patientReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_registration);

        back= findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(SelectRegistrationActivity.this,LoginActivity.class);
                startActivity(intent);
        });

        patientReg= findViewById(R.id.patientReg);
        doctorReg= findViewById(R.id.doctor);

        patientReg.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                    Intent intent = new Intent(SelectRegistrationActivity.this, patientRegsationActivity.class);
                    startActivity(intent);
                }

                }
        });

        doctorReg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(SelectRegistrationActivity.this, doctorRegistrationActivity.class);
                startActivity(intent);
            }

        }
    });

        }


    private TextView ragPageQuestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ragPageQuestion = findViewById(R.id.ragPageQuestion);
        ragPageQuestion.setOnclickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(DoctorRegistrationActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}