package org.wikipedia.main.first

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.wikipedia.main.MainActivity

@RunWith(AndroidJUnit4::class)
class DefaultSettingsCheckerTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun settingsCheckerTest() {
        val settingsChecker = DefaultSettingsChecker()
        settingsChecker.clickSkipButton()
        settingsChecker.openMoreNavigationTab()
        settingsChecker.openSettings()
        settingsChecker.clickOnItemInRecyclerView()
        settingsChecker.checkDefaultFeedSettings()

    }
}