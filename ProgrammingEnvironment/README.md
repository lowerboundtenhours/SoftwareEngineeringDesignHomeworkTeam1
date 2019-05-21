# ProgrammingEnvironment
## Requirement
* A compiler subsystem contains classes such as Scanner, Parser, ProgramNode, and BytecodeStream.
* The client classes need to use Scanner, Parser, ProgramNode, and BytecodeStream to compile some code. 

## Spec
```
# output
Parsing.....
Scanning.....
Construct Program Node
Output bytecode.....
```
## Initial Design
![](https://i.imgur.com/ukFdOLU.png)

## My Design

### What varies?
* compiler toolkit
* client's demand of toolkit in compiler system

![](https://i.imgur.com/slBYtmE.png)
