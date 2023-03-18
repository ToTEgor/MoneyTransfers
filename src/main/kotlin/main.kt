fun main () {
    var amount = 1500
    val minTax = 35
    val tax = (amount / 100) * 0.75
    if (tax <= minTax) {
        println("Для суммы перевода $amount руб, комиссия составит $minTax руб.")
    } else {
        println("Для суммы перевода $amount руб, комисcия соcтавит $tax руб.")
    }
}