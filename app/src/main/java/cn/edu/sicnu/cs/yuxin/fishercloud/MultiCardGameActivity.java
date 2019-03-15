package cn.edu.sicnu.cs.yuxin.fishercloud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MultiCardGameActivity extends AppCompatActivity {

//    GestureDetector gestureDetector = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_card_game);

//        gestureDetector = new GestureDetector(this, new OnMyGestureListener() {
//            @Override
//            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
//                if (e2.getX() - e1.getX() > FLIP_DISTANCE) {
//                    onBackPressed();
//                    return true;
//                }
//                return false;
//            }
//        });
    }

    public void multiCardOnClick(View view) {
        //Log.d("Multi", view.toString());
        switch (view.getId()) {
            case R.id.multiCardResetButton:
                Toast.makeText(this, "ResetButtonTest", Toast.LENGTH_SHORT).show();
                break;
        }
    }

//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        return gestureDetector.onTouchEvent(event);
//    }
}
