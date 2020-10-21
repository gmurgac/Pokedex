package cl.inacap.ejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button boton;

final String TAG = "ACTIVITY_PRINCIPAL";
@Override
protected void onStart(){
    super.onStart();
    Log.d(TAG,"Se ejecuto onStart");
}
@Override
protected void onRestart(){
    super.onRestart();
    Log.d(TAG,"Se ejecuto onRestart");
}

@Override
protected void onResume(){
    super.onResume();
    Log.d(TAG,"Se ejecuto on resume");
}
@Override
protected void onPause(){
    super.onPause();
    Log.d(TAG,"Se ejecuto onPause");
}
@Override
protected void onStop(){
    super.onStop();
    Log.d(TAG,"Se ejecuto onStop");
    }
@Override
protected void onDestroy(){
    super.onDestroy();
    Log.d(TAG,"Se ejecuto onDestroy");
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"Se ejecuto onCreate");
        setContentView(R.layout.activity_main);
        this.boton = findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,segundo.class);
                startActivity(i);

            }
        });
    }
}