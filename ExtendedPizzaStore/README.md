# ExtendedPizzaStore

## Initial Design
![](https://i.imgur.com/PqqeDBU.png)


## Refacor Design
![](https://i.imgur.com/dX86xro.png)

## Requirement
* In a pizza store system, two flavors of pizza are offered: ```Cheese Pizza``` and ```Pepperoni Pizza```.
* Each flavor of pizza can be categorized into two styles: ```New York Style``` and ```Chicago Style```.

* Each pizza style requires its own type of dough and sauce, for example,
```NY Style: Thin Crust Dough, Marinara Sauce```
```Chicago Style: Thick Crust Dough, Plum Tomato Sauce```


## Input
```
[flavor] [Pizza_style]
```
## Output
```
/*if [Pizza_style] is Chicago*/
Prepare [flavor] Pizza with ThickCrustDough and PlumTomatoSauce

/*if [Pizza_style] is NY*/
Prepare [flavor] Pizza with ThinCrustDough and MarinaraSauce

…
```

## Comment

```
[flavor] must be one of followings:
	Cheese
	Pepperoni 
[Pizza_style] must be one of followings:
	Chicago
	NY
```
