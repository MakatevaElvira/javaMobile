package lib.ui.mobileWeb;

import lib.ui.ArticlePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWArticlePageObject extends ArticlePageObject {
    public MWArticlePageObject(RemoteWebDriver driver) {
        super(driver);
    }

    static {
        VIEW_ELEMENT = "css:footer";
        ARTICLE_TITLE = "css:div.pre-content h1";
        ADD_TO_LIST = "css:#page-actions a#ca-watch";
        REMOVE_FROM_MY_LIST = "xpath://a[contains(@href,'unwatch')]";//"xpath://a[@title ='Remove this page from your watchlist']";  //a[contains(@title,'emove')]
    }
}
