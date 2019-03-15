package cn.edu.sicnu.cs.yuxin.fishercloud.model;

/**
 * 作者：Yu / 鱼摆摆
 * 创建时间：2019/3/14
 * 更改时间：2019/3/14
 * 版本号：v1.0
 */
public class PlayingDeck extends Deck {
    public PlayingDeck() {
        super();
        for (String suit : PlayingCard.validSuits()) {
            for (int rank = 1; rank <= PlayingCard.maxRank(); rank++) {
                PlayingCard card = new PlayingCard();
                card.setRank(rank);
                card.setSuit(suit);
                addCard(card);
            }
        }
    }
}
