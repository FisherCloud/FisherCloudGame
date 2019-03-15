package cn.edu.sicnu.cs.yuxin.fishercloud;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class CardGameActivity extends AppCompatActivity {

    GestureDetector gestureDetector = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_game);

        gestureDetector = new GestureDetector(this, new OnMyGestureListener() {
            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                if (e2.getX() - e1.getX() > FLIP_DISTANCE) {
                    onBackPressed();
                    return true;
                }
                return false;
            }
        });
    }

    public void cardGameOnClick(View view) {
        switch (view.getId()) {
            case R.id.randomCardButton:
                try {
                    Intent intent1 = new Intent(CardGameActivity.this, RandomCardGameActivity.class);
                    startActivity(intent1);
                    //Toast.makeText(CardGameActivity.this, "ToRandomCardGame", Toast.LENGTH_SHORT).show();
                } catch (ActivityNotFoundException e) {
                    e.printStackTrace();
                } catch (SecurityException e) {
                    e.printStackTrace();
                }
                break;

            case R.id.MultiCardButton:
                try {
                    Intent intent2 = new Intent(CardGameActivity.this, MultiCardGameActivity.class);
                    startActivity(intent2);
                    //Toast.makeText(CardGameActivity.this, "ToMultiCardGame", Toast.LENGTH_SHORT).show();
                } catch (ActivityNotFoundException e) {
                    e.printStackTrace();
                } catch (SecurityException e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return gestureDetector.onTouchEvent(event);
    }

}
