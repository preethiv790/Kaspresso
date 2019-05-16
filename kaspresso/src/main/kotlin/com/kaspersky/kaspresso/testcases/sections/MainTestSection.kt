package com.kaspersky.kaspresso.testcases.sections

import com.kaspersky.kaspresso.testcases.core.Scenario
import com.kaspersky.kaspresso.testcases.core.TestBody

class MainTestSection(private val builder: TestBody.Builder) {

    /**
     * Runs [beforeTestActions], [TestCase]'s [steps] and then runs [afterTestActions]. [afterTestActions] are invoked
     * even if [beforeTestActions] or [TestCase]'s [steps] fail.
     *
     * @param steps steps to run.
     */
    fun runSteps(steps: Scenario.() -> Unit) {
        builder
            .apply { mainTestSection = steps }
            .build()
            .run()
    }
}