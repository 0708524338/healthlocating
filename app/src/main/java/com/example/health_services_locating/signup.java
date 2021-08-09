package com.example.health_services_locating;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;


public class    signup extends AppCompatActivity {
    Button Account;
    private EditText emailEditText, passwordEditText, confirmPasswordEditText;
    private Button Signup;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        firebaseAuth=FirebaseAuth.getInstance();
        emailEditText =findViewById(R.id.aaa);
        passwordEditText =findViewById(R.id.bbb);
        confirmPasswordEditText =findViewById(R.id.ccc);
        Signup = findViewById(R.id.Account);
        progressDialog=new ProgressDialog(this);
        Account=findViewById(R.id.Account);
        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), com.example.health_services_locating.signin.class);
                startActivity(intent);
            }
        });
    }
    private void Register() {
        String aaa = emailEditText.getText().toString();
        String bbb = passwordEditText.getText().toString();
        String ccc = confirmPasswordEditText.getText().toString();
        if (TextUtils.isEmpty(aaa)) {
            emailEditText.setError("enter your email");
            return;
        } else if (TextUtils.isEmpty(bbb)) {
            emailEditText.setError("enter your password");
            return;
        } else if (TextUtils.isEmpty(ccc)) {
            emailEditText.setError("verify your password");
            return;
        } else if (!bbb.equals(ccc)) {
            confirmPasswordEditText.setError("wrong password");
            return;
        } else if (bbb.length() < 8) {
            passwordEditText.setError("add on password");
            return;
        } else if (!isValidEmail(aaa)){
            emailEditText.setError("enter valid email");
            return;
        }
        progressDialog.setMessage("please wait");
        progressDialog.show();
        progressDialog.setCanceledOnTouchOutside(false);
        firebaseAuth.createUserWithEmailAndPassword(aaa,bbb);
        startActivity(new Intent(this,signin.class));
    }
    private Boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

}