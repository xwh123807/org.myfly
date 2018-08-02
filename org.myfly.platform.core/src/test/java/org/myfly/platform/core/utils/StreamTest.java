package org.myfly.platform.core.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;

/**
 * java 流式编程测试
 * 
 * @author xiangwanhong
 *
 */
public class StreamTest {
	@Test
	public void streamBuilder() {
		// 1. Individual values
		Stream<String> stream = Stream.of("a", "b", "c");
		// 2. Arrays
		String[] strArray = new String[] { "a", "b", "c" };
		stream = Stream.of(strArray);
		stream = Arrays.stream(strArray);
		// 3. Collections
		List<String> list = Arrays.asList(strArray);
		stream = list.stream();
	}

	@Test
	public void intStream() {
		IntStream.of(new int[] { 1, 2, 3 }).forEach(System.out::println);
		IntStream.range(1, 3).forEach(i -> System.out.println(i));
		IntStream.rangeClosed(1, 3).forEach(i -> System.out.println(i));
	}

	@Test
	public void convert() {
		// 1. Array
		String[] strArray1 = new String[] { "a", "b", "c" };
		Stream<String> stream = Stream.of(strArray1);
		String[] strArray2 = stream.toArray(String[]::new);
		Assert.assertArrayEquals(strArray1, strArray2);
		// 2. Collection
		stream = Stream.of(strArray1);
		List<String> list1 = stream.collect(Collectors.toList());
		stream = Stream.of(strArray1);
		List<String> list2 = stream.collect(Collectors.toCollection(() -> new ArrayList()));
		stream = Stream.of(strArray1);
		Set set1 = stream.collect(Collectors.toSet());
		stream = Stream.of(strArray1);
		Stack stack1 = stream.collect(Collectors.toCollection(() -> new Stack()));
		// 3. String
		stream = Stream.of(strArray1);
		String str = stream.collect(Collectors.joining()).toString();
		Assert.assertEquals("abc", str);
	}

	@Test
	public void map() {
		List<String> output = Stream.of("hello", "world").map(item -> item.toUpperCase()).collect(Collectors.toList());
		Assert.assertArrayEquals(new String[] { "HELLO", "WORLD" }, output.toArray(new String[] {}));
	}

	@Test
	public void pingfangshu() {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		List<Integer> nums2 = nums.stream().map(n -> n * n).collect(Collectors.toList());
		Assert.assertArrayEquals(new Integer[] { 1, 4, 9, 16 }, nums2.toArray(new Integer[] {}));
	}

