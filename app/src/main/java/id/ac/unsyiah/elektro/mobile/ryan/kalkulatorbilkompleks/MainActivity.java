package id.ac.unsyiah.elektro.mobile.ryan.kalkulatorbilkompleks;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void onClickTombolgHItung(View view) {
        EditText real1 = (EditText) findViewById(R.id.real1);
        String real1Str = String.valueOf(real1.getText());
        int angkaR1= Integer.valueOf(real1Str);

        EditText real2= (EditText) findViewById(R.id.real2);
        String real2Str = String.valueOf(real2.getText());
        int angkaR2 = Integer.valueOf(real2Str);

        EditText imajiner1 = (EditText) findViewById(R.id.imajiner1);
        String imajiner1Str = String.valueOf(imajiner1.getText());
        int angkaI1= Integer.valueOf(imajiner1Str);

        EditText imajiner2 = (EditText) findViewById(R.id.imajiner2);
        String imajiner2Str = String.valueOf(imajiner2.getText());
        int angkaI2= Integer.valueOf(imajiner2Str);


       int Hasil1,Hasil2;
        Hasil1=angkaI1+angkaI2;
        Hasil2=angkaR1+angkaR2;


        char tanda;

        if(Hasil1<=0){
            tanda='-';
            Hasil1*=-1;
        }
        else {
            tanda='+';
        }
        String hasil1Str = String.valueOf(Hasil1);
        String hasil2Str = String.valueOf(Hasil2);

        TextView lblhasil = (TextView) findViewById(R.id.lblhasil);
        lblhasil.setText(hasil2Str+tanda+"j"+hasil1Str);


    }}
