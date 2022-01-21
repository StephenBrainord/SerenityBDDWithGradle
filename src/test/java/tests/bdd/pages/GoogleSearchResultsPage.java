package tests.bdd.pages;

import base.BasePage;

public class GoogleSearchResultsPage extends BasePage {

    public boolean verifyFirstSearchResult(String keyword) {
        System.out.println("Search Page Title is - " + getPageTitle("//h3[1]"));
        return getPageTitle("//h3[1]").contains(keyword);
    }
}
