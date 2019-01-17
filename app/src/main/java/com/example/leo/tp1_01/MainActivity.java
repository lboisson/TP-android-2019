package com.example.leo.tp1_01;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void lancerAlerte(View v){

        EditText inputNom = (EditText)findViewById(R.id.inputNom);
        EditText inputPrenom = (EditText)findViewById(R.id.inputPrenom);
        String s = "";
        s = inputNom.getText().toString() + " " + inputPrenom.getText().toString();
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Coucou");
        alertDialog.setMessage(s);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }
}
