import org.junit.Test

import org.junit.Assert.*

class TestCommision {

    @Test
    fun comission() {
        val  typeCard = "Visa"
        val transfer = 1000
        val previous = 0

        val result = comission(typeCard,transfer,previous)

        assertEquals(35,result)
    }
}