package org.myfly.platform.core.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.myfly.platform.core.utils.JSONUtil;

public class JacksonObjectMapperExample {
	public static void main(String[] args) throws IOException {
		
		/**
		// create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();

		// convert Object to json string
		Employee emp1 = createEmployee();
		// configure Object mapper for pretty print
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		String stringEmp = objectMapper.writeValueAsString(emp1);
		System.out.println("Employee JSON is\n" + stringEmp);

		// convert json string to object
		Employee emp = objectMapper.readValue(stringEmp, Employee.class);

		System.out.println("Employee Object\n" + emp);
		*/
		
		Employee emp1 = createEmployee();
		String stringEmp = JSONUtil.toJSON(emp1);
		System.out.println("Employee JSON is\n" + stringEmp);
		
		Employee emp = JSONUtil.fromJSON(stringEmp, Employee.class);
		System.out.println("Employee Object\n" + emp);
	}
	
	@Test
	public void test(){
		Employee emp1 = createEmployee();
		String stringEmp = JSONUtil.toJSON(emp1);
		System.out.println("Employee JSON is\n" + stringEmp);
		
		Employee emp = JSONUtil.fromJSON(stringEmp, Employee.class);
		System.out.println("Employee Object\n" + emp);
	}

	public static Employee createEmployee() {

		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("David");
		emp.setPermanent(false);
		emp.setPhoneNumbers(new long[] { 123456, 987654 });
		emp.setRole("Manager");

		Address add = new Address();
		add.setCity("Bangalore");
		add.setStreet("BTM 1st Stage");
		add.setZipcode(560100);
		emp.setAddress(add);

		List<String> cities = new ArrayList<String>();
		cities.add("Los Angeles");
		cities.add("New York");
		emp.setCities(cities);

		Map<String, String> props = new HashMap<String, String>();
		props.put("salary", "1000 Rs");
		props.put("age", "28 years");
		emp.setProperties(props);

		return emp;
	}

	public static class Employee {

		private int id;
		private String name;
		private boolean permanent;
		private Address address;
		private long[] phoneNumbers;
		private String role;
		private List<String> cities;
		private Map<String, String> properties;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isPermanent() {
			return permanent;
		}

		public void setPermanent(boolean permanent) {
			this.permanent = permanent;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public long[] getPhoneNumbers() {
			return phoneNumbers;
		}

		public void setPhoneNumbers(long[] phoneNumbers) {
			this.phoneNumbers = phoneNumbers;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("***** Employee Details *****\n");
			sb.append("ID=" + getId() + "\n");
			sb.append("Name=" + getName() + "\n");
			sb.append("Permanent=" + isPermanent() + "\n");
			sb.append("Role=" + getRole() + "\n");
			sb.append("Phone Numbers=" + Arrays.toString(getPhoneNumbers()) + "\n");
			sb.append("Address=" + getAddress() + "\n");
			sb.append("Cities=" + Arrays.toString(getCities().toArray()) + "\n");
			sb.append("Properties=" + getProperties() + "\n");
			sb.append("*****************************");

			return sb.toString();
		}

		public List<String> getCities() {
			return cities;
		}

		public void setCities(List<String> cities) {
			this.cities = cities;
		}

		public Map<String, String> getProperties() {
			return properties;
		}

		public void setProperties(Map<String, String> properties) {
			this.properties = properties;
		}
	}

	public static class Address {
		private String city;
		private String street;
		private int zipcode;

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public int getZipcode() {
			return zipcode;
		}

		public void setZipcode(int zipcode) {
			this.zipcode = zipcode;
		}
	}
}
