
<h1>Sorting Algorithms</h1>

<p>This README provides an overview and explanation of three common sorting algorithms.</p>

<h2>Bubble Sort</h2>

<p>Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted. Bubble Sort is named for the way smaller elements "bubble" to the top of the list with each iteration.</p>

<h4>Algorithm:</h4>

<ol>
  <li>Start at the beginning of the list.</li>
  <li>Compare the first two elements. If the first is greater than the second, swap them.</li>
  <li>Move to the next pair of elements and repeat step 2.</li>
  <li>Continue iterating through the list until no more swaps are needed.</li>
</ol>

<h4>Time Complexity:</h4>
<ul>
  <li>Best Case: O(n) - when the list is already sorted.</li>
  <li>Average Case: O(n^2)</li>
  <li>Worst Case: O(n^2) - when the list is sorted in reverse order.</li>
</ul>

<h2>Selection Sort</h2>

<p>Selection Sort is an in-place comparison sorting algorithm. It divides the input list into two parts: the sublist of items already sorted and the sublist of items remaining to be sorted. It repeatedly finds the smallest element from the unsorted sublist and moves it to the beginning of the sorted sublist.</p>

<h4>Algorithm:</h4>

<ol>
  <li>Find the smallest element in the unsorted portion of the list.</li>
  <li>Swap it with the leftmost unsorted element.</li>
  <li>Move the sublist boundaries one element to the right.</li>
</ol>

<h4>Time Complexity:</h4>
<ul>
  <li>Best Case: O(n^2)</li>
  <li>Average Case: O(n^2)</li>
  <li>Worst Case: O(n^2)</li>
</ul>

<h2>Merge Sort</h2>

<p>Merge Sort is a divide and conquer algorithm. It recursively divides the input list into two halves, sorts them independently, and then merges them back together. It is notable for its stability and predictable performance.</p>

<h4>Algorithm:</h4>

<ol>
  <li>Divide the unsorted list into n sublists, each containing one element.</li>
  <li>Repeatedly merge sublists to produce new sorted sublists until there is only one sublist remaining.</li>
</ol>

<h4>Time Complexity:</h4>
<ul>
  <li>Best Case: O(n log n)</li>
  <li>Average Case: O(n log n)</li>
  <li>Worst Case: O(n log n)</li>
</ul>

<p>Merge Sort's performance makes it a popular choice for sorting large datasets efficiently.</p>
