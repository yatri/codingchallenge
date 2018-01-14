#### How do you handle exception in JMS consumers and how to you recover?
JMSExcepltion is the generic class to handle exception of JMS API while sending and receiving message. It extends Exception Class. The exception could be due to server status and message. If message is corrupted the consumer should be notified the message. The exception could be not ready state of server.</br>
The exception could be transacted session failed during transaction either on creation of session or on committing session</br>

if transaction is failed to open and  when client called session commit then it will throw *TransactionRollBackException*
</br>
For Non Transaction Exception
	Exception during Acknowledge mode MessageConsumer.receiver could raise JMS exception. It can handle by calling Session.recover