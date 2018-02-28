# LambdaFactory

A Demonstration of how to use an Abstract Factory without need of a switch/if chain using method references and the Supplier<T> class.

petfactory/PetTypes is where the magic happens. The child constructors are passed by method reference 
to the PetType enum and stored as a Supplier<Parent>, which is then used to return a new 
instance of the subclass matching a String.

Shout out to the legend [@git-leon](https://github.com/git-leon) 
