package edu.itstep.myapp777;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    //private	final	static	String	TAG	= "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(this.isExternalStorageWritable()){
            File esMainDir = Environment.getExternalStorageDirectory();
            Log.d("MainActivity", "Каталог внешнего носителя : " + esMainDir.getAbsolutePath());
        } else Log.d("MainActivity", "Внешний носитель не готов");


    }

    private boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        return (state.equals(Environment.MEDIA_MOUNTED) ||
                state.equals(Environment.MEDIA_MOUNTED_READ_ONLY));
    }

    public boolean isExternalStorageReadable()
    {
        String state = Environment.getExternalStorageState();
        return (state.equals(Environment.MEDIA_MOUNTED) ||
                state.equals(Environment.
                        MEDIA_MOUNTED_READ_ONLY));
    }
}