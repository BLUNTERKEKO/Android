package com.example.androidtestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;

public class SplashActivity extends AppCompatActivity {

    public static ArrayList<ModelClass> listofQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        listofQ=new ArrayList<>();
        listofQ.add(new ModelClass("¿Cuál de los siguientes valores ajusta el ancho al contenido del objeto?", "match_parent", "fill_parent", "wrap_content", "wrap_parent", "wrap_content"));
        listofQ.add(new ModelClass("¿Qué método evita que se pierda el trabajo que se tiene en curso?", "onSaveInstanceState()", "setContentView(", "setSaveInstanceState()", "setSaveStateInstance()", "onSaveInstanceState()"));
        listofQ.add(new ModelClass("¿Cuál es la superclase de la que suelen extender las actividades desde API 15?", "AppCompatActivity", "Activity", "ActionBarActivity", "Cualquiera de las anteriore", "AppCompatActivity"));
        listofQ.add(new ModelClass("¿Cuál es la forma correcta de usar el comando setTextColor?", "miTexto.setTextColor(0xffff0000)", "miTexto.setTextColor(Color.parseColor(#ff0000))", "miTexto.setTextColor(Color.argb(255, 255, 0, 0))", "Todas las respuestas anteriores son correctas", "Todas las respuestas anteriores son correctas"));
        listofQ.add(new ModelClass(" ¿Cuál de estos puede ser el escuchador de un botón?", "setOnClickListener", "setOnListenerClick", "setClickOnListener", "setListenerOnClick", "setOnClickListener"));
        listofQ.add(new ModelClass("¿A cuál de los siguientes se asemeja el tipo de posicionamiento de ConstraintLayout?", "AbsoluteLayout", "LinearLayout", "FrameLayout", "RelativeLayout", "RelativeLayout"));
        listofQ.add(new ModelClass("¿Que utilidad tiene el código setContentView(R.layout.activity_actividad)?", "Lanza la aplicaciónactivity_actividad", "Aplica una vista java a la actividad", "Aplica una vista XML a la actividad", "Añade un fichero de almacenamiento para conservar estados", "Aplica una vista java a la actividad"));
        listofQ.add(new ModelClass("¿Cuál es la diferencia entre tema y estilo?", "Un tema hace referencia a la vista y el estilo a la actividad", "Un tema hace referencia a la actividad y el estilo a la vista", "Son el mismo concepto", "EL tema se utiliza en Java y el estilo en XML", "Son el mismo concepto"));
        listofQ.add(new ModelClass("¿Cuál es la manera correcta de construir un identificador en la vista?", "@+id/identificador", "id+@/identificador", "@/id+identificador", "/@+id/identificador", "@+id/identificador"));
        listofQ.add(new ModelClass("¿Cómo se denomina la pila de Android y de qué tipo es?", "Full Stack y de tipo FIFO", "Full Stack y de tipo LIFO", "Back Stack y de tipo FIFO", "Back Stack y de tipo LIFO", "Back Stack y de tipo LIFO"));
        listofQ.add(new ModelClass("¿Cuál es la funcionalidad de la clase R?", "Almacenar los recursos", "Crea las vistas de la aplicación", "Enlaza recursos mediante un conjunto de variables estáticas", "Contiene librerías claves de Android", "Enlaza recursos mediante un conjunto de variables estáticas"));
        listofQ.add(new ModelClass("¿Cómo se suelen diseñar las vistas en una aplicación Android?", "En un fichero con código HTML", "En un fichero con código Java", "En un fichero con código XML", "En un fichero con código C#", "En un fichero con código XML"));
        listofQ.add(new ModelClass("¿Cuál de los siguientes no es un componente de Android?", "Activity", "Fragment", "Service", "Content Provider", "Fragment"));
        listofQ.add(new ModelClass("¿Cuál de las siguientes no es una capa de la arquitectura de Android?", "Capa de abstracción de hardware (HAL)", "Runtime", "Kernel de Linux", "Media Services", "Media Services"));
        listofQ.add(new ModelClass("¿Que Layout ubica los objetos en relación con los otros?", "AbsoluteLayout", "LinearLayout", "FrameLayout", "RelativeLayout", "RelativeLayout"));
        listofQ.add(new ModelClass("¿Cuál de los siguientes métodos no se asocia al ciclo de vida de una actividad?", "onCreate()", "onResume()", "onStopped()", "onDestroy()", "onStopped()"));
        listofQ.add(new ModelClass("¿Cómo se accede a un recurso desde XML?", "Escribiendo la palabra Android y el nombre del recurso", "Escribiendo la palabra Android y la dirección del archivo donde este se encuentra", "Escribiendo la palabra Android y la dirección del archivo donde este se encuentra", "Escribiendo el nombre del recurso y la dirección del archivo donde este se encuentra", "Escribiendo la palabra Android y el nombre del recurso"));
        listofQ.add(new ModelClass("¿Cómo se denomina la forma que permite ver un ConstraintLayout en vista diseño?", "DesignView", "Pictureprint", "Blueprint", "EditView", "Blueprint"));
        listofQ.add(new ModelClass("¿Qué atributo colorea el fondo del Layout?", "android:background", "android:color", "android:tint", "android:foreground", "android:background"));
        listofQ.add(new ModelClass("¿Cuál es la manera correcta de construir un identificador en la vista?", "@+id/identificador", "id+@/identificador", "@/id+identificador", "/@+id/identificador", "@+id/identificador"));
        listofQ.add(new ModelClass("¿Qué atributo es específico del LinearLayout?", "android:orientation", "android:padding", "android:useDefaultMargins", "android:layout_span", "android:orientation"));
        listofQ.add(new ModelClass("¿Qué comando nos permite añadir nuevo texto al ya existente en un objeto TextView?", "more", "add", "append", "put", "append"));
        listofQ.add(new ModelClass("¿Cuál de los siguientes métodos no se incluye en el ciclo de vida visible de una actividad?", " onStart()", "onResume()", "onPause()", "onDestroy()", "onDestroy()"));
        listofQ.add(new ModelClass("¿Que Layout indica las coordenadas absolutas de pantalla de ubicación de los objetos?", "AbsoluteLayout", "LinearLayout", "FrameLayout", "RelativeLayout", "AbsoluteLayout"));
        listofQ.add(new ModelClass("¿Dónde suelen definirse los estilos?", "res/layout/styles.xml", "res/layout/vaues.xml", "res/values/styles.xml", "res/styles/values.xml", "res/values/styles.xml"));
        listofQ.add(new ModelClass("Con respecto al salvado de instancias, es falso que", "Se utiliza onSaveInstanceState()", "Se almacena en un Bundle", "Se gestiona mediante métodos como putString() y putInt()", "Se inhabilita automáticamente", "Se inhabilita automáticamente"));
        listofQ.add(new ModelClass("¿Qué tipo de Layout superpone las vistas que contiene?", "AbsoluteLayout", "LinearLayout", "FrameLayout", "GridLayout", "FrameLayout"));
        listofQ.add(new ModelClass("¿Cuándo es aconsejable modificar la clase R?", "Nunca", "Al añadir un recurso", "Antes de empaquetar la aplicación", "Cuando el sistema lo solicite", "Nunca"));
        listofQ.add(new ModelClass("Con respecto a Android Studio, es falso que...", "Fue presentado en 2015", "Reemplazó a Eclipse como IDE oficial", "Se basa en IntelliJ IDEA de JetBrains", "Es de licencia gratuita", "Fue presentado en 2015"));
        listofQ.add(new ModelClass("¿Cómo se denominan los Intent que nombra el componente que se pretende ejecutar?", "Intent explícitos", "Intent implícitos", "PendingIntent", "IntentforResult", "Intent explícitos"));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(SplashActivity.this,DashboardActivity.class);
                startActivity(intent);
            }
        },1500);
    }
}
