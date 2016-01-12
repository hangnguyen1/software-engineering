# software-engineering
humane society website for pet lovers

BUSINESS MODEL OF THE HUMANE SOCIETY

Humane Societies are nonprofit charitable organizations supported in part or entirely by voluntary donations and dedicated to the promotion of animal welfare throughout a region. Humane Societies are helping to prevent cruelty to animals, provide care for homeless and distressed animals, promote spaying and neutering, educate the public in proper animal care, and related humane issues. 
Following are the services Humane Societies provide:

1. Adoptions and Receiving Service: Over 1,000 animals come to the organizations each year and good homes with carefully screened, concerned, qualified owners are found for a large percentage. 

2. Lost And Found Service: successful reunion of lost pets with their owners. Humane Societies act like an intermediary between the one who lost the pet and the one who finds it. 

3. Hurricane / Disaster Preparedness for Pets Service: helping people and inform them how to prepare their pets for a disaster.

4. Animal Population Control Services (Spay / Neuter): Sterilization is required for every animal adopted from a shelter.

5. Legislative Activities Services: Humane Societies work actively with other local, regional and national humane organizations in promoting legislation aimed at alleviating animal suffering.
To support the services and make them popular to everybody in the region, Humane Societies need assistance of computer system. For example, the adoption service needs to display all pets and allows a customer to select one pet and book the selection for 24 hours (until the adoption paper work is signed). Also, the receiving service has to allow a customer to inform the staff that he/she brings a pet or more. The software also includes a way to inform the Humane Society that a pet was lost and facilitates the connection with the one who found it.

In detail, the system needs to meet these requirements:

1. To hold information about pets and their services. 

1.1. To register online or in person as a customer looking to adopt a pet or to return a pet; 

1.2. To record the details of losing and finding a pet and to perform the connection between these two persons. 

1.3. To inform the customer about the hurricane/disaster preparedness related to pets. 

1.4. To inform the customer about the animal population control. 

1.5. To inform the customer about the legislative activities related to pets. 

2.To analyze the history of pets’ services and estimate what people will most likely choose in the future. 

2.1. If a customer has a preferred choice of a pet, the Humane Societies offer periodically information related to the pets to retain the customer and help him/her decide adopting the pet. 

2.2. To promote the national spirit of adopting a pet and take the responsibility to take care of a pet, and so on. 

3.The system must be able of future expansion to incorporate information about existing Humane Societies and how to expand them in the future

USE CASE DESCRIPTION
Actors are customer, registered customer and staff.

* Use case: Register (for customer)

Basic course of events:

1.	The user enters his/her name, phone number, address, and email.

2.	The system validates the email and phone number

3.	The user details are saved in the file system.

4.	The customer log in the system.

The alternative course of events:

1.	(alternative of 2) The email address format is incorrect;
(sub-alternative) The system notifies the user to enter correctly. The use case continues at step 2.

2.	(alternative of 2) The phone number format is incorrect;
(sub-alternative) The system notifies the user to enter correctly. The use case continues at step 2.

* Use case: Donate (for customer)

Basic course of events:

1.	The user enters credit card number, date, authentication information.
	
2.	The system validates the credit card.
	
3.	The system charges credit care full amounts.
	
4.	The user is given a unique confirmation number and receipt.
	
The alternative course of events:

1.	(alternative of 2) The card is not of the type accepted by system;
(sub-alternative) System notifies user to use different card. The use case continues at step 2.

2.	(alternative of 2) The card is expired;
(sub-alternative) System notifies user to use different card. The use case continues at step 2.

3.	(alternative of 2) The card has insufficient available credit;
(sub-alternative) System notifies user to use different card. The use case continues at step 2.

* Use case: Adopt Pet (for registered customer)

Basic course of events:

1.	The user search the pet for adoption.

2.	The system displays searched pet details.

3.	The user selects the pet.

4.	The system asks for confirmation.

5.	The user is given a unique confirmation number.

Alternative course of events:

1.	(alternative of 1) The search criteria does not show any result.
(sub-alternative) The system notifies user to modify search. Use case continues at step 1.

2.	(alternative of 4) The system asks for confirmation. If “no”, use case terminates. 

*	Use case: Give Pet (for registered customer)

Basic course of events:

1.	The user enters pet details.

2.	The system displays pet details and ask for confirmation.

3.	The user is given a unique confirmation number.

Alternative course of events:

1.	(alternative of 1) The pet details entered are incorrect;
(sub-alternative) The system notifies user to enter detail correctly. Use case continues at step 1.

2.	(alternative of 2) The system asks for confirmation. If “no”, use case terminates. 

*	Use case: Inform Lost Pet (for registered customer)

Basic course of events:

1.	The user enters lost pet details.

2.	The system displays pet details and asks for confirmation.

3.	The user confirms.

4.	The system displays “search found pet” option.

5.	The user performs Search Found Pet.

Alternative course of events:

1.	(alternative of 1) The pet details entered are incorrect;
(sub-alternative) The system notifies user to enter detail correctly. Use case continues at step 1.

2.	(alternative of 2) The system asks for confirmation. If “no”, use case terminates. 

*	Use case: Search Found Pet (for registered customer)

Basic course of events:

1.	The user searches found pet.

2.	System displays a list of found pets matching searched criteria.

3.	User chooses a pet in the list.

4.	System displays details of the person who found this pet.

Alternative course of events:

1.	(alternative of 1) The search criteria does not show any result.
(sub-alternative) Use case terminates.

*	Use case: Inform Found Pet (for registered customer)

Basic course of events:

1.	The user enters found pet details.

2.	The system displays pet details and asks for confirmation.

3.	The user confirms.

4.	The system displays “search lost pet” option.

5.	The user performs Search Lost Pet.

Alternative course of events:

1.	(alternative of 1) The pet details entered are incorrect;
(sub-alternative) The system notifies user to enter detail correctly. Use case continues at step 1.

2.	(alternative of 2) The system asks for confirmation. If “no”, use case terminates. 

*	Use case: Search Lost Pet (for registered customer)

Basic course of events:

1.	The user searches lost pet.

2.	System displays a list of lost pets matching searched criteria.

3.	User chooses a pet in the list.

4.	System displays details of the person who lost this pet.

Alternative course of events:

1.	(alternative of 1) The search criteria does not show any result.
(sub-alternative) Use case terminates.

*	Use case: Search Info (for customer)

Basic course of events:

1.	User chooses in option list which information to search. Options are “future expansion”, “disaster preparedness”, “legislative activities”, “promote national spirit” and “population control”.

2.	System displays the requested information.

*	Use case: Future Expansion (for staff)

Basic course of events:

1.	Staff adds or modifies information about future expansion.

2.	System displays this information.

*	Use case: Disaster Preparedness (for staff)

Basic course of events:

1.	Staff adds or modifies information about disaster preparedness.

2.	System displays this information.

*	Use case: Legislative Activities (for staff)

Basic course of events:

1.	Staff adds or modifies information about legislative activities.

2.	System displays this information.

*	Use case: Promote National Spirit (for staff)

Basic course of events:

1.	Staff adds or modifies information about promote national spirit.

2.	System displays this information.

*	Use case: Population Control (for staff)

Basic course of events:

1.	Staff adds or modifies information about population control.

2.	System displays this information.
 	
Design pattern in this project is general-hierarchy pattern.

