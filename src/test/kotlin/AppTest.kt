package io.github.piotrkluz

import org.jetbrains.annotations.TestOnly
import kotlin.test.assertEquals


class TestSource {
    @TestOnly fun f() {
        assertEquals("Hello, world!", getGreeting())
    }
}