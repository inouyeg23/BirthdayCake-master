package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView cakeViewID = findViewById(R.id.cakeview);
        CakeController newCakeController = new CakeController(cakeViewID);

        /*
        Button blowOut = findViewById(R.id.blowout);
        blowOut.setOnClickListener(newCakeController);

        CompoundButton hasCandles = findViewById(R.id.candles);
        hasCandles.setOnCheckedChangeListener(newCakeController);

        SeekBar candleAmount = findViewById(R.id.numbercandles);
        candleAmount.setOnSeekBarChangeListener(newCakeController);
        */
    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
    }
}
