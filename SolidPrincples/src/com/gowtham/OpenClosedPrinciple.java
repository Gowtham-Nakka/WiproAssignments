<<<<<<< HEAD
=======
<<<<<<< HEAD
package com.gowtham;

abstract class Message {
    abstract String getMessage();
}

class TextMessage extends Message {
    public String getMessage() {
        return "This is a text message.";
    }
}

class EmailMessage extends Message {
    public String getMessage() {
        return "This is an email message.";
    }
}

public class OpenClosedPrinciple {
    public static void main(String[] args) {
        Message text = new TextMessage();
        Message email = new EmailMessage();

        System.out.println(text.getMessage());
        System.out.println(email.getMessage());
    }
}
=======
>>>>>>> my-feature-branch
package com.gowtham;

abstract class Message {
    abstract String getMessage();
}

class TextMessage extends Message {
    public String getMessage() {
        return "This is a text message.";
    }
}

class EmailMessage extends Message {
    public String getMessage() {
        return "This is an email message.";
    }
}

public class OpenClosedPrinciple {
    public static void main(String[] args) {
        Message text = new TextMessage();
        Message email = new EmailMessage();

        System.out.println(text.getMessage());
        System.out.println(email.getMessage());
    }
}
<<<<<<< HEAD
=======
>>>>>>> af4bfed9 (added all the files)
>>>>>>> my-feature-branch
