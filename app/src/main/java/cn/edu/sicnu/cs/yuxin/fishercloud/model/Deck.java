package cn.edu.sicnu.cs.yuxin.fishercloud.model;

import java.util.ArrayList;
import java.util.Random;

/**
 * 作者：Yu / 鱼摆摆
 * 创建时间：2019/3/14
 * 更改时间：2019/3/14
 * 版本号：v1.0
 */
public abstract class Deck {

    private ArrayList<Card> cards = new ArrayList<>();
    private Random random = new Random();

    public void addCard(Card card, boolean atTop) {
        if (atTop) {
            cards.add(0, card);
        } else {
            cards.add(card);
        }
    }

    public void addCard(Card card) {
        addCard(card, false);
    }

    public Card drawRandomCard() {
        Card randomCard = null;
        if (cards.size() > 0) {
            randomCard = cards.remove(random.nextInt(cards.size()));
        }
        return randomCard;
    }
}
