# GUIApplcation

## Initial Design
![Initial Design](/doc/GUIApplication.png)

## Refactor Design
![Refactor Design](/doc/GUIApplication_refactory.png)

## Spec
### Requirements Statements
- A GUI Application consists of various types of widgets such as window, scroll bar, and button.
- Each widget in the GUI application has two or more implementations according to different look-and-feel standards, such as Motif and Presentation Manager.
- The GUI application can switch its look-and-feel style from one to another while the widgets are being created.

### Input
```
[Widget_type] [Widget_name]//add widget
[look-and-feel_style]/*set [look-and-feel_style] as current style*/
Present /*extra command, show all widgets to standard output*/
…

```

### Output
```
Widgets must be shown with following rules:
	Window should be shown before ScrollBar.
	ScrollBar should be shown before Button.
If there are the same type widgets, show with the sequential order from input.

[Style_widget_type] [Widget_name]
…

```

### Comment
```
[Widget_type] must be one of followings:
	Window
	Button
  
[look-and-feel_style] must be one of followings:
	Motif
	PM
  
if current [look-and-feel_style] is Motif, [Style_widget_type] must be one of followings:
	MotifWindow
	MotifScrollBar 
	MotifButton
  
if current [look-and-feel_style] is PM, [Style_widget_type] must be one of followings:
	PMWindow
	PMScrollBar
	PMButton

The default [look-and-feel_style] is Motif.

You should read input from file. 
And show output to standard output. 

You are asked to write a main function in Class Main.
We'll test your program through "java Main inputFile"
e.g java Main sampleInput
```
