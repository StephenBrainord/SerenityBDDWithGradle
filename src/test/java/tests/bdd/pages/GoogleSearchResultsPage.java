package tests.bdd.pages;

import base.BasePage;

import java.io.IOException;

public class GoogleSearchResultsPage extends BasePage {

    public boolean verifySearchTitle(String keyword) throws IOException {
        System.out.println("Search Page Title is - " + getPageTitle());
        return getPageTitle().contains(keyword);
    }
}
