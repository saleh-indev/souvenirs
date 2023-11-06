package com.vacance.souvenirs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {
    EditText username1, pass;
    Button login;
    TextView regis;
    CheckBox show;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        regis = (TextView) findViewById(R.id.regis);
        username1 = (EditText) findViewById(R.id.luser);
        pass = (EditText) findViewById(R.id.lpass);
        show = (CheckBox) findViewById(R.id.showPass);
        show.setChecked(false);

        login = (Button)findViewById(R.id.login);


        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignUp.class);
                startActivity(intent);
                finish();
            }
        });



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(username1.getText().toString().equals("")|| pass.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Remplir les infos", Toast.LENGTH_LONG).show();

                }else{
                    String email,password;
                    email = username1.getText().toString();
                    password = pass.getText().toString();
                    if(!email.equals("admin") || !password.equals("admin") ){
                        Toast.makeText(getApplicationContext(), "Utilisateur non reconnu !", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Vous êtes connecté(e) !", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(MainActivity.this, AffichageChoixActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });


    }
    public void showPass(View v){
        if(show.isChecked()) {
            pass.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        } else {
            pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }
    }
}
