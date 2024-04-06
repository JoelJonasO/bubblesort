package com.tinnova.bubblesort.bubblesort;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tinnova.bubblesort.bubblesort.model.BubbleSort;

@SpringBootApplication
public class BubblesortApplication {

	public static void main(String[] args) {
		SpringApplication.run(BubblesortApplication.class, args);

		BubbleSort bubbleSort = new BubbleSort();

		int[] array = { 5, 3, 2, 4, 7, 1, 0, 6 };

		System.out.println("Vetor antes da ordenacao: " + Arrays.toString(array));

		array = bubbleSort.sort(array);

		System.out.println("Vetor após a ordenacao: " + Arrays.toString(array));
	}

}
