import java.math.RoundingMode
import java.text.DecimalFormat

fun main(args: Array<String>) {
    println("What is the price of a child's meal?\n(Please include value with a decimal including the cents): ");
    val kidsMealPrice = readln();
    println("The price for a kids meal is $ ${kidsMealPrice}\n");
//adult_meal = float(input("What is the price of an adult's meal? "))
    println("What is the price of an adult's meal?\n(Please include value with a decimal including the cents): ");
    val adultMealPrice = readln();
    println("The price for an adult meal is $ ${adultMealPrice}\n");
//actual_children = int(input("How many children are there? ")
    println("How many children are there?\n(Please put in a number without decimals" )
    val numOfChildren = readln();
    println("The number of children in your party is: ${numOfChildren}\n");
//actual_adults = int(input("How many adults are there? "))
    println("How many adults are there?\n(Please put in a number without decimals");
    val numOfAdults = readln();
    println("The number of adults in your party is: ${numOfAdults}\n");
//tax_initial= float(input("What is the sales tax rate in whole percent? "))
    println("What is the sales tax rate in whole percent\n(Please include the value with a decimal to the nearest hundredth");
    val taxInitial = readln();
    println("The tax applied here is: ${taxInitial}%")
    println("-----")
//print(f"Subtotal: ${((child_meal*actual_children)+(adult_meal*actual_adults))}")
    println("Subtotal: ${(kidsMealPrice.toDouble()*numOfChildren.toDouble() + (adultMealPrice.toDouble()*numOfAdults.toDouble()))}")
    println("-----")
//print(f"Sales Tax: ${((((child_meal*actual_children)+(adult_meal*actual_adults))*tax_initial)/100)}")
    val subTotal = (((kidsMealPrice.toDouble()*numOfChildren.toDouble()) + (adultMealPrice.toDouble()*numOfAdults.toDouble())) * taxInitial.toDouble())/100.0
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.DOWN
    val subTotalRoundoff = df.format(subTotal.toDouble())
    println(subTotalRoundoff)
//    println("Sales Tax: ${((((kidsMealPrice.toDouble()*numOfChildren.toDouble()) + (adultMealPrice.toDouble()*numOfAdults.toDouble())) * taxInitial.toDouble())/100.0}")
    println("-----")
//print(f"Total:${(((child_meal*actual_children)+(adult_meal*actual_adults))+(((((child_meal*actual_children)+(adult_meal*actual_adults))*tax_initial)/100)))}")
//    val total = (kidsMealPrice.toDouble()*)
//tip=float(input("How much are you going to pay for a tip?$ "))
//
//print(f"Your new total is ${(tip+(((child_meal*actual_children)+(adult_meal*actual_adults))+(((((child_meal*actual_children)+(adult_meal*actual_adults))*tax_initial)/100))))}")
//
//change=((float(input("What is the payment amount in dollars ? ")))-(tip+(((child_meal*actual_children)+(adult_meal*actual_adults))+(((((child_meal*actual_children)+(adult_meal*actual_adults))*tax_initial)/100)))))
//
//print(f"Change: ${change}")
//
}
