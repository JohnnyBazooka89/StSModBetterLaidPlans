package betterLaidPlans;

import basemod.BaseMod;
import basemod.ModPanel;
import basemod.interfaces.PostInitializeSubscriber;
import com.badlogic.gdx.graphics.Texture;
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import com.megacrit.cardcrawl.helpers.ImageMaster;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpireInitializer
public class BetterLaidPlansMod implements PostInitializeSubscriber {

    public static final Logger logger = LogManager.getLogger(BetterLaidPlansMod.class.getName());

    //Mod metadata
    private static final String MOD_NAME = "Better-Laid Plans";
    private static final String AUTHOR = "JohnnyBazooka89";
    private static final String DESCRIPTION = "";

    //Badge
    private static final String BADGE_IMG = "betterLaidPlans/img/ModBadge.png";

    public BetterLaidPlansMod() {
        BaseMod.subscribe(this);
    }

    public static void initialize() {
        logger.info("======================= BETTER-LAID PLANS INIT =======================");

        new BetterLaidPlansMod();

        logger.info("====================================================================");
    }

    @Override
    public void receivePostInitialize() {
        // Mod badge
        Texture badgeTexture = ImageMaster.loadImage(BADGE_IMG);
        ModPanel settingsPanel = new ModPanel();
        BaseMod.registerModBadge(badgeTexture, MOD_NAME, AUTHOR, DESCRIPTION, settingsPanel);
    }

}
