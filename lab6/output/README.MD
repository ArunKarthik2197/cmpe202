I have used the strategy pattern to print receipt and packing slip.
The PrintingStrategy interface has two concrete classes which are ReceiptStrategy and PackingSlipStrategy.    
The order class creates sets the customer order and prints using the strategies.
ReceiptStrategy prints the customer's order as taken, into the receipt and calculates the total price and tax.Prints the receipt.
PackingSlipStrategy prints the customer's order by performing a sort on the toppings and the patty.
It prints the order as required to be added on the buns by performing an alphanumeric sort.
    
    
    
       
    Output:
    
    RECEIPT

		FIVE GUYS		
Order Number : 1

1 LBB			5.59
 {{{{ Bacon }}}}
 Lettuce
 Tomato
 ->|G Onion
 ->|Jala Grilled
 
1 LTL CAJ		2.79


Sub.Total		$8.38
Tax			    $0.75
Total			  $9.13

Register:1				 TranSeq no:####
Cashier:Nura				
  ******************************  

		Packing Slip

Patties-1

Order Number: 1

		FIVE GUYS		
Sandwich#1
******************************************
1 LBB
******************************************
 Lettuce
 Tomato
 ->|G Onion
 ->|Jala Grilled
 {{{{ Bacon }}}}
******************************************
1 LTL CAJ
******************************************

Register:1				 TranSeq no:####
Cashier:Nura
