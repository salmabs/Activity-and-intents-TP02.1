package com.example.exercice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;


public class MainActivity extends AppCompatActivity {
    private static final String TAG=MainActivity.class.getSimpleName();
    private int mCount = 0;
    private TextView mShowCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        Log.d(TAG,"Question 1") ;
        Log.d(TAG,"La deuxième activité est ajoutée en tant que " +
                "classe Java, le fichier de présentation (layout) XML est créé et le fichier" +
                " AndroidManifest.xml est modifié pour déclarer une deuxième activité.") ;

        Log.d(TAG,"Question 2") ;
        Log.d(TAG,"Le bouton Up (Haut) de la barre d'applications n'apparaît" +
                " plus dans la deuxième activité pour renvoyer " +
                "l'utilisateur à l'activité parent.") ;

        Log.d(TAG,"Question 3") ;
        Log.d(TAG,"new Intent(Context context, Class<?> class)") ;

        Log.d(TAG,"Question 4") ;
        Log.d(TAG,"Comme extra d'intention (Intent)") ;

        Log.d(TAG,"Question 5") ;
        Log.d(TAG,"Tout ce qui précède") ;
    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}

