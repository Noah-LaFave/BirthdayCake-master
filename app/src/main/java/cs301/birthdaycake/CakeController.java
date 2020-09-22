package cs301.birthdaycake;

import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceView;
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

       switch(view.getId()){

           case R.id.blowout:
               Log.i("button", "hello from onClick");
               this.model1.lit = false;
               this.cView.invalidate();

               break;




       }



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
    public boolean onTouch(View view, MotionEvent motionEvent) {

        Log.d("ontocuh", "hello from ontouch");
        model1.touchX = (int) motionEvent.getX();
        model1.touchY = (int) motionEvent.getY();
        model1.B_touch = true;
        cView.invalidate();


        return true;
    }
}
