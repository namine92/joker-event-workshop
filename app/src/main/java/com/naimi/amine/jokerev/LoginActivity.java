package com.naimi.amine.jokerev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    public Button connexionButton;
    private EditText userNameEdit, passwordEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        connexionButton = (Button) findViewById(R.id.btn_connexion);
        userNameEdit = (EditText) findViewById(R.id.user_name_edit);
        passwordEdit = (EditText) findViewById(R.id.password_edit);


        connexionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = userNameEdit.getText().toString();
                String passWord = passwordEdit.getText().toString();
                //validate our form
                validateForm(userName, passWord);

            }
        });

    }


    void validateForm(String userName, String password) {
        if (!validateEdit(userName))
            userNameEdit.setError("login invalide");
        if (!validateEdit(password))
            passwordEdit.setError("mot de passe invalide invalide");

        if (validateEdit(userName) && validateEdit(password)) {
            // create an intent to navigate from the login activity to the main activity
            Intent myIntent = new Intent(this, MainActivity.class);
            myIntent.putExtra("userName", userName);
            // start the Activity
            startActivity(myIntent);

        }

    }


    boolean validateEdit(String content) {

        return content.length() > 6;

    }


}
