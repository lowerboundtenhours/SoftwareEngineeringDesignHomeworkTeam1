# Chocolate Boiler

## Initial Design
![Initial Design](/doc/InitialDesign.png)

## Refactor Design
![Refactor Design](/doc/RefactorDesign.png)

## State Diagram
![State Diagram](/doc/StateDiagram.png)

## Spec
### Requirements Statements
* A chocolate boiler is used to boil chocolate.
* Before boiling chocolate with the boiler, you have to make sure that the boiler is now empty and then fill chocolate in. Besides, you can’t boil chocolate again while the chocolate has already been boiled.
* After boiling, drain out the boiled chocolate and make the boiler empty again.
* In order to prevent some unexpected situation, it is not allowed to have multiple instances of the chocolate boiler in the system.


### Input
```
[Boil_chocolate_step]
…
```

### Output
```
//if [Boil_chocolate_step] is Fill
Fill chocolate

//if [Boil_chocolate_step] is Boil
Boil chocolate

//if [Boil_chocolate_step] is Drain
Drain the boiled chocolate

…
```

### Comment
```
[Boil_chocolate_step] must be one of followings:
	Fill
	Boil
	Drain

According to requirement to determine whether  [Boil_chocolate_step] could happen.
You are asked to write a main function in Class Main
We'll test your program through "java Main inputFile"
e.g java Main sampleInput

You should read input from file.
And show output to standard output.

```

## Author
Ya_Liang Chang (Allen) [amjtlc295](https://github.com/amjtlc295)
