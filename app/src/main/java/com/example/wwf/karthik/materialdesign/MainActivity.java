package com.example.wwf.karthik.materialdesign;

import android.content.Intent;
import android.support.design.button.MaterialButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

   @BindView(R.id.SignIn)
   MaterialButton  SignIn;

  @BindView(R.id.userName)
   TextInputEditText userName;

   @BindView(R.id.userPassword)
   TextInputEditText userPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }


    @OnClick(R.id.SignIn)
    public void clickSignIn(View view){
        if (userName.getText().toString().equals("1234") && userPwd.getText().toString().equals("1234")){

          Toast.makeText(this,"Sucessfully Login",Toast.LENGTH_LONG).show();



          Intent intent = new Intent(this,ProductActivity.class);
            startActivity(intent);

        }else {
            Toast.makeText(this," Login Falied",Toast.LENGTH_LONG).show();
            Snackbar.make(view,"This is a Snack Bar",Snackbar.LENGTH_LONG).show();
            new AlertDialog.Builder(this).setTitle("This IS A Material")
                    .setMessage("Pls check your Pass Word Or UserName")
                    .setPositiveButton("OK",null)
                    .setNegativeButton("Cancel",null)
                    .show();
        }
    }
}
