package cn.edu.sicnu.cs.yuxin.fishercloud;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Toast;

import cn.edu.sicnu.cs.yuxin.fishercloud.model.Card;

/**
 * 作者：Yu / 鱼摆摆
 * 创建时间：2019/3/14
 * 更改时间：2019/3/14
 * 版本号：v1.0
 */
public class OnMyGestureListener implements GestureDetector.OnGestureListener {

    protected static final float FLIP_DISTANCE = 100;

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {

        if (e1.getX() - e2.getX() > FLIP_DISTANCE) {
            Log.i("MYTAG", "左滑");
            return true;
        }
        if (e2.getX() - e1.getX() > FLIP_DISTANCE) {
            Log.i("MYTAG", "右滑");
            return true;
        }
        if (e1.getY() - e2.getY() > FLIP_DISTANCE) {
            Log.i("MYTAG", "上滑");
            return true;
        }
        if (e2.getY() - e1.getY() > FLIP_DISTANCE) {
            Log.i("MYTAG", "下滑");
            return true;
        }

        return false;
    }
}
