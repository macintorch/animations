package ainor.com.my.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade (View view) {
        ImageView nexus = (ImageView) findViewById(R.id.nexus);
        ImageView nexus1hand = (ImageView) findViewById(R.id.nexushand);

        nexus.animate().alpha(0f).setDuration(2000);
        nexus1hand.animate().alpha(1f).setDuration(2000);
        nexus1hand.bringToFront();
    }

    public void fadeagain (View view) {
        ImageView nexus = (ImageView) findViewById(R.id.nexus);
        ImageView nexushand1 = (ImageView) findViewById(R.id.nexushand);

        nexushand1.animate().alpha(1f).setDuration(2000);
        nexus.animate().alpha(0f).setDuration(2000);
        nexushand1.bringToFront();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
