package com.logintosaucedemo;

import org.testng.annotations.DataProvider;

public class CredentialsProvider {

    @DataProvider(name = "credentials")
    public Object[][] providerDataSet() {
        return new Object[][] {
                { "standard_user", "secret_sauce" },
                { "locked_out_user", "secret_sauce" },
                { "problem_user", "secret_sauce" },
                { "performance_glitch_user", "secret_sauce" },
                { "error_user", "secret_sauce" },
                { "visual_user", "secret_sauce" }
        };
    }
}
