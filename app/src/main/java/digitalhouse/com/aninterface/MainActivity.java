package digitalhouse.com.aninterface;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    android.support.v4.app.FragmentManager fgm = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.b1);
        TextView edit1 = (TextView) findViewById(R.id.edit1);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Fragment1 frag1 = new Fragment1();
        ft.add(R.id.frame1,frag1);
        ft.commit();



    }
}
