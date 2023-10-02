package com.example.affirmation

import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.runner.RunWith
import androidx.test.ext.junit.runners.AndroidJUnit4

@RunWith(AndroidJUnit4::class)

class AffirmationsListTests {
    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)

}
/*
onView(withText(R.string.affirmation10))
.check(matches(isDisplayed()))*/