# am1_group2015_2
Aplicaciones Móviles 1 - Grupo 2015-II

https://github.com/ISILAndroid

Instructor
------------

Eduardo José Medina Alfaro
- Email: isil@qd.pe

### Lesson 11 - Ejemplos para el proyecto.

        * Uso de Application como clase global de la App.

1. Google Maps

    * Ejemplo de como lanzar a Google Maps instalado en el equipo.

        ```
        private void location_isil() {
            // TODO Auto-generated method stub
            Double latitude=-12.073449;
            Double longitude=-76.948551;
            String format = "geo:0,0?q=" + Double.toString(latitude) + "," + Double.toString(longitude) +"?z=8" +
                    "(ISIL La Molina)";
            Uri uri = Uri.parse(format);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);

            Log.v("CONSOLE", "mensaje " + intent);
            if(intent!=null)
            {
                startActivity(intent);
            }
        }
        ```

2. Cámara , Tomar un foto



### Referencia

- [Cámara](http://developer.android.com/training/camera/photobasics.html)


