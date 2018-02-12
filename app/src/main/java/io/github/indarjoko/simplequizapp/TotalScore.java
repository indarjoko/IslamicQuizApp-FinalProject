package io.github.indarjoko.simplequizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Donny on 10/02/2018.
 */

public class TotalScore extends Activity {

    @Override

    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score_total_activity);

        TextView hasil = (TextView)findViewById(R.id.hasil);
        TextView total = (TextView)findViewById(R.id.total);

        hasil.setText("Jawaban yang Benar: "+MainActivity.benar+"\nJawaban Salah: "+MainActivity.salah);
        total.setText(""+MainActivity.hasil);
    }

    public void coba (View view){
        finish();
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }

}
