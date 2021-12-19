package ru.netology

fun main () {
    val exPurchasesSum = 10000
    val isConstantCustomer = true
    val charge = 1000
    val discountConst = 0.99
    val discountBase = 100
    val discountMax = 0.95
    val chargeDiscountConst = charge * discountConst
    val chargeDiscountBase = charge - discountBase
    val chargeDiscountMax = charge * discountMax
    val noDiscountLevel = 1001
    val baseDiscountLevel = 10001

    if (exPurchasesSum < noDiscountLevel) {
        if (isConstantCustomer) {
            print("покупка - " + charge + " рублей. после применения скидки постоянного покупателя - " + (chargeDiscountConst))
        } else {
            print("покупка - " + charge + " рублей. скидок нема=)")
        }
    } else if ((exPurchasesSum >= noDiscountLevel) && (exPurchasesSum < baseDiscountLevel)) {
        if (isConstantCustomer) {
            print("покупка - " + charge + " рублей. после применения стандартной скидки 100р - " + (chargeDiscountBase)
                    + " рублей. после  применения скидки постоянного покупателя - " + (chargeDiscountBase * discountConst))
        } else {
            print("покупка - " + charge + " рублей. после применения стандартной скидки 100р - " + (chargeDiscountBase)
                    + " рублей.")
        }
    } else {
        if (isConstantCustomer) {
            print(
                "покупка - " + charge + " рублей. после применения скидки 5% - " + (chargeDiscountMax)
                        + " рублей. после  применения скидки постоянного покупателя - " + (chargeDiscountMax * discountConst)
            )
        } else {
            print("покупка - " + charge + " рублей. после применения скидки 5% - " + (chargeDiscountMax)
                        + " рублей.")
        }
    }
}