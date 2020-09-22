package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView GUIview = findViewById(R.id.cakeview);
        CakeController GUIController = new CakeController(GUIview);

            Button BlowOut = findViewById(R.id.blowout);
            BlowOut.setOnClickListener(GUIController);

            CompoundButton CandlesOn = findViewById(R.id.candle_Sw);
            CandlesOn.setOnCheckedChangeListener(GUIController);

        SeekBar numCandles = findViewById(R.id.seekCandles);
            numCandles.setOnSeekBarChangeListener(GUIController);

        SurfaceView Balloon = findViewById(R.id.cakeview);
        Balloon.setOnTouchListener(GUIController);

            GUIview.setOnTouchListener(GUIController);
    }




    public void goodbye(View button) {
        Log.i("button", "Goodbye");
    }

}
