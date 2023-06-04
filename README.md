# WarCardGame

This was a group project.
Here is a link to the actual repository.
https://github.com/kaushalptel/Group8_Project1.git

A War game is played between two players with a deck of 52 cards. Both player must enter name. In case second player write same name as first player, "GUEST" name will automatically assigned to second player. The player who gets all the 52 cards will be the winner.

The card of the game includes ranks of 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, and Ace in ascending order. The deck of cards is shuffled and then distributed (face down) equally between the players (26 cards per player). Each player keeps their deck of cards faces down in front of them. Each player flips 1 card from the top of the deck at the same time. The player with the highest rank collects both cards and puts those at the bottom of their deck. The player with all cards collected wins the game.

Rules:
•	If the flipped cards of both players have the same rank, then it's called war. Each player will put three more cards face down and a fourth card face up. Based on the fourth card’s rank, the player with a higher rank will collect all ten cards and the game continues.
•	During the war, if the fourth card has the same rank, each player will repeat the process by placing another three cards face down on the top of already placed cards and comparing the rank with the fourth card. The player with higher ranks collects all cards.
•	During the war, if one player ran out of the cards, the other will collects all the cards and win the game.

•	Encapsulation:
Encapsulation is done by keeping the data fields private. For Example, attributes of classes Cards, Game, Player, Players, and GroupOfCards are private and can be accessed through their specific getter and setter methods. If any class need to access attributes of other class, they can do so through their specific methods.

•	Delegation:
Delegation improves the efficiency of the code. It helps to achieve high cohesiveness. Due to some sort of reason when the code is changed that changed code will not affect the whole program, which increases the system maintainability. For example, the CardGenerator class is delegated from the card to perform a specific task. When the CardGenerator class is modified or removed from the project that change will not affect the whole program.

•	Cohesion:
High cohesion is a good principle to implement in code. This means each class will be focused on their specific tasks. Any changes in one class neither will affect any other class nor its parent class. For example, GroupOfCards class is extended from the Cards class. GroupOfCards class is focused on distributing 26 cards to each player, whereas the Cards class contains all cards. Both are focused on their specific task. Any code in GroupOfCards will not affect Card’s class functionality.

•	 Coupling: 
Our group has achieved Loose coupling by implementing enumeration for the card’s rank and suit in Cards class. Now the code can be extended for any type of other card game.

•	 Inheritance:
Inheritance is designed to avoid redundancy and to maintain the code easily. It is a separation of concerns, whereby we start with a more general class called the base class and derive a more specialized class (subclass). When we extend a class, the derived class inherits all the non-private code from the base class and so we have accomplished reuse by design

•	Composition: 
As GroupOfCards subclass can not exist without the Cards parent class, but the Cards class can exist without GroupOfCards class. This relationship implements composition. If we delete the Cards class, GroupOfCards class would not exist.

•	 Flexibility/Maintainability: 
Flexibility is achieved by implementing the concept of high cohesion and loose coupling. Each class is focused on a particular task. For Example, GamePlay is extending the abstract class Game. GamePlay class will implement the abstract methods of Game class including declareWinner () and play (). So, if we make any changes in subclass GamePlay, it would not affect its parent class (abstract class Game). Thus, all the classes maintain flexibility and maintainability.
