package uwu.content;

import mindustry.type.Item;
import uwu.util.interfaces.LoadContent;

import static arc.graphics.Color.valueOf;

public class ZHItems implements LoadContent {

    public static Item
            paper, xrs, xdg, sylt, sxym, mh, cat, coin, jlb, jym, hd, hly, dp, cdn, bws, alpha
            /*前后顺序：纸，旭日升，小蛋糕，石油辣条，棉花，猫猫虫，零钱，健力宝，甲一麦，核弹，海螺因，豆皮，菜刀牛，霸王丝，alpha*/;

    @Override
    public void load() {
        paper = new Item("paper", valueOf("FFFFFFFF")) {{
            cost = 0.1f;
        }};

        xrs = new Item("xrs", valueOf("2D54A2FF")) {{
            hardness = 2;
            cost = 0.7f;
        }};

        xdg = new Item("xdg", valueOf("2DC45AFF")) {{
            cost = 0.1f;
        }};

        sylt = new Item("sylt", valueOf("16181CFF")) {{
            cost = 0.2f;
        }};

        mh = new Item("mh", valueOf("FFFFFFFF")) {{
            explosiveness = 0.3f;
            cost = 1.0f;
        }};

        cat = new Item("cat", valueOf("367EC2FF")) {{
            cost = 1f;
        }};

        coin = new Item("coin", valueOf("D67DF6FF")) {{
            cost = 0.5f;
        }};

        jlb = new Item("jlb", valueOf("F6BB64FF")) {{
            cost = 1.5f;
        }};
        
        jym = new Item("jym", valueOf("DE2043FF")) {{
            cost = 0.5f;
        }};
        
        hd = new Item("hd", valueOf("1D661EFF")) {{
            cost = 0.5f;
        }};
        
        hly = new Item("hly", valueOf("915D29FF")) {{
            cost = 0.5f;
        }};
        
        dp = new Item("dp", valueOf("D0AB86FF")) {{
            cost = 0.5f;
        }};
        
        cdn = new Item("cdn", valueOf("FFFFFFFF")) {{
            cost = 0.5f;
        }};
        
        bws = new Item("bws", valueOf("D7822DFF")) {{
            cost = 0.5f;
        }};
        
        alpha = new Item("alpha", valueOf("D6AC2DFF")) {{
            cost = 0.5f;
            frames = 8;
        }};
        
    }
}
