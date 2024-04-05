/*
 * (C) Copyright 2024 VeriSoft (http://www.verisoft.co)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ai.verisoft.stuctural;

import ai.verisoft.structural.bridge.DevEnvironmentTest;
import ai.verisoft.structural.bridge.ProductionEnvironmentTest;
import ai.verisoft.structural.bridge.TestScenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BridgeTest {

    @Test
    public void testBridge() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        TestScenario testScenario;

        // Decide on the environment; this could be based on input, configuration files, etc.
        String environment = "dev"; // or "prod"

        if ("dev".equalsIgnoreCase(environment)) {
            testScenario = new DevEnvironmentTest(driver);
        } else {
            testScenario = new ProductionEnvironmentTest(driver);
        }

        testScenario.setupEnvironment();
        testScenario.executeTest();
        testScenario.tearDown();
    }
}
