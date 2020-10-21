package cl.inacap.ejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class segundo extends AppCompatActivity {
    final String TAG = "ACTIVITY_SECUNDARIO";
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG,"Se ejecuto onStart");
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
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG,"Se ejecuto onRestart");
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
        setContentView(R.layout.activity_segundo);

    }
}