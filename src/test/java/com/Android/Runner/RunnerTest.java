package com.Android.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/sample.html","summary"}
        ,features = {"src/test/resources/HomeScreen.feature"}
        ,glue = {"com.Android.Stepdef"}
        ,snippets = CAMELCASE
        ,dryRun=false
        ,monochrome=true
        ,tags = "@HomeScreen"

)
public class RunnerTest {
}






