## Advanced Java Study Guide

You should be able to explain and apply the following topics:

### Threads and Garbage Collection
- Lifecycle of a thread: new to runnable attempts to go to running, possibly to blocked and back to runnable then to running, once running finishes successfully to terminated
- Thread states: from new [created but not executing] possibly to blocked [waiting to enter a synchronized block or method currently in use elsewhere] or waiting [waiting for another thread to do something specific, without a time limit] or timed waiting [waiting to see if another thread does something specific within a time limit] to  runnable [either running or waiting for resources to run] to terminated [thread has finished execution]
- Creating threads: you can create a class that extends runnable [a functional interface], a class that extends thread, or create a lambda [extension of the functional interface method; lambas are an implementation of an interface]
- Thread class & thread methods- thread class is a class, meaning threads are separate objects and multiple methods are included when you extend threat, but it requires more memory than using runnable, includes getter and setter methods for ID, name and priority plus control methods like interupt, state testers like isAlive/isInterupted/isDaemon [a low priority background thread which cannot stop the JVM from exiting by continuing to run], join [which waits for a thread to finish execution] and start [which starts thread execution], alongside a method to return which thread is currently running and a sleep method used to make a thread temporarily stop execution for a set time in miliseconds
- Runnable interface: an interface which allows an alternative way of implementing a thread. Classes which extend Runnable can extend a class other than thread, which can be useful, and require less memory but that ties into their drawback: runnable is an interface so the only method classes inherit is an abstract run method
- Deadlock and ways to prevent it: deadlock is when multiple threads are blocked due to the same block condition; they are trying to gain exclusive access to the same resource at the same time and keeping each other blocked indefinitely. This is one reason to use the timed waiting state; eventually, the thread[s] will stop waiting and run despite the block condition still being true, so at least the program won't stall completely.
- Livelock: multiple threads are trying to provide information to another thread, and every time one thread sends info to another, a chain causes it to send *another* bit of info to that same thread, preventing work in all affected threads because they get caught in an infinite loop of messages caused by their own messages
- How to invoke Garbage Collection: removes objects from the heap which have no references to them, can be invoked via system.gc(), system.runfinalize(), runtime.getruntime().gc() or runtime.getruntime().runfinalize()

### Reflections API
- Benefits and purpose of Reflection API: effectively allows the code to acquire information about things in memory during runtime, or in other words it allows code to look at itself, potentially allowing runtime code manipulation
- Classes and interfaces
  - Class: part of java.lang but commonly used when using the reflections api so informally considered 'part of' reflections; contains get methods and a cast method used to cast the object as a representation of another object
  - Method: provides a representation of and access to a single method in a class, contains get methods and invoke which allows invocation of the underlying method represented by the method object
  - Modifier- class that provides static methods and constants for decoding modifiers on something else, contains static methods which accept static ints representing different possible modifiers provided by modifier and return a boolean value as to whether, i.e., the modifier it points to is native protected or so on
  - Parameter- represents information about a methods parameters, contains getter methods and an is method 
  - Constructor- provides representation of and access to a constructor method in a class, contains get methods
  - Field: access to single variable or field in a class, contains get methods as well as set methods for general use and specific ones for primitive datatypes 

### Java 8
- Functional interfaces: interfaces that only have one abstract method, meant to provide one specific function that can be applied to any class
- Lamdba functions: allows functional programming, which allows for the creation and execution of a method or function without dedicating a space in memory to that method

### JUnit
- Test-driven development (TDD): software development style where testing is used when each functional part of the program is completed to verify that piece will work as intended before moving onto the next part of the program, unit tests are written before the code has been written
- JUnit annotations
  - @Test: test method
  - @Before: setup method before each test
  - @After: tear down method after each class
  - @BeforeClass before but runs once before anything else
  - @AfterClass after but runs once after everything else
  - @Ignore stops the test after it from running
  - Order of execution of these annotated methods: beforeclass before test after > before test after > until out of unignored tests then afterclass
- Assert class methods: you can test to see if something is null, not null, true, false, an array whose values match the provided array, or if the return value is or is not equal to a provided value
- Testing best practices
  - Dependency injection: injecting mocked classes into a class being tested to fulfill required dependencies 
  - Writing testable code: code which is easily tested via automated code testing 
  - Mocking: using a special object that mimics behavior expected from a real object to test something which requires that other objects behavior for proper execution 
  - Measuring code coverage: how many lines of code are verified by test procedures; how comprehensive is validation
  - Externalize data: test data does not have to be hardcoded into the test case, so it should *not* be so that the test can be run with different data sets without having to modify the actual code for the test 

### Log4j
- Benefits / purpose of logging: allows developer to know what happened during execution; exports granular event log to a log file which can be checked later, critically a log file persists even if the program itself exits ungracefully [crashes], additionally a developer can include a logger in a product, typically set to log only critical or fatal events, and then any problems experienced by end users can be debugged by asking the end user to provide the generated log file.
- Log4j configuration: can be done with a configuration file or via the program itself 
- Log4j logging levels and threshold, all levels implicitly log those 'below' them
  - ALL - logs all events
  - DEBUG- logs informational events useful for active debugging
  - INFO- logs events used to track the progress of an application through its runtime behaviors at a course-grained [overview] level
  - WARN- logs *potentially* harmful events; things which *might* be a problem or might not depending on context
  - ERROR- logs events which are actual errors but may or may not actually stop the execution of a program
  - FATAL- logs events which are severe errors and are expected to cause runtime termination [also known as an ungraceful exit or a crash]
  - OFF- turns off logging; if a logger is included in production versions for use in supporting end users, best practice is to have it set to either fatal or off with a toggle to the other state, potentially a third setting allowing it to be set to error though it should not default that high to prevent unneccesary log file bloat

local variables *are* in stack,
garbage collection cannot be forced,
object.getclass gets class references for an object
don't catch the error thrown by an assertion, defeats point of having it
beforetest is not a valid annotation 
don't comment out tests that aren't passing, use an ignore statement to finish testing then fix the issue
runnable is not a class, you extend the thread class and override the start method
