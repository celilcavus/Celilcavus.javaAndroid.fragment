package celilcavus.javaandroid.javafragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void GotoFirst(View view)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        firstFragment firstFragment = new firstFragment();
        //fragmentTransaction.add(R.id.frameLayout,firstFragment).commit();
        fragmentTransaction.replace(R.id.frameLayout,new firstFragment()).commit();
    }
    public void Gotosecond(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

      //  fragmentTransaction.add(R.id.frameLayout,new secondFragment()).commit();
        fragmentTransaction.replace(R.id.frameLayout,new secondFragment()).commit();
    }
}