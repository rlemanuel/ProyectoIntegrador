package com.example.appfinal.View
import android.app.Activity
import android.widget.EditText
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.`ViewAssertions$MatchesViewAssertion-IA`
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.appfinal.R
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import kotlin.reflect.typeOf

@RunWith(AndroidJUnit4::class)

class MainActivityTest {
    @get:Rule

    var rule: ActivityScenarioRule<*> = ActivityScenarioRule (MainActivity::class.java)

    @Test
    fun testScenario_ComparaStrings(){
        Espresso.onView(ViewMatchers.withId(R.id.editTextText)).perform(ViewActions.typeText("Hola"))
        Espresso.onView(ViewMatchers.withId(R.id.editTextText2)).perform(ViewActions.typeText("Hola"))
        Espresso.closeSoftKeyboard()
        Espresso.onView(ViewMatchers.withId(R.id.button5)).perform((ViewActions.click()))
        Espresso.onView(ViewMatchers.withId(R.id.textView2)).check(ViewAssertions.matches(ViewMatchers.withText("Ambas cadenas son iguales :)")))
    }
}