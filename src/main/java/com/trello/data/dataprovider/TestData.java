package com.trello.data.dataprovider;

import org.testng.annotations.DataProvider;

public class TestData {

    private TestData(){
        throw new IllegalStateException();
    }

    @DataProvider
    public static Object[][] testDataProvider() {
        return new Object[][]{
                {new TrelloModal.TrelloModalBuilder().boardName("test").build()},
        };
    }

}
