package ainor.com.my.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade (View view) {
        ImageView nexus = (ImageView) findViewById(R.id.nexus);


        nexus.animate().rotation(180f).setDuration(2000);


//        ImageView nexus1hand = (ImageView) findViewById(R.id.nexushand);
//        nexus1hand.animate().alpha(1f).setDuration(2000);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        ImageView nexus = (ImageView) findViewById(R.id.nexus);
        nexus.setTranslationX(-1000f);
        */
    }
}
