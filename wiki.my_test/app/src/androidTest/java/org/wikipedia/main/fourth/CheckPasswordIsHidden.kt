package org.wikipedia.main.fourth

import android.text.method.PasswordTransformationMethod
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.Matchers.allOf
import org.wikipedia.R
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.Matchers
import org.wikipedia.TestUtil.withGrandparent


class CheckPasswordIsHidden {
    private val skipButton = withId(R.id.fragment_onboarding_skip_button)
    private val moreTabButton = withId(R.id.nav_more_container)
    private val logInButton = withId(R.id.main_drawer_account_container)
    private val passwordField = allOf(
        withGrandparent(withId(org.wikipedia.R.id.create_account_password_input)), withClassName(
            Matchers.`is`("org.wikipedia.views.PlainPasteEditText")
        )
    )
    private val checkableImageButton = allOf(
        withId(com.google.android.material.R.id.text_input_end_icon),
        isDescendantOfA(withId(R.id.create_account_password_input))
    )
    private val password = "test1test"


    fun clickSkipButton() {
        onView(skipButton).perform(click())
    }

    fun clickMoreTab() {
        onView(moreTabButton).perform(click())
    }

    fun clickLogInButton() {
        onView(logInButton).perform(click())
    }

    fun typeTextToPasswordField() {
        onView(passwordField).perform(typeText(password), closeSoftKeyboard())
    }

    fun showPassword() {
        onView(checkableImageButton).perform(click())
    }

    fun checkPasswordIsVisible() {
        onView(passwordField).check(matches(withText(password)))

    }

    fun hidePassword() {
        onView(checkableImageButton).perform(click())
    }

    fun checkPasswordIsHidden() {
        val hiddenPassword =
            PasswordTransformationMethod.getInstance().getTransformation(password, null)
        onView(passwordField).check(matches(withText(hiddenPassword.toString())))
    }

}


