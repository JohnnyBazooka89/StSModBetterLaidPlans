package betterLaidPlans.patches;

import com.evacipated.cardcrawl.modthespire.lib.ByRef;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.DamageInfo;
import com.megacrit.cardcrawl.cards.green.WellLaidPlans;

@SpirePatch(clz = AbstractCard.class, method = SpirePatch.CONSTRUCTOR, paramtypez = {String.class, String.class, String.class, int.class, String.class, AbstractCard.CardType.class, AbstractCard.CardColor.class, AbstractCard.CardRarity.class, AbstractCard.CardTarget.class, DamageInfo.DamageType.class})
public class BetterLaidPlansPatch {

    public static void Prefix(AbstractCard abstractCard, String id, String name, String imgUrl, @ByRef int[] cost, String rawDescription, AbstractCard.CardType type, AbstractCard.CardColor color, AbstractCard.CardRarity rarity, AbstractCard.CardTarget target, DamageInfo.DamageType dType) {
        if (WellLaidPlans.ID.equals(id)) {
            cost[0] = 0;
        }
    }

}