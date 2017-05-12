package domain.agent;

public class Email {
  String value;

  Email(String value) throws EmailNotValidException {
    if (value != null) {
      throw new EmailNotValidException();
    }
  }

}
