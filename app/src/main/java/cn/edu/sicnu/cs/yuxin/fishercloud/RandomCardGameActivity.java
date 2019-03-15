package cn.edu.sicnu.cs.yuxin.fishercloud;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import cn.edu.sicnu.cs.yuxin.fishercloud.model.Card;
import cn.edu.sicnu.cs.yuxin.fishercloud.model.PlayingDeck;

public class RandomCardGameActivity extends AppCompatActivity {

    Integer flipCount = 0;

    PlayingDeck deck = new PlayingDeck();

    Card card = null;

    GestureDetector gestureDetector = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_card_game);

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

    @SuppressLint("SetTextI18n")
    public void RandomCardOnClick(View view) {
        Button btn = findViewById(R.id.cardButton);
        TextView textView = findViewById(R.id.textView);
        switch (view.getId()) {
            case R.id.cardButton:

                if (btn.getText() == "") {
                    card = deck.drawRandomCard();
                    flipCount++;
                    btn.setText(card.getContents());
                    btn.setBackgroundResource(R.drawable.blankcard);
                } else {
                    card = null;
                    btn.setText("");
                    btn.setBackgroundResource(R.drawable.stanfordtree);
                }

                textView.setText("您已经翻了" + flipCount + "张卡片");
                //Toast.makeText(RandomCardGameActivity.this, "RandomCardGame", Toast.LENGTH_SHORT).show();
                break;
            case R.id.randomCardResetButton:
                flipCount = 0;
                textView.setText("您已经翻了" + flipCount + "张卡片");
                card = null;
                btn.setText("");
                btn.setBackgroundResource(R.drawable.stanfordtree);
                deck = new PlayingDeck();
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return gestureDetector.onTouchEvent(event);
    }
}
