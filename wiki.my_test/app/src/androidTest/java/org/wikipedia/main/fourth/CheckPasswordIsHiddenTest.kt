package org.wikipedia.main.fourth

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.wikipedia.main.fourth.CheckPasswordIsHidden
import org.wikipedia.main.MainActivity

@RunWith(AndroidJUnit4::class)

class CheckPasswordIsHiddenTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun mainActivityTest() {
        val checkPasswordIsHidden = CheckPasswordIsHidden()
        checkPasswordIsHidden.clickSkipButton()
        checkPasswordIsHidden.clickMoreTab()
        checkPasswordIsHidden.clickLogInButton()
        checkPasswordIsHidden.typeTextToPasswordField()
        checkPasswordIsHidden.showPassword()
        checkPasswordIsHidden.checkPasswordIsVisible()
        checkPasswordIsHidden.hidePassword()
        checkPasswordIsHidden.checkPasswordIsHidden()
    }
}