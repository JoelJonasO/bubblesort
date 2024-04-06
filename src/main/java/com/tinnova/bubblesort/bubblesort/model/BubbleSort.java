package com.tinnova.bubblesort.bubblesort.model;

public class BubbleSort {
  /**
   * Ordena um vetor utilizando o algoritmo Bubble Sort.
   * 
   * @param array O vetor a ser ordenado.
   */
  public int[] sort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
      // n - i - 1 -> usado para percorrer até o penúltimo elemento
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }

    return array;
  }
}
