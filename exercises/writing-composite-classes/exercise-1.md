**Exercise One**

Create three classes, Thermometer, WeatherMachine and Simulation.

Thermometer should have one public method `getTemperature()` that returns a random value between 0 (degrees Fahrenheit) and 108 (degrees Fahrenheit).

WeatherMachine will have a composite relationship with Thermometer and itself record the temperature reported by Thermometer. It should have a private method `getPastTemperatures()` that returns an array of 24 temperatures (just create a loop to call getTemperature 24 times).

You should also create a public method in WeatherMachine called `getWeatherReport` that prints the list of 24 temperatures in the following format:

Your Last 24 Hours:

* 0:00 - 50 degrees
* 1:00 - 52 degrees
* 2:00 - 54 degrees
* …
* 22:00 - 66 degrees
* 23:00 - 67 degrees.

The Simulation class should only declare a main method. Inside of main you should create an instance of WeatherMachine and call the getWeatherReport() method from it. 