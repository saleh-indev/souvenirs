package com.vacance.souvenirs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    EditText name, user1, pass, cnfrmpass;
    Button signin;
    ImageView rback;
    Cursor cursor;
    CheckBox rshow;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = (EditText) findViewById(R.id.name);
        pass = (EditText) findViewById(R.id.password);
        cnfrmpass = (EditText) findViewById(R.id.cnfrmpassword);
        user1 = (EditText) findViewById(R.id.user);
        rshow = (CheckBox) findViewById(R.id.rshowPass);
        rshow.setChecked(false);
        signin = (Button) findViewById(R.id.signin);
        rback = (ImageView) findViewById(R.id.rback);


        rback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SignUp.this, MainActivity.class);
                startActivity(intent);
                finish();


            }
        });
    }

    public void signinBtn(View view) {
        String email,password;
        email = String.valueOf(name.getText());
        password = String.valueOf(pass.getText());


        if(name.getText().toString().equals("")||
                user1.getText().toString().equals("")||
                pass.getText().toString().equals("")||cnfrmpass.getText().toString().equals(""))
        {
            Toast.makeText(getApplicationContext(), "Remplir vos infos !", Toast.LENGTH_LONG).show();
            return;
        }

        // check if both password matches
        if(!pass.getText().toString().equals(cnfrmpass.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Mots de passe non conformes !", Toast.LENGTH_LONG).show();
        }
        else {
                //Creation de compte
            Toast.makeText(getApplicationContext(), "Utilisateur crée avec succès !", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(SignUp.this, MainActivity.class);
            startActivity(intent);
            finish();

        }

    }

    public void showPass(View v){
        if(rshow.isChecked()) {
            pass.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            cnfrmpass.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        } else {
            pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            cnfrmpass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }
    }
}