package com.isil.l06ui;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class FormularioActivity extends Activity {

	private EditText eteName,eteLastname,etePassword,eteCPassword,eteEmail,eteUsername;
    private Button btnRegistro;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_formulario);
		app();
	}

	private void app() {
		// TODO Auto-generated method stub
        eteName =(EditText)findViewById(R.id.eteName);
        eteLastname =(EditText)findViewById(R.id.eteLastname);

        eteEmail =(EditText)findViewById(R.id.eteEmail);
        eteUsername =(EditText)findViewById(R.id.eteUsername);
        etePassword =(EditText)findViewById(R.id.etePassword);
        eteCPassword =(EditText)findViewById(R.id.eteCPassword);

        btnRegistro =(Button)findViewById(R.id.btnRegistro);

		events();
	}

	private void events() {
		// TODO Auto-generated method stub
        btnRegistro.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validateFormError()) {
                    Toast.makeText(FormularioActivity.this, "Enviando al servidor",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(FormularioActivity.this, "Revisar campos",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

	}


    private boolean validateFormError()
    {
        String name= eteName.getText().toString().trim();
        String lastName= eteLastname.getText().toString().trim();
        String usernmame= eteUsername.getText().toString().trim();
        String email= eteEmail.getText().toString().trim();
        String password= etePassword.getText().toString().trim();
        String cpassword= eteCPassword.getText().toString().trim();

        if(name.isEmpty())
        {
            eteName.setError("Campo inválido");
            return false;
        }
        if(lastName.isEmpty())
        {
            eteLastname.setError("Campo inválido");
            return false;
        }
        if(email.isEmpty())
        {
            eteEmail.setError("Email inválido");
            return false;
        }

        if(usernmame.isEmpty())
        {
            eteUsername.setError("Campo inválido");
            return false;
        }

        if(password.isEmpty())
        {
            etePassword.setError("Password inválido");
            return false;
        }
        if(cpassword.isEmpty())
        {
            eteCPassword.setError("Password inválido");
            return false;
        }

        if(!password.equals(cpassword))
        {
            etePassword.setError("Password diferentes");
            eteCPassword.setError("Password diferentes");
        }

        return true;
    }


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		return false;
	}

}
