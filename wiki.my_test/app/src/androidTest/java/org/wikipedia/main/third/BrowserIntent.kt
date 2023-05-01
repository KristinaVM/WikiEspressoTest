package org.wikipedia.main.third

import android.app.Instrumentation
import android.content.Intent
import android.net.Uri
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.Intents.intending
import androidx.test.espresso.intent.matcher.IntentMatchers.hasAction
import androidx.test.espresso.intent.matcher.IntentMatchers.hasData
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.Matchers.allOf
import org.wikipedia.R


class BrowserIntent {
    private val skipButton = withId(R.id.fragment_onboarding_skip_button)
    private val moreTabButton = withId(R.id.nav_more_container)
    private val settingsDrawerButton = withId(R.id.main_drawer_settings_container)
    private val recyclerView = withId(R.id.recycler_view)
    private val privacyPolicy = withText(R.string.privacy_policy_description)
    private val expectedIntent = allOf(
        hasAction(Intent.ACTION_VIEW),
        hasData(Uri.parse("https://www.wikimedia.org/privacy-policy"))
    )


    fun clickSkipButton() {
        onView(skipButton).perform(click())
    }

    fun clickMoreTab() {
        onView(moreTabButton).perform(click())
    }

    fun clickSettingsDrawer() {
        onView(settingsDrawerButton).perform(click())
    }

    fun clickPrivacyPolicy() {
        onView(recyclerView).perform(RecyclerViewActions.scrollToLastPosition<RecyclerView.ViewHolder>())
        onView(privacyPolicy).perform(click())
    }

    fun checkBrowserIntent() {
        Intents.init()
        try {
            intending(expectedIntent).respondWith(Instrumentation.ActivityResult(0, null))
            onView(recyclerView).perform(
                RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(18),
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(18, click())
            )
            intended(expectedIntent)
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            Intents.release()
        }
    }
}
