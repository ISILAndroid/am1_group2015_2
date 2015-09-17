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

	private TextView txtfecnac;
	private EditText eteName,eteLastname,etePassword,eteEmail,eteUsername;
    private Spinner spLocation;
    private RadioGroup rbGenero;
    private CheckBox chkNotification;

    private Button btnSignUp;

    private String localidad=null;
    private int genero=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_formulario);
		app();
	}

	private void app() {
		// TODO Auto-generated method stub
		txtfecnac =(TextView)findViewById(R.id.lblfecnac);
        eteName =(EditText)findViewById(R.id.eteName);
        eteLastname =(EditText)findViewById(R.id.eteLastname);
        etePassword =(EditText)findViewById(R.id.etePassword);
        eteEmail =(EditText)findViewById(R.id.eteEmail);
        eteUsername =(EditText)findViewById(R.id.eteUsername);

        spLocation =(Spinner)findViewById(R.id.spLocation);
        rbGenero =(RadioGroup)findViewById(R.id.rbGenero);
        chkNotification =(CheckBox)findViewById(R.id.chkNotification);

        btnSignUp =(Button)findViewById(R.id.btnSignUp);

        txtfecnac.setTag(null);
		events();
	}

	private void events() {
		// TODO Auto-generated method stub
		txtfecnac.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog(100);
			}
		});

        btnSignUp.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validateForm())
                {

                }else
                {
                    Toast.makeText(FormularioActivity.this, "Revisar campos",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        rbGenero.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case R.id.rbM:
                        genero = 1;
                        break;
                    case R.id.rbF:
                        genero = 2;
                        break;
                }
            }
        });

        spLocation.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Log.v("CONSOLE", "spLocation" + adapterView.getAdapter().getItem(i));
                localidad = adapterView.getAdapter().getItem(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
	}

    private boolean validateForm()
    {
        String name= eteName.getText().toString().trim();
        String lastName= eteLastname.getText().toString().trim();
        String usernmame= eteUsername.getText().toString().trim();
        String email= eteEmail.getText().toString().trim();
        String password= etePassword.getText().toString().trim();

        if(name.isEmpty())return false;
        if(lastName.isEmpty())return false;
        if(usernmame.isEmpty())return false;
        if(email.isEmpty())return false;
        if(password.isEmpty())return false;

        //fecha nacimiento
        Object fnac= txtfecnac.getTag();
        if(fnac==null) return false;

        //localidad
        if(localidad==null) return false;

        //genero
        Log.v("CONSOLE", "genero " + genero);
        if(genero==0)return false;

        //notification
        boolean notification= chkNotification.isChecked();
        if(!notification)return  false;

        return true;
    }

    private boolean validateFormError()
    {
        String name= eteName.getText().toString().trim();
        String lastName= eteLastname.getText().toString().trim();
        String usernmame= eteUsername.getText().toString().trim();
        String email= eteEmail.getText().toString().trim();
        String password= etePassword.getText().toString().trim();

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
        if(usernmame.isEmpty())
        {
            eteUsername.setError("Campo inválido");
            return false;
        }
        if(email.isEmpty())return false;
        if(password.isEmpty())return false;

        //fecha nacimiento
        Object fnac= txtfecnac.getTag();
        if(fnac==null) return false;

        //localidad
        if(localidad==null) return false;

        //genero
        Log.v("CONSOLE", "genero " + genero);
        if(genero==0)return false;

        //notification
        boolean notification= chkNotification.isChecked();
        if(!notification)return  false;

        return true;
    }

	
	@Override
	@Deprecated
	protected Dialog onCreateDialog(int id) {
		// TODO Auto-generated method stub
		switch (id) {
		case 100:
				final Calendar c=Calendar.getInstance();
				int year=c.get(Calendar.YEAR);
				int month=c.get(Calendar.MONTH);
				int day=c.get(Calendar.DAY_OF_MONTH);
				
				return new DatePickerDialog(this, new OnDateSetListener() {
					
					@Override
					public void onDateSet(DatePicker view, int year, int monthOfYear,
							int dayOfMonth) {
						// TODO Auto-generated method stub
						String s= dayOfMonth+"/"+(monthOfYear+1)+"/"+year;
                        Log.v("CONSOLE", "s "+s);
						txtfecnac.setText(s);
                        txtfecnac.setTag(1);
						
						
					}
				}, year, month, day);

		default:
			break;
		}
		return null;
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		return false;
	}

}
