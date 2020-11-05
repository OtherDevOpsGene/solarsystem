package com.steampunk.solarsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.openqa.selenium.remote.DesiredCapabilities.firefox;

import org.openqa.selenium.By;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.seljup.DriverCapabilities;
import io.github.bonigarcia.seljup.DriverUrl;
import io.github.bonigarcia.seljup.SeleniumJupiter;

/**
 * Selenium test for the web site.
 */
@ExtendWith(SeleniumJupiter.class)
public class PlanetsTest {
    /**
     * URL to start testing at, passed in as a system property.
     */
    private static final String TARGET_URL = System.getProperty("targetUrl");

    /**
     * URL for the Selenium Grid hub.
     */
    @DriverUrl
    private static final String HUB_URL = "http://hub:4444/wd/hub";

    @Test
    public void testTitle(@DriverCapabilities("browserName=chrome") RemoteWebDriver driver) {
        driver.get(TARGET_URL);

        assertEquals("Planets in the Solar System", driver.getTitle(), "Unexpected page title");
    }

    @Test
    public void testTable(@DriverCapabilities("browserName=chrome") RemoteWebDriver driver) {
        driver.get(TARGET_URL);

        assertEquals("Name", driver.findElement(By.id("name")).getText(), "Unexpected first column heading");
        assertEquals("Radius\n(km)", driver.findElement(By.id("radius")).getText(), "Unexpected second column heading");
        assertEquals("Year\n(Earth days)", driver.findElement(By.id("year")).getText(), "Unexpected third column heading");
    }

    @Test
    public void testEarth(@DriverCapabilities("browserName=firefox") RemoteWebDriver driver) {
        driver.get(TARGET_URL);

        assertEquals("365", driver.findElement(By.xpath("//tr[td='Earth']/td[3]")).getText(), "Unexpected Earth year");
    }

    @Test
    public void testPluto(@DriverCapabilities("browserName=firefox") RemoteWebDriver driver) {
        driver.get(TARGET_URL);

        assertTrue(!driver.findElements(By.xpath("//tr[td='Pluto']/td[1]")).isEmpty(), "Pluto is a Planet");
    }
}
