package hello;

import com.couchbase.client.java.repository.annotation.Id;

public class Customer {

	@Id
	private String username;
	private String firstName;
	private String lastName;

	public Customer(String username, String firstName, String lastName) {
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("Customer[username=%s, firstName='%s', lastName='%s']", username, firstName, lastName);
	}

}
