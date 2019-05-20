# GUIApplcation

## Initial Design

## Refactor Design

## Spec
### Requirements Statements
- Patternsland wants to build a vacation planner
- A vacation planner can choose a hotel and various types of admission tickets, make restaurant reservations, even book special events and day. The different types of vacations, such as normal and backpacking, can have different options.

### Input
```
[Vacation_type]
Day [day]
SpecialEvent [event]
Hotel [hotel]
Reservation [reservation]
Tickets [tickets]
// input order could be different from above.

…
```

### Output
```
[Vacation_type]Vacation
Day:[day]
Hotel:[hotel]
Reservation:[reservation]
SpecialEvent:[event]
Tickets:[tickets]
//output order must be the same as above.
```

### Comment
```
[Vacation_type] must be one of followings:
	Normal
	Backpacking
```

You should read input from file. 
And show output to standard output. 

You are asked to write a main function in Class Main.
We'll test your program through "java Main inputFile"
e.g java Main sampleInput