	@Test
	public void flatMap() {
		Stream<List> inputStream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6));
		Stream<Integer> outputStream = inputStream.flatMap(childList -> childList.stream());
		Assert.assertEquals(6, outputStream.count());
	}

	@Test
	public void filterInt() {
		Integer[] sixNums = { 1, 2, 3, 4, 5, 6 };
		Assert.assertEquals(3, Stream.of(sixNums).filter(n -> n % 2 == 0).collect(Collectors.toList()).size());
	}

	@Test
	public void peek() {
		List list1 = Stream.of("one", "tow").filter(item -> item.length() > 2)
				.peek(e -> System.out.println("filtered value: " + e)).map(e -> e.toUpperCase())
				.peek(e -> System.out.println("mapped value: " + e)).collect(Collectors.toList());
		Assert.assertArrayEquals(new String[] { "ONE", "TOW" }, list1.toArray());
	}

	@Test
	public void reduce() {
		String concat = Stream.of("A", "B", "C").reduce("", (a, b) -> a.concat(b));
		Assert.assertEquals("ABC", concat);
		double minValue = Stream.of(-1.5, 1.0, -3.0, -2.0).reduce(Double.MAX_VALUE, Double::min);
		Assert.assertEquals(-3.0d, minValue);
	}

	@Test
	public void reduce2() {
		int sumValue = Stream.of(1, 2, 3, 4).reduce(0, Integer::sum);
		Assert.assertEquals(10, sumValue);
	}

	@Test
	public void testLimitAndSkip() {
		List<Person> persons = IntStream.range(1, 10000).mapToObj(n -> new Person(n, "name" + n))
				.collect(Collectors.toList());
		List<String> names = persons.stream().map(item -> item.getName()).limit(10).skip(3)
				.peek(e -> System.out.println(e)).collect(Collectors.toList());
		Assert.assertEquals(7, names.size());
	}

	private class Person {
		private int no;
		private String name;
		private int age;

		public Person(int age, String name) {
			this.setAge(age);
			this.setName(name);
		}

		public int getNo() {
			return no;
		}

		public void setNo(int no) {
			this.no = no;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	}

	@Test
	public void sorted() {
		Stream<Integer> stream = Stream.of(1, 4, 2, 10);
		List<Integer> list = stream.sorted().collect(Collectors.toList());
		Assert.assertArrayEquals(new Integer[] { 1, 2, 4, 10 }, list.toArray());
		stream = Stream.of(1, 4, 2, 10);
		list = stream.sorted((a, b) -> Integer.max(a, b)).collect(Collectors.toList());
		Assert.assertArrayEquals(new Integer[] { 1, 4, 2, 10 }, list.toArray());
	}

	@Test
	public void max() {
		Stream<Integer> stream = Stream.of(1, 4, 2, 10);
		Assert.assertEquals(1, stream.max((a, b) -> Integer.min(a, b)));
	}

	@Test
	public void word() {
		List<String> words = Stream.of("hello world hello").flatMap(line -> Stream.of(line.split(" ")))
				.filter(word -> word.length() > 0).map(word -> word.toLowerCase()).distinct().sorted()
				.peek(word -> System.out.println(word)).collect(Collectors.toList());
		Assert.assertArrayEquals(new String[] { "hello", "world" }, words.toArray(new String[] {}));
	}

	@Test
	public void match() {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(10, "name" + 1));
		persons.add(new Person(21, "name" + 2));
		persons.add(new Person(34, "name" + 3));
		persons.add(new Person(6, "name" + 4));
		persons.add(new Person(55, "name" + 5));
		boolean isAllAdult = persons.stream().allMatch(p -> p.getAge() > 18);
		Assert.assertFalse(isAllAdult);
		boolean isThereAnyChild = persons.stream().anyMatch(p -> p.getAge() < 12);
		Assert.assertTrue(isThereAnyChild);
		boolean isNone = persons.stream().noneMatch(p -> p.getAge() > 60);
		Assert.assertTrue(isNone);
	}

	@Test
	public void random() {
		Supplier<Integer> random = new Supplier<Integer>() {

			@Override
			public Integer get() {
				return new Random().nextInt();
			}
		};
		Stream.generate(random).limit(10).forEach(n -> System.out.println(n));
		Stream.generate(() -> System.nanoTime()).limit(10).forEach(System.out::println);
	}

	private class PersonSupplier implements Supplier<Person> {
		private int index = 0;

		@Override
		public Person get() {
			return new Person(new Random().nextInt(), "StormTestUser" + index);
		}

	}

	@Test
	public void supplier() {
		Stream.generate(new PersonSupplier()).limit(10).forEach(item -> {
			System.out.println(item.getName() + "," + item.getAge());
		});
	}

	@Test
	public void iterate() {
		Stream.iterate(0, n -> n + 3).limit(10).forEach(n -> System.out.println(n));
	}

	@Test
	public void grouping() {
		Map<Integer, List<Person>> personGroups = Stream.generate(new PersonSupplier()).limit(100)
				.collect(Collectors.groupingBy(p -> p.getAge()));
		personGroups.entrySet().stream().forEach(item -> {
			System.out.println("Age " + item.getKey() + " = " + item.getValue().size());
		});
	}

	@Test
	public void groupAdult() {
		Map<Boolean, List<Person>> groups = Stream.generate(new PersonSupplier()).limit(100)
				.collect(Collectors.groupingBy(p -> p.getAge() > 0));
		System.out.println("> 0: " + groups.get(true).size());
		System.out.println("< 0: " + groups.get(false).size());
	}
}
