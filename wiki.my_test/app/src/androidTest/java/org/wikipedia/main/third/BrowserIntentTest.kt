package org.wikipedia.main.third

import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity

class BrowserIntentTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    private val browserIntent = BrowserIntent()

    @Test
    fun testBrowserIntent() {
        browserIntent.clickSkipButton()
        browserIntent.clickMoreTab()
        browserIntent.clickSettingsDrawer()
        browserIntent.clickPrivacyPolicy()
        browserIntent.checkBrowserIntent()
    }
}