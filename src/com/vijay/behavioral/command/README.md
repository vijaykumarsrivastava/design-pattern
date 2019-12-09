* [Home](../../../../../README.md)
# Command Pattern

#### Definition

The Command pattern is used to create objects that represents actions and
events in an application. A command object encapsulates an action or event
and contains all information required to understand exactly what has
happened. By passing the command object as a parameter we can, anywhere
needed extract information about occurred actions and events.

#### Where to use

* Where you want a action that can be represented in many ways, like drop-
down menu, buttons and popup menu.
* To create undo/redo functionality.

#### Benefits

* A command object is a possible storage for procedure parameters. It can be
used while assembling the parameters for a function call and allows the
command to be set aside for later use.
* A class is a suitable place to collect code and data related to a specific
action or event.
* It allows the reaction to a command to be executed some time after it has
occurred.
* Command objects enables data structures containing multiple commands.
* Command objects supports undo-able operations, provided that the
command objects are stored (for example in a linked list).

#### Drawbacks/consequences

The main disadvantage of the Command pattern seems to be a proliferation
of little classes that clutter up the program. However, even in the case
where we have separate click events, we usually call little private methods
to carry out the actual function. It turns out that these private methods are
just about as long as our little classes, so there is frequently little difference 
in complexity between building the Command classes and just writing more
methods. The main difference is that the Command pattern produces little
classes that are much more readable.

* [Home](../../../../../README.md)
