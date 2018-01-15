#### How would you implement Executor Service? 

ExecuterService is a interface that represent asynchronous task which is capable of execution of background task. It is similar to threadpool 
Implementation Example </br>

```java
ExecutorService executorService = Executors.newFixedThreadPool(10);

executorService.execute(new Runnable() {
    public void run() {
        System.out.println("Asynchronous task");
    }
});

executorService.shutdown();
```
 #### ExecutorService Usage
 Different type of delegation methods of ExecutorService as as follows
 * execute(Runnable)
 * submit(Runnable)
 * submit(Callable)
 * invokeAny(...)
 * invokeAll(…)

```java
 ExecutorService executorService = Executors.newSingleThreadExecutor();

executorService.execute(new Runnable() {
    public void run() {
        System.out.println("Asynchronous task");
    }
});

executorService.shutdown();
```

#### submit(Runnable)
The submit(Runnable) method also takes a Runnable implementation, but returns a Future object. This Future object can be used to check if the Runnable as finished executing. 
Here is a ExecutorService submit() example:
```java 
Future future = executorService.submit(new Runnable() {
    public void run() {
        System.out.println("Asynchronous task");
    }
});


future.get();  //returns null if the task has finished correctly.</br>

```
#### submit(Callable)

The submit(Callable) method is similar to the submit(Runnable) method except for the type of parameter it takes. The Callable instance is very similar to a Runnable except that its call() method can return a result. The Runnable.run() method cannot return a result. 
The Callable's result can be obtained via the Future object returned by the submit(Callable) method. Here is an ExecutorService Callable example: 
```java
Future future = executorService.submit(new Callable(){
    public Object call() throws Exception {
        System.out.println("Asynchronous Callable");
        return "Callable Result";
    }
});

System.out.println("future.get() = " + future.get());
```
#### invokeAny()
The invokeAny() method takes a collection of Callable objects, or subinterfaces of Callable. Invoking this method does not return a Future, but returns the result of one of the Callable objects. You have no guarantee about which of the Callable's results you get. Just one of the ones that finish. 
If one of the tasks complete (or throws an exception), the rest of the Callable's are cancelled. 
Here is a code example: 
```java
ExecutorService executorService = Executors.newSingleThreadExecutor();

Set<Callable<String>> callables = new HashSet<Callable<String>>();

callables.add(new Callable<String>() {
    public String call() throws Exception {
        return "Task 1";
    }
});
callables.add(new Callable<String>() {
    public String call() throws Exception {
        return "Task 2";
    }
});
callables.add(new Callable<String>() {
    public String call() throws Exception {
        return "Task 3";
    }
});

String result = executorService.invokeAny(callables);

System.out.println("result = " + result);

executorService.shutdown();
```