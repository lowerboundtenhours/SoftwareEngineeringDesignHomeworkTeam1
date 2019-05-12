# Powerful Document Viewer

## Initial Design
![Initial Design](/doc/Initial_Design.png)

## Refactor Design
![Refactor Design](/doc/Refactor_Design.png)

## Spec
### Requirements Statements
- A powerful application can present multiple documents at the same time.
- These documents include DrawingDocument, TextDocument, and so on.
- The application is responsible for managing documents and creating them as required. 

### Input
```
[Create_document_type]
Present /*extra command, show all documents to standard output with the 
sequential order from input*/
…

```

### Output
```
[Type_Document]
…

```

### Comment
```
[Create_document_type] must be one of followings:
- Draw
- Text

[Type_Document] must be one of followings:
- DrawingDocument
- TextDocument

You should read input from file. 
And show output to standard output. 

You are asked to write a main function in Class Main.
We'll test your program through "java Main inputFile"
e.g java Main sampleInput
```
