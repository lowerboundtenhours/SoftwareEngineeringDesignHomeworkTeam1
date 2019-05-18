# Schematic Capture Systems

### Initial Design
![Initial Design](/doc/Initial_Design.png)

### Refactor Design
![Refactor Design](/doc/Refactor_Design.png)

## Spec
### Requirements Statements
In schematic capture application,
- There are some basic components that can be drawn such as Text, Line and Rectangle.
- The user can group basic components to form larger components, which in turn can be grouped to form still larger components.

### Input
```
// The input file format is XML
<?xml version="1.0"?>
<Question>
	<[Basic_Component]/>
	…
	[Larger_Component]
	…
</Question>
```

### Output
```
[Basic_Component]
…
Group:{[Basic_Component]…}
…
```

### Comment
```
[Basic_Component] must be one of followings:
	Line
	Text
	Rectangle
	Group

[Larger_Component] must be the following:
<Group>
	<[Basic_Component]/>
	…
	[Larger_Component]
	…
</Group>

The input file format is XML.

The Sample input / output file are in the folder.

You are asked to write a main function in Class Main
We'll test your program through "java Main inputFile"
e.g. java Main sampleInput
```
