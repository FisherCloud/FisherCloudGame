package cn.edu.sicnu.cs.yuxin.fishercloud.model;

import java.security.PublicKey;
import java.util.Arrays;

/**
 * 作者：Yu / 鱼摆摆
 * 创建时间：2019/3/14
 * 更改时间：2019/3/14
 * 版本号：v1.0
 */
public class PlayingCard extends Card {

    private String suit;
    private int rank;

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        if (Arrays.asList(PlayingCard.validSuits()).contains(suit)) {
            this.suit = suit;
        }
    }

    public static String[] validSuits() {
        return new String[]{"♥", "♦", "♠", "♣"};
    }

    private static String[] rankStrings() {
        return new String[]{"?", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    }

    public static int maxRank() {
        return PlayingCard.rankStrings().length - 1;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        if (rank<=PlayingCard.maxRank()){
            this.rank = rank;
        }
    }

    @Override
    public int match(Card[] otherCards) {
        int score = 0;
        if (otherCards.length == 1) {
            PlayingCard otherCard = (PlayingCard) otherCards[0];
            if (otherCard.getRank() == this.getRank()) {
                score = 4;
            } else if (otherCard.getSuit().equals(this.getSuit())) {
                score = 1;
            }
        }
        return score;
    }

    @Override
    public String getContents() {
        return PlayingCard.rankStrings()[getRank()] + getSuit();
    }
}
