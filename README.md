# design-pattern

#### Creational Patterns

"Creational design patterns are design patterns that deal with object
creation mechanisms, trying to create objects in a manner suitable to the
situation. The basic form of object creation could result in design problems
or added complexity to the design. Creational design patterns solve this
problem by somehow controlling this object creation."

All the creational patterns define the best possible way in which an object
can be created considering reuse and changeability. These describes the best
way to handle instantiation. Hard coding the actual instantiation is a pitfall
and should be avoided if reuse and changeability are desired. In such
scenarios, we can make use of patterns to give this a more general and
flexible approach.
* Factory
* Abstract Factory
* [Builder](src/com/vijay/creational/builder/README.md)
* [Prototype](src/com/vijay/creational/prototype/README.md)
* [Singleton](src/com/vijay/creational/singleton/README.md)

#### Structural Patterns

"In software engineering, structural design patterns are design patterns
that ease the design by identifying a simple way to realize relationships
between entities."

Structural Patterns describe how objects and classes can be combined to
form structures. We distinguish between object patterns and class patterns.
The difference is that class patterns describe relationships and structures
with the help of inheritance. Object patterns, on other hand, describe how
objects can be associated and aggregated to form larger, more complex
structures.
* Adapter
* Bridge, 
* [Composite](src/com/vijay/structural/composite/README.md)
* Decorator
* Facade
* Flyweight 
* Proxy

#### Behavioral Design Patterns

"In software engineering, behavioral design patterns are design patterns
that identify common communication patterns between objects and realize
these patterns. By doing so, these patterns increase flexibility in carrying
out this communication."

Behavioral patterns are patterns that focuses on the interactions between
cooperating objects. The interactions between cooperating objects should be
such that they are communicating while maintaining as loose coupling as
possible. The loose coupling is the key to n-tier architectures. In this, the
implementation and the client should be loosely coupled in order to avoid
hard-coding and dependencies.
* Chain-of-responsibility
* [Command](src/com/vijay/behavioral/command/README.md)
* Iterator
* Mediator
* Memento
* Observer
* State and Strategy

