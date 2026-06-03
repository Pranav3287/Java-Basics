package Test;

interface Printable {
 void print(); 
}

class Document implements Printable {
 private String text;

 public Document(String text) {
     this.text = text;
 }

 @Override
 public void print() {
     System.out.println("--- Sending to Printer ---");
     System.out.println(text);
     System.out.println("--------------------------");
 }
}

public class Test4 {
 public static void main(String[] args) {
     Document myDocument = new Document("Hello, World! This is a test document.");
     myDocument.print();
 }
}
