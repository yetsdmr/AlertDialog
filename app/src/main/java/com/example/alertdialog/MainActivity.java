package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
    }

    private void tanimla() {
        button = findViewById(R.id.dialogAc);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogAc();
            }
        });
    }
    private void dialogAc(){
        LayoutInflater inflater = this.getLayoutInflater();
        View view = inflater.inflate(R.layout.alert_layout,null,false);

       final EditText mailEditText = view.findViewById(R.id.mailAdres);
       final EditText kAdiEditText = view.findViewById(R.id.kullanici);
       final EditText kSifreEditText = view.findViewById(R.id.sifre);
        Button btn = view.findViewById(R.id.btn);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setView(view);
        alert.setCancelable(false);
        final AlertDialog dialog = alert.create();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, mailEditText.getText().toString() +" "+ kAdiEditText.getText().toString()  + " " +
                        kSifreEditText.getText().toString(), Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });
        dialog.show();
    }

}