

**************************************				***********************************************
**************************************				***********************************************
1)			Class : Hotel							3) 			Class : WaitlistHandler
......................................				...............................................
Responsibilities  |  Collaborators							Responsibilities  |  Collaborators
......................................				...............................................
Register Customer .   WaitlistHandler				Maintain Waitlist i.e, add  .
i.e., add and 	  .								    or remove customers from    . Hotel
remove customer   .									list                        .
......................................				...............................................
Get the table     .   Table							front of the list i.e.,
state             .									the first customer in list   .  Customer
......................................				...............................................
Assign Customer to . Customer						handle the request from 
table												Hotel to send the message    .  Customer
**************************************				to front customer of list
**************************************				***********************************************
													***********************************************

***************************************				***********************************************
***************************************				***********************************************
2) 			Class : Table							4) 				Class : Customer
.......................................				...............................................
Responsibilities  |  Collaborators						    Responsibilities  |  Collaborators
.......................................				...............................................
Set status of table
i.e, the no. of seats. 								Name of the Customer
.......................................				...............................................
The current customer								Phone Number
on the table		.								...............................................
***************************************				No. of seats required
***************************************				...............................................
													Sign up for the waitlist  |  Hotel
													...............................................
													Respond to the table      
													ready message with        | Hotel
													'confirm' or 'leave'
													***********************************************
													***********************************************



1) I chose the chain of responsibility, as the hotel class
does not know which customer on waitlist is available 
and suitable for the table which is ready.

2) There are two models here, when a client requests to
signup the hotel sends an add message to WaitlistHandler 
to add the customer to the queue.

3) The hotel object gets the current status of the table
i.e., the number of seats available and if the table is
ready for a customer.

4) It then sends the message to the WaitlistHandler object
which sends the message to the first customer object in the 
waitlist, if the customer is willing to take it, the object
will respond with an appropriate message.

The hotel object plays the client role which initiates the request,
the WaitlistHandler is the parent handler class which holds info
on the list. The customer objects are the classes which actually
perform the task.

Client : Hotel
ConcreteHandler : WaitlistHandler
handling objects :  Customer Objects 