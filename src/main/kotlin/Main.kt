fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}
//
//import math
//
//child_meal = float(input("What is the price of a child's meal? "))
//
//adult_meal = float(input("What is the price of an adult's meal? "))
//
//actual_children = int(input("How many children are there? "))
//
//actual_adults = int(input("How many adults are there? "))
//
//tax_initial= float(input("What is the sales tax rate in whole percent? "))
//
//print(f"Subtotal: ${((child_meal*actual_children)+(adult_meal*actual_adults))}")
//
//print(f"Sales Tax: ${((((child_meal*actual_children)+(adult_meal*actual_adults))*tax_initial)/100)}")
//
//print(f"Total:${(((child_meal*actual_children)+(adult_meal*actual_adults))+(((((child_meal*actual_children)+(adult_meal*actual_adults))*tax_initial)/100)))}")
//
//tip=float(input("How much are you going to pay for a tip?$ "))
//
//print(f"Your new total is ${(tip+(((child_meal*actual_children)+(adult_meal*actual_adults))+(((((child_meal*actual_children)+(adult_meal*actual_adults))*tax_initial)/100))))}")
//
//change=((float(input("What is the payment amount in dollars ? ")))-(tip+(((child_meal*actual_children)+(adult_meal*actual_adults))+(((((child_meal*actual_children)+(adult_meal*actual_adults))*tax_initial)/100)))))
//
//print(f"Change: ${change}")