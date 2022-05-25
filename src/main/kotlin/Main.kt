import java.math.RoundingMode
import java.text.DecimalFormat

//Define a main function for everything to be put in
fun main() {
// Ask the user what is the price of a kids meal
    println("What is the price of a child's meal?\n(Please include value with a decimal including the cents): ")
// Take in the user input and store it in a variable
    val kidsMealPrice = readln()
//  Display it back to the user
    println("The price for a kids meal is $ ${kidsMealPrice}\n")

//Ask the user what is the price of an adult meal
    println("What is the price of an adult's meal?\n(Please include value with a decimal including the cents): ")
    val adultMealPrice = readln()
    println("The price for an adult meal is $ ${adultMealPrice}\n")

//Find out how many children are at the restaurant
    println("How many children are there?\n(Please put in a number without decimals")
    val numOfChildren = readln()
    println("The number of children in your party is: ${numOfChildren}\n")

//Find out how many adults are going to be at the restaurant
    println("How many adults are there?\n(Please put in a number without decimals")
    val numOfAdults = readln()
    println("The number of adults in your party is: ${numOfAdults}\n")

//Find out what the tax rate for the bill total
    println("What is the sales tax rate in whole percent\n(Please include the value with a decimal to the nearest hundredth")
    val taxInitial = readln()
    println("The tax applied here is: ${taxInitial}%")
    println("-----")

//Display the subtotal to the user
    val Subtotal = (kidsMealPrice.toDouble() * numOfChildren.toDouble() + (adultMealPrice.toDouble() * numOfAdults.toDouble()))
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.DOWN
    val subTotalTaxRoundoff = df.format(Subtotal.toDouble())
    println("Subtotal: $$subTotalTaxRoundoff")
    println("-----")

//Display the tax in dollars to the user
    val subTotalTax =
        (((kidsMealPrice.toDouble() * numOfChildren.toDouble()) + (adultMealPrice.toDouble() * numOfAdults.toDouble())) * taxInitial.toDouble()) / 100.0
    val df2 = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.DOWN
    val subTotalRoundoff = df2.format(subTotalTax.toDouble())
    println("Your tax total is: $${subTotalRoundoff}")
    println("-----")

//Display the updated total to the user
    val total = ((kidsMealPrice.toDouble() * numOfChildren.toDouble()) + (adultMealPrice.toDouble() * numOfAdults.toDouble())) + ((((kidsMealPrice.toDouble() * numOfChildren.toDouble()) + (adultMealPrice.toDouble() * numOfAdults.toDouble())) * taxInitial.toDouble()) / 100.0)
    val df3 = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.DOWN
    val TotalRoundoff = df3.format(total)
    println("The total now is:$${TotalRoundoff}")

//Ask the user how much they want to pay for a tip in dollars?
    println("How much are you going to pay for a tip?\n(Please include value with a decimal including the cents): ")
    val tip = readln()
    val df5 = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.DOWN
    val tipRoundoff = df5.format(tip.toDouble())
    println("Your tip amount is: $$tipRoundoff")

//Display the update total with the tip calculated in
    val totalWithTip = (tip.toDouble() + total)
    val df7 = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.DOWN
    val totalWithTipRoundoff = df7.format(totalWithTip.toDouble())
    println("Your new total is $$totalWithTipRoundoff")

//    Create a variable to use a standard for the while loop
    var customerPaid: Boolean = true

//    create a while loop to keep the user in the program until they pay their bill fully
    while (customerPaid == true){

//      Ask the user what their payment amount is in dollars
        println("what is the payment amount in dollars?\n Please enter an amount that will equal or cover the cost of the bill")
        val payment = readln()
        val df6 = DecimalFormat("#.##")
        df.roundingMode = RoundingMode.DOWN
        val paymentRoundoff = df6.format(payment.toDouble())
        val change = ((paymentRoundoff.toDouble()) - (tip.toDouble() + total))
        val df7 = DecimalFormat("#.##")
        df.roundingMode = RoundingMode.DOWN
        val changeRoundoff = df7.format(change.toDouble())

        //        if the amount the user enter is not enough to pay the bill,
        //        ask the user to enter an amount that will cover the full cost of the bill
        if (change < 0.0) {
            println("Please put in an amount that will cover the full cost!")
        } else {
            val df4 = DecimalFormat("#.##")
            df.roundingMode = RoundingMode.DOWN
            val TotalRoundoff = df4.format(change.toDouble())
//          Print the amount of money back to the customer
            print("Your change back is: $${changeRoundoff}\nThanks for coming in")
            customerPaid = false
        }
    }
}

