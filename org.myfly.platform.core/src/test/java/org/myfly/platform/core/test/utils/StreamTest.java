package org.myfly.platform.core.test.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Stack;
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

		public Person(int no, String name) {
			this.setNo(no);
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
}
