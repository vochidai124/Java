package sapxep.java.normal;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class normal {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		System.out.println("so luong chuoi la :");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("bat dau nhap mang :");
		nhap(arr);
		// System.out.println("mang chua sap xep :");
		// xuat(arr);
		// System.out.println("mang sau khi sap xep giam :");
		// sapxepGiam(arr);
		// System.out.println("mang sau khi sap xep tang :");
		// sapxepTang(arr);
		// System.out.println("sap xem mang bang thuat toan bubbleSort :");
		// bubbleSort(arr);
		// System.out.println("so nho nhat trong mang arr: " + minArr(arr));
		// System.out.println("so nho nhat trong mang arr: " + maxArr(arr));
//		System.out.println("nhap so can tiem :");
//		int x = sc.nextInt();
//		if (timkiem(arr, x)) {
//			System.out.println("tim thay " + x + " vi tri : " + index(arr, x));
//		} else {
//			System.out.println("khong tim thay x");
//		}
		// tìm số lần xuất hiện của các phần tử
		Map<Integer, Integer> map=new TreeMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			addElement(map,arr[i]);
		}
		System.out.println("các phần tử xuất hiện");
		for(Integer key:map.keySet()){
			System.out.printf("%d xuất hiện %d lần\n",key,map.get(key));
		}
	}
	
	public static void addElement(Map<Integer, Integer> map,int element){
		if(map.containsKey(element)){
			int count=map.get(element)+1;
			map.put(element, count);
		}else{
			map.put(element, 1);
		}
	}
	
	public static boolean timkiem(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return true;
			}
		}
		return false;
	}

	public static int index(int[] arr, int x) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				index = i;
			}
		}
		return index;
	}

	public static void nhap(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("nhap phan tu thu %d : ", i + 1);
			arr[i] = sc.nextInt();
		}
	}

	public static void xuat(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	public static void sapxepGiam(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		xuat(arr);
	}

	public static void sapxepTang(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		xuat(arr);
	}

	public static void bubbleSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		xuat(arr);
	}

	public static int minArr(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int maxArr(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
