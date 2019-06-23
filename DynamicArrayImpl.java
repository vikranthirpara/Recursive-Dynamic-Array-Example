package com.practise.dynamicarray;

public class DynamicArrayImpl {

	int array[];
	int size;
	static int count = 0;

	public DynamicArrayImpl(int size) {
		this.size = size;
		array = new int[size];
	}

	public void add(int elemnt) {
		if (count == 0) {
			array[count] = elemnt;
			count++;
			System.out.println("Element Added");
		} else if (count < size) {
			array[count] = elemnt;
			count++;
			System.out.println("Element Added");
		} else {
			growArraySize();
			add(elemnt);
		}
	}

	public void growArraySize() {
		int newArray[] = new int[size * 2];

		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}

		array = newArray;
		size = size * 2;
	}

	public void remove() {
		if (count <= 0) {
			System.out.println("No more elements left to remove");
		} else {
//			int decre = count;
//			decre--;
			array[count - 1] = 0;
			count--;
			System.out.println("Element removed");
		}
	}

	public static void main(String[] args) {
		DynamicArrayImpl dai = new DynamicArrayImpl(2);

		dai.add(2);
		dai.add(3);
		dai.add(4);
//		dai.add(54);

		dai.remove();
		dai.remove();
		dai.remove();
		dai.remove();
	}

}
