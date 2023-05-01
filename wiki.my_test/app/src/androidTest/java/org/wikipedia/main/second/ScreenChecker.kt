package org.wikipedia.main.second

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import org.wikipedia.R


class ScreenChecker {
    private val skipButton = withId(R.id.fragment_onboarding_skip_button)
    private val moreTabButton = withId(R.id.nav_more_container)
    private val settingsDrawerButton = withId(R.id.main_drawer_settings_container)
    private val recyclerView = withId(R.id.recycler_view)
    private val aboutWikipediaButton = withText(R.string.about_description)
    private val contributorsItemView = withText(R.string.about_contributors_heading)
    private val translatorsItemView = withText(R.string.about_translators_heading)
    private val licenseItemView = withText(R.string.about_app_license_heading)

    fun clickSkipButton() {
        onView(skipButton).perform(click())
    }

    fun openMoreTab() {
        onView(moreTabButton).perform(click())
    }

    fun openSettingsDrawer() {
        onView(settingsDrawerButton).perform(click())
    }

    fun clickOnItemInRecyclerView() {
        onView(recyclerView).perform(RecyclerViewActions.scrollToLastPosition<RecyclerView.ViewHolder>())
        onView(aboutWikipediaButton).perform(click())
    }

    fun clickContributors() {
        onView(contributorsItemView).perform(click())
    }

    fun clickTranslators() {
        onView(translatorsItemView).perform(click())
    }

    fun clickLicense() {
        onView(licenseItemView).perform(click())
    }

    fun checkContributorsDisplayed() {
        onView(contributorsItemView).check(matches(isDisplayed()))
    }

    fun checkTranslatorsDisplayed() {
        onView(translatorsItemView).check(matches(isDisplayed()))
    }

    fun checkLicenseDisplayed() {
        onView(licenseItemView).check(matches(isDisplayed()))
    }
}

