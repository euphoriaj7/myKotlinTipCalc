import java.math.RoundingMode
//import java.security.KeyStore.TrustedCertificateEntry
import java.text.DecimalFormat

fun main() {
    println("What is the price of a child's meal?\n(Please include value with a decimal including the cents): ")
    val kidsMealPrice = readln()
    println("The price for a kids meal is $ ${kidsMealPrice}\n")
//adult_meal = float(input("What is the price of an adult's meal? "))
    println("What is the price of an adult's meal?\n(Please include value with a decimal including the cents): ")
    val adultMealPrice = readln()
    println("The price for an adult meal is $ ${adultMealPrice}\n")
//actual_children = int(input("How many children are there? ")
    println("How many children are there?\n(Please put in a number without decimals")
    val numOfChildren = readln()
    println("The number of children in your party is: ${numOfChildren}\n")
//actual_adults = int(input("How many adults are there? "))
    println("How many adults are there?\n(Please put in a number without decimals")
    val numOfAdults = readln()
    println("The number of adults in your party is: ${numOfAdults}\n")
//tax_initial= float(input("What is the sales tax rate in whole percent? "))
    println("What is the sales tax rate in whole percent\n(Please include the value with a decimal to the nearest hundredth")
    val taxInitial = readln()
    println("The tax applied here is: ${taxInitial}%")
    println("-----")
//print(f"Subtotal: ${((child_meal*actual_children)+(adult_meal*actual_adults))}")
    val Subtotal = (kidsMealPrice.toDouble() * numOfChildren.toDouble() + (adultMealPrice.toDouble() * numOfAdults.toDouble()))
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.DOWN
    val subTotalTaxRoundoff = df.format(Subtotal.toDouble())
    println("Subtotal: $$subTotalTaxRoundoff")
    println("-----")
//print(f"Sales Tax: ${((((child_meal*actual_children)+(adult_meal*actual_adults))*tax_initial)/100)}")
    val subTotalTax =
        (((kidsMealPrice.toDouble() * numOfChildren.toDouble()) + (adultMealPrice.toDouble() * numOfAdults.toDouble())) * taxInitial.toDouble()) / 100.0
    val df2 = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.DOWN
    val subTotalRoundoff = df2.format(subTotalTax.toDouble())
    println("Your tax total is: $${subTotalRoundoff}")
    println("-----")
//print(f"Total:${(((child_meal*actual_children)+(adult_meal*actual_adults))+(((((child_meal*actual_children)+(adult_meal*actual_adults))*tax_initial)/100)))}")
    val total = ((kidsMealPrice.toDouble() * numOfChildren.toDouble()) + (adultMealPrice.toDouble() * numOfAdults.toDouble())) + ((((kidsMealPrice.toDouble() * numOfChildren.toDouble()) + (adultMealPrice.toDouble() * numOfAdults.toDouble())) * taxInitial.toDouble()) / 100.0)
    val df3 = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.DOWN
    val TotalRoundoff = df3.format(total.toDouble())
    println("The total now is:$${TotalRoundoff}")
//tip=float(input("How much are you going to pay for a tip?$ "))
    println("How much are you going to pay for a tip?\n(Please include value with a decimal including the cents): ")
    val tip = readln()
    val df5 = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.DOWN
    val tipRoundoff = df5.format(tip.toDouble())
    println("Your tip amount is: $$tipRoundoff")
//print(f"Your new total is ${(tip+(((child_meal*actual_children)+(adult_meal*actual_adults))+(((((child_meal*actual_children)+(adult_meal*actual_adults))*tax_initial)/100))))}
    val totalWithTip = (tip.toDouble() + total)
    val df7 = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.DOWN
    val totalWithTipRoundoff = df7.format(totalWithTip.toDouble())
    println("Your new total is $$totalWithTipRoundoff")
//    println("Your new total is $${totalWithTip}")
//change=((float(input("What is the payment amount in dollars ? ")))-(tip+(((child_meal*actual_children)+(adult_meal*actual_adults))+(((((child_meal*actual_children)+(adult_meal*actual_adults))*tax_initial)/100)))))

//print(f"Change: ${change}")
    var customerPaid: Boolean = true
    while (customerPaid == true){
        println("what is the payment amount in dollars?\n Please enter an amount that will equal or cover the cost of the bill")
        val payment = readln()
        val change = ((payment.toDouble()) - (tip.toDouble() + total))
        val df6 = DecimalFormat("#.##")
        df.roundingMode = RoundingMode.DOWN
        val changeRoundoff = df6.format(change.toDouble())
        if (change < totalWithTipRoundoff.toDouble()) {
            println("Please put in an amount that will cover the full cost!")
        } else {
            val df4 = DecimalFormat("#.##")
            df.roundingMode = RoundingMode.DOWN
            val TotalRoundoff = df4.format(change.toDouble())
            print("Your change back is: $${changeRoundoff}\nThanks for coming in")
            break
        }
    }
}

