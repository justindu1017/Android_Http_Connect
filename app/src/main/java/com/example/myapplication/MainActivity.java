package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Load load = new Load();
        load.execute();

    }

    class Load extends AsyncTask<String , String, String>{

        @Override
        protected String doInBackground(String... strings) {
            try {
                URL url = new URL("http://10.0.2.2/index.php");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("POST");
//                connection.connect();
                System.out.println("code is "+connection.getResponseCode());
                System.out.println("OKKKKK");
//                connection.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return  null;
        }
    }

    }
