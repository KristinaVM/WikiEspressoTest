package org.wikipedia.main.second

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.wikipedia.main.MainActivity

@RunWith(AndroidJUnit4::class)
class ScreenCheckerTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun screenCheckerTest() {
        val screenChecker = ScreenChecker()
        screenChecker.clickSkipButton()
        screenChecker.openMoreTab()
        screenChecker.openSettingsDrawer()
        screenChecker.clickOnItemInRecyclerView()
        screenChecker.clickContributors()
        screenChecker.checkContributorsDisplayed()
        screenChecker.clickTranslators()
        screenChecker.checkTranslatorsDisplayed()
        screenChecker.clickLicense()
        screenChecker.checkLicenseDisplayed()
    }
}