#### How do you handle exception in JMS consumers and how to you recover?
IllegalStateException
This exception is thrown when a method is invoked at an illegal or inappropriate time or if the provider is not in an appropriate state for the requested operation. For example, this exception must be thrown if Session.commit is called on a non-transacted session. This exception is also called when a domain inappropriate method is called, such as calling TopicSession.CreateQueueBrowser. </br>
InvalidClientIDException<br>
This exception must be thrown when a client attempts to set a connection's client ID to a value that is rejected by a provider. <br>
likewise other jms excepptions are

* InvalidDestinationException

* InvalidSelectorException

* JMSSecurityException

* MessageEOFException

* MessageFormatException

* MessageNotReadableException

* MessageNotWriteableException

* ResourceAllocationException

* TransactionInProgressException

* TransactionRolledBackException

reference
https://docs.oracle.com/cd/E19798-01/821-1841/bncez/index.html

