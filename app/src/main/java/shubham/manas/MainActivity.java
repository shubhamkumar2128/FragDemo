package shubham.manas;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements One.BridgeFragone{

    FragmentManager fragmentManager;
    One one;
    Two two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=new One();
        two=new Two();
        fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container1,one);
        fragmentTransaction.add(R.id.container2,two);
        fragmentTransaction.commit();

    }


    @Override
    public void data(int args) {
        two.setText(args);
    }
}
