package org.wikipedia.main.first

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.hasSibling
import androidx.test.espresso.matcher.ViewMatchers.withChild
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.Matchers
import org.wikipedia.R


class DefaultSettingsChecker {
    private val materialButton = withId(R.id.fragment_onboarding_skip_button)
    private val moreTabButton = withId(R.id.nav_more_container)
    private val settingsDrawerButton = withId(R.id.main_drawer_settings_container)
    private val exploreFeedButton = withText(R.string.preference_title_customize_explore_feed)
    private val checkBoxesFirst = Matchers.allOf(
        hasSibling(withChild(withText(R.string.view_featured_article_card_title))),
        withId(R.id.feed_content_type_checkbox)
    )
    private val checkBoxesSecond = Matchers.allOf(
        hasSibling(withChild(withText(R.string.view_top_read_card_title))),
        withId(R.id.feed_content_type_checkbox)
    )
    private val checkBoxesThird = Matchers.allOf(
        hasSibling(withChild(withText(R.string.view_featured_image_card_title))),
        withId(R.id.feed_content_type_checkbox)
    )
    private val checkBoxesFourth = Matchers.allOf(
        hasSibling(withChild(withText(R.string.view_because_you_read_card_title))),
        withId(R.id.feed_content_type_checkbox)
    )
    private val checkBoxesFifth = Matchers.allOf(
        hasSibling(withChild(withText(R.string.view_card_news_title))),
        withId(R.id.feed_content_type_checkbox)
    )
    private val checkBoxesSixth = Matchers.allOf(
        hasSibling(withChild(withText(R.string.on_this_day_card_title))),
        withId(R.id.feed_content_type_checkbox)
    )
    private val checkBoxesSeventh = Matchers.allOf(
        hasSibling(withChild(withText(R.string.view_random_card_title))),
        withId(R.id.feed_content_type_checkbox)
    )
    private val checkBoxesEight = Matchers.allOf(
        hasSibling(withChild(withText(R.string.view_main_page_card_title))),
        withId(R.id.feed_content_type_checkbox)
    )

    fun clickSkipButton() {
        onView(materialButton).perform(click())
    }

    fun openMoreNavigationTab() {
        onView(moreTabButton).perform(click())
    }

    fun openSettings() {
        onView(settingsDrawerButton).perform(click())
    }

    fun clickOnItemInRecyclerView() {
        onView(exploreFeedButton).perform(click())
    }



    fun checkDefaultFeedSettings() {
        onView(checkBoxesFirst).check(ViewAssertions.matches(ViewMatchers.isChecked()))
            .withFailureHandler { _, _ -> throw AssertionError("Checkbox 1 is not checked") }
        onView(checkBoxesSecond).check(ViewAssertions.matches(ViewMatchers.isChecked()))
            .withFailureHandler { _, _ -> throw AssertionError("Checkbox 2 is not checked") }
        onView(checkBoxesThird).check(ViewAssertions.matches(ViewMatchers.isChecked()))
            .withFailureHandler { _, _ -> throw AssertionError("Checkbox 3 is not checked") }
        onView(checkBoxesFourth).check(ViewAssertions.matches(ViewMatchers.isChecked()))
            .withFailureHandler { _, _ -> throw AssertionError("Checkbox 4 is not checked") }
        onView(checkBoxesFifth).check(ViewAssertions.matches(ViewMatchers.isChecked()))
            .withFailureHandler { _, _ -> throw AssertionError("Checkbox 5 is not checked") }
        onView(checkBoxesSixth).check(ViewAssertions.matches(ViewMatchers.isChecked()))
            .withFailureHandler { _, _ -> throw AssertionError("Checkbox 6 is not checked") }
        onView(checkBoxesSeventh).check(ViewAssertions.matches(ViewMatchers.isChecked()))
            .withFailureHandler { _, _ -> throw AssertionError("Checkbox 7 is not checked") }
        onView(checkBoxesEight).check(ViewAssertions.matches(ViewMatchers.isChecked()))
            .withFailureHandler { _, _ -> throw AssertionError("Checkbox 8 is not checked") }
    }
}


