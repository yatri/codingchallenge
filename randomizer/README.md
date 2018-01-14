 output Class has number and flag for prime by default it is false
 Here i used ConcurrentLinkedQueue because it handle concurency and thread safe and can used for producer consumer

 Here is two queue one for input queue and another is output queue

 Prime is class which implement runnable interface and has two queue
 it takes input number from inputqueue and call function checkprime and it send data to output queue

 Randomizer generate data from random method and put it to inputqueue
 after sleeping thread print data from output queue in randomizer