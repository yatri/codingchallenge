#### How do you design an application with JMS messaging?

Basically Designing of application with jms contain following steps


* Creating a JNDI InitialContext object
```java
Hashtable  env = new Hashtable();
env.put(Context.INITIAL_CONTEXT_FACTORY,
        "com.sun.jndi.fscontext.RefFSContextFactory");
env.put(Context.PROVIDER_URL, "file:///C:/imq_admin_objects");
Context  ctx = new InitialContext(env);
```

* Looking up a connection factory and a queue
	```java
	String  CF_LOOKUP_NAME = "MyConnectionFactory";
    ConnectionFactory  myFactory = (ConnectionFactory) ctx.lookup
                                          (CF_LOOKUP_NAME);	```

* Creating connection, or session
```java
Connection
      myConnection = myFactory.createConnection("mithrandir", "mellon");
      myConnection.createSession(false, Session.AUTO_ACKNOWLEDGE);
      myConnection.start();
```
* Creating a receiver, and then starting message delivery
```java
TextMessage
   outMsg = mySession.createTextMessage("Hello, World!");
   MessageConsumer consumer = session.createConsumer(dest);
	MessageConsumer consumer = session.createConsumer(queue);
	MessageConsumer consumer = session.createConsumer(topic);
```

* Receiving all text messages from the queue
```java
Message m = consumer.receive();
if (m instanceof TextMessage) {
    TextMessage message = (TextMessage) m;
    System.out.println("Reading message: " + message.getText());
} else {
    // Handle error
}
```

* Closing the connection
```java
connection.close();
```

reference
https://docs.oracle.com/cd/E19717-01/819-7757/aeqbm/index.html
