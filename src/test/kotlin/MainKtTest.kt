import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calcCommissionMaestro() {
        val type1 = "Maestro"
        val amountMonth = 0
        val amountNow = 10000_00

        val result = calcCommission(type1, amountMonth, amountNow)

        assertEquals(6, result)
    }

    @Test
    fun calcCommissionMasterCard() {
        val type2 = "MasterCard"
        val amountMonth = 0
        val amountNow = 10000_00

        val result = calcCommission(type2, amountMonth, amountNow)

        assertEquals(0, result)
    }

    @Test
    fun calcCommissionVISA() {
        val type3 = "VISA"
        val amountMonth = 0
        val amountNow = 10000_00

        val result = calcCommission(type3, amountMonth, amountNow)

        assertEquals(7500, result)
    }

    @Test
    fun calcCommissionMIR() {
        val type4 = "Мир"
        val amountMonth = 0
        val amountNow = 10000_00

        val result = calcCommission(type4, amountMonth, amountNow)

        assertEquals(7500, result)
    }

    @Test
    fun calcCommissionVK() {
        val type5 = "VK Pay"
        val amountMonth = 0
        val amountNow = 10000_00

        val result = calcCommission(type5, amountMonth, amountNow)

        assertEquals(0, result)
    }

    @Test
    fun calcCommissionMaestro1() {
        val type1 = "Maestro"
        val amountMonth = 100000
        val amountNow = 100000_00

        val result = calcCommission(type1, amountMonth, amountNow)

        assertEquals(62000, result)
    }

    @Test
    fun calcCommissionVISA1() {
        val type3 = "VISA"
        val amountMonth = 0
        val amountNow = 100_00

        val result = calcCommission(type3, amountMonth, amountNow)

        assertEquals(3500, result)

    }
    @Test
    fun calcCommissionMasterCard1() {
        val type2 = "MasterCard"
        val amountMonth = 1000000
        val amountNow = 100000_00

        val result = calcCommission(type2, amountMonth, amountNow)

        assertEquals(62000, result)
    }
    @Test
    fun calcCommissionMIR1() {
        val type4 = "Мир"
        val amountMonth = 100
        val amountNow = 1000_00

        val result = calcCommission(type4, amountMonth, amountNow)

        assertEquals(3500, result)
    }
    @Test
    fun calcCommission() {
        val type = "Yandex money"
        val amountMonth = 100
        val amountNow = 1000_00

        val result = calcCommission(type, amountMonth, amountNow)

        assertEquals(0, result)
    }
}