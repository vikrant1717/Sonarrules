void fun() {
  int[] arr = {1, 2, 3};
  int x = arr[3]; // Noncompliant: Valid indices are 0, 1 and 2
}

void fun2(int[] arr) {
  System.out.println(arr[arr.length]); // Noncompliant: Indexing starts at 0, hence array.length will always be an invalid index.
}
