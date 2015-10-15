# am1_group2015_2
Aplicaciones Móviles 1 - Grupo 2015-II

Examen Parcial

    - Registro de Usuario
    - Maquetación Android

## Acción del botón "Registrar"
```
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
```

## Validación de Formulario
```
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
```

## Maquetación Normal
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/skye_bg">
    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="80dp"
        android:background="@color/blue"
        android:layout_alignParentTop="true"
        android:id="@+id/header"/>
    <LinearLayout
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:layout_below="@+id/header"
        android:padding="10dp"
        android:orientation="vertical">
        <LinearLayout
            android:layout_width="fill_parent"
            android:layout_height="80dp"
            android:orientation="horizontal"
            android:layout_marginBottom="10dp">
            <Button
                android:layout_width="0dp"
                android:layout_weight="0.3"
                android:layout_height="fill_parent"
                android:layout_marginRight="5dp"
                android:background="@color/red"/>
            <Button
                android:layout_width="0dp"
                android:layout_weight="0.7"
                android:layout_height="fill_parent"
                android:background="@color/violet"/>
        </LinearLayout>
        <Button
            android:layout_width="fill_parent"
            android:layout_height="120dp"
            android:background="@color/green"
            android:layout_marginBottom="10dp"/>
        <LinearLayout
            android:layout_width="fill_parent"
            android:layout_height="80dp"
            android:orientation="horizontal">
            <Button
                android:layout_width="0dp"
                android:layout_weight="0.5"
                android:layout_height="fill_parent"
                android:layout_marginRight="5dp"
                android:background="@color/white"/>
            <Button
                android:layout_width="0dp"
                android:layout_weight="0.5"
                android:layout_height="fill_parent"
                android:background="@color/white"/>
        </LinearLayout>
    </LinearLayout>
    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="60dp"
        android:layout_alignParentBottom="true"
        android:layout_margin="10dp"
        android:background="@drawable/around_yellow"/>
</RelativeLayout>
```

## Maquetación con Pesos
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/skye_bg">
    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="80dp"
        android:background="@color/blue"
        android:layout_alignParentTop="true"
        android:id="@+id/header"/>
    <LinearLayout
        android:layout_width="fill_parent"
        android:layout_height="fill_parent"
        android:layout_below="@+id/header"
        android:layout_marginBottom="70dp"
        android:padding="10dp"
        android:orientation="vertical">
        <LinearLayout
            android:layout_width="fill_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:orientation="horizontal"
            android:layout_marginBottom="10dp">
            <Button
                android:layout_width="0dp"
                android:layout_weight="0.3"
                android:layout_height="fill_parent"
                android:layout_marginRight="5dp"
                android:background="@color/red"/>
            <Button
                android:layout_width="0dp"
                android:layout_weight="0.7"
                android:layout_height="fill_parent"
                android:background="@color/violet"/>
        </LinearLayout>
        <Button
            android:layout_width="fill_parent"
            android:layout_height="0dp"
            android:layout_weight="3"
            android:background="@color/green"
            android:layout_marginBottom="10dp"/>
        <LinearLayout
            android:layout_width="fill_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:orientation="horizontal">
            <Button
                android:layout_width="0dp"
                android:layout_weight="0.5"
                android:layout_height="fill_parent"
                android:layout_marginRight="5dp"
                android:background="@color/white"/>
            <Button
                android:layout_width="0dp"
                android:layout_weight="0.5"
                android:layout_height="fill_parent"
                android:background="@color/white"/>
        </LinearLayout>
    </LinearLayout>
    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="60dp"
        android:layout_alignParentBottom="true"
        android:layout_margin="10dp"
        android:background="@drawable/around_yellow"/>
</RelativeLayout>
```