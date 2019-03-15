package cn.edu.sicnu.cs.yuxin.fishercloud.model;

import android.content.Intent;

/**
 * 作者：Yu / 鱼摆摆
 * 创建时间：2019/3/14
 * 更改时间：2019/3/14
 * 版本号：v1.0
 */
public abstract class Card {
    private boolean chosen;
    private boolean matched;

    public abstract String getContents();

    public boolean isChosen() {
        return chosen;
    }

    public void setChosen(boolean chosen) {
        this.chosen = chosen;
    }

    public boolean isMatched() {
        return matched;
    }

    public void setMatched(boolean matched) {
        this.matched = matched;
    }

    public int match(Card[] otherCards) {
        int score = 0;
        for (Card card : otherCards) {
            if (card.getContents().equals(this)) {
                score = 1;
            }
        }
        return score;
    }
}
