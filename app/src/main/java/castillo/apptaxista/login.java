package castillo.apptaxista;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class login extends ActionBarActivity {
    Button btn;
    EditText et;
    public int nt;
    public String ntx;
    private static Context context;

    public static Context getAppContext()
    {
        return context;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.context = getApplicationContext();
        btn = (Button)findViewById(R.id.buttonEntrar);
        et = (EditText)findViewById(R.id.noTx);



    }

    public void onClickBtnIn(View view)
    {
        String n;
        int logged =0 ;
        n = et.getText().toString();
        if(n==""){
            Toast.makeText(context, "Debe Ingresar su numero de Taxi!", Toast.LENGTH_LONG).show();
        }
        else{

            nt = Integer.parseInt(et.getText().toString());
            logged=1;
            final Intent maIntent = new Intent(this, MainActivity.class);
            maIntent.putExtra("nt",nt);
            maIntent.putExtra("ntx",n);
            maIntent.putExtra("iL",logged);
            startActivity(maIntent);
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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
}
