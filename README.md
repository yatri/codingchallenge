#### Describe properties of Java String

String is a class and immutable object. It can be created two way using object creation and another is string pool <br />
String str = “Hello World” <br />
String str = new String (“Helloworld”) <br />
In first case the string is created in String pool if we create new string having same content it doesnot create new it reference old one.<br />
If we create new String using new keyword it will create new object reference on heap memory. <br />
String is not thread safe. If we want to create thread safe we can use StringBuffer. <br />
StringBuilder is also mutable but it is not synchronized and not thread safe. <br />
It has lots of inbuilt functions <br />
if we do == then it checks memory reference but if we compare using method .equals then it compare contents. 