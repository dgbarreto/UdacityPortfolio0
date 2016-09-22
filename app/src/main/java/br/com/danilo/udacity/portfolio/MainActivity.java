package br.com.danilo.udacity.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btPopularMovies;
    Button btStockHawk;
    Button btBuildItBigger;
    Button btMakeYoutAppMaterial;
    Button btGoUbiquitous;
    Button btCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btPopularMovies = (Button) findViewById(R.id.btPopularMovies);
        btStockHawk = (Button) findViewById(R.id.btStockHawk);
        btBuildItBigger = (Button) findViewById(R.id.btBuildItBigger);
        btMakeYoutAppMaterial = (Button) findViewById(R.id.btMakeYoutAppMaterial);
        btGoUbiquitous = (Button) findViewById(R.id.btGoUbiquitous);
        btCapstone = (Button) findViewById(R.id.btCapstone);
    }

    public void clickMessage(View v){
        CharSequence message = "";
        switch (v.getId()){
            case R.id.btPopularMovies:
                message = "This button is going to launch my Popular Movies App!";
                break;
            case R.id.btStockHawk:
                message = "This button is going to launch my Stock Hawk App!";
                break;
            case R.id.btBuildItBigger:
                message = "This button is going to launch my Build It Bigger App!";
                break;
            case R.id.btMakeYoutAppMaterial:
                message = "This button is going to launch my Make Your App Material App!";
                break;
            case R.id.btGoUbiquitous:
                message = "This button is going to launch my Go Ubiquitous App!";
                break;
            case R.id.btCapstone:
                message = "This button is going to launch my Capston App!";
                break;
        }

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
