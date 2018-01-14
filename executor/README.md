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