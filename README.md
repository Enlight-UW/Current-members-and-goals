# Current-members-and-goals
Repo to use to display the orgs current projects, and goals for those projects. As well as a repo for new members to practice git by adding their name to the member list.

# Drone project:
(Add your name to this list if you are going to be part of the drone project!)
- Cameron Hall
- Tom Schutte
- Sam Schwebach (on both temporarily)
- Michael Ciancimino
- Mackenzie Kilness
- Brian Newberry

# Magic Mirror project:
(Add your name to this list if you are going to be part of the magic mirror project!)
- Arel Otles
- Tom Schutte
- Sam Schwebach (on both temporarily)
- James Mai
- Riley Morrison
- Vinay Janardhanam
- Justin Schrimmer
- Kyle Klassy
- Bo Clow

# Interview Questions and their Answers:
First some general resources...<br>
<a href="https://github.com/cassidoo/getting-a-gig">This github repo has a ton of great info and links.</a><br>
<a href="http://rosettacode.org/wiki/Rosetta_Code">The wikipedia of coding algorithms. A great way to practice your algo programming</a><br>
<a href="https://github.com/h5bp/Front-end-Developer-Interview-Questions">Web development specific questions</a>

## 04-10-2016: Come up with an algorithm that will return the 'n'th element in the fibonacci sequence.
<br>Example input:  0, 1, 2, 3, 4, 5...
<br>Example output: 1, 1, 2, 3, 5, 8...
<br>For a example solution, <a href="https://github.com/UW-Enlight/Current-members-and-goals/blob/master/fib.py">Look here..</a> note this is not the only way to do this...
Follow up questions: 
- Can you do it a different way?
- Is your way the most efficient?

## 11-10-2016: Come up with and algorithm to compress an input of characters.
<br>For example, if I give you aaaaaaaaabbbbbbaaaaaccccccccfffffhhhhhh
<br> how would you compress that string?
<br> Does your implementation have a worst case senario? How does it handle it?
<br> What is the big O run time of your solution?
<br>Example solution can be found <a href="https://github.com/UW-Enlight/Current-members-and-goals/blob/master/compression.java">Here</a>

## 18-10-2016: Explain the differance between a Java Abstract class, and a Java Interface.
<a href="http://stackoverflow.com/questions/1913098/what-is-the-difference-between-an-interface-and-abstract-class">See the first and second answer here.</a>

## 25-10-2016: Define the following terms, and their give and example of when you would use them.
- Polymorphism
- Inheritance
- Autoboxing
- struct vs object
- Interface
- static
- public vs private
- final / const
- big O notation
- Assembly vs machine code vs programming language
- what actually happens with an import / #include / using statement?

It will be left to the group / you to come up with or google the definitions.

## 1-11-2016: How would you design a stack which, in addition to push and pop, also has a function min which returns the minimum element? Push, pop and min should all operate in O(1) time.

The answer that comes to mind first is likely having a minValue integer that stores the current minimun value in the stack but if the minimum value is popped off of the stack then you would have to search the stack again for the new minimum value.  The way to get around this is to store minimum values in a stack alongside your original stack. The way this works is: when you push to your stack check it against the minValue int. If it is less than or equal to the minValue then also push it to your minimum value stack. When you pop from the stack, check against minValue and if it is equal to the minvalue pop it off of the minimum value stack as well.

I may add an implememtation to this later.

## 8-11-2016: Using a Stack data structure, create a Queue (FIFO). Then do the reverse, using a Queue (FIFO) creaet a Stack.
- Follow up, how many data structures do you need for each?
- What are the normal big O run times for the operations, and what are they in your implementation? Can yours be made better?
- Are there any advantages or disadvantages to your way? Are there any advantages or disadvantages to implementing a data structure like this (using a different one)?
- <a href="http://stackoverflow.com/questions/688276/implement-stack-using-two-queues">Queue using stacks here</a>
- <a href="http://stackoverflow.com/questions/69192/how-to-implement-a-queue-using-two-stacks">Stack using queues here</a>
