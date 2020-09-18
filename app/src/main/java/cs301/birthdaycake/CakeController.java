package cs301.birthdaycake;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener {

    public CakeModel model1;
    public CakeView cView;
    public CakeController(CakeView view){
       this.cView = view;

       model1 = view.getCakeModel();

   }


    @Override
    public void onClick(View view) {
        Log.i("button", "hello from onClick");
        this.model1.lit = false;
        this.cView.invalidate();


    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        model1.hasCandles = b;
        cView.invalidate();

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        model1.numCandles = i;
        cView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        model1.touchX = (int) event.getX();
        model1.touchY = (int) event.getY();
        cView.invalidate();
        return false;
    }
}
